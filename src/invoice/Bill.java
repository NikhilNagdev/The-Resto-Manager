package invoice;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static invoice.OffsetConstants.*;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 *
 * @author jains
 */


public class Bill {

    
    public Bill(String path){
        this.path = path;
        init();
    }
    public Bill(){
        init();
    }
    
    //Initialization
    private void init(){
        orders = new ArrayList<>();
//        invoiceNo = getNextInvoiceNo();
        file = new File(this.path + "\\Invoice" + invoiceNo + ".pdf");
        loadPDFFile(new File("Invoice.pdf"));
        CGSTAmount = 0;
        SGSTAmount = 0;
        totalGSTAmount = 0;
        totalPriceExcludingGST = 0;
        totalPriceIncludingGST = 0;
    }
//    private Object readInvoiceNo(){;
//        try {
//            ois = new ObjectInputStream(new FileInputStream(objPath));
//            return ois.readObject();
//        } catch (Exception e) {
//            System.out.println("ex in " + e);
//        }
//        return null;
//    }
//    private void write(){
//        try {
//            oos = new ObjectOutputStream(new FileOutputStream(objPath));
//            oos.writeObject(invoiceNo+"");
//        } catch (Exception e) {
//            System.out.println("Ex in " + e);
//        }
//    }

    public void setPath(String path) {
        this.path = path;
    }
    
    // Getters and Setters
       public float getCGSTAmount() {
        return CGSTAmount;
    }

    public void setCGSTAmount(float CGSTAmount) {
        this.CGSTAmount = CGSTAmount;
    }

    
    public float getSGSTAmount() {
        return SGSTAmount;
    }

    public void setSGSTAmount(float SGSTAmount) {
        this.SGSTAmount = SGSTAmount;
    }

    
    public float getTotalPriceExcludingGST() {
        return totalPriceExcludingGST;
    }

    public float getTotalPriceIncludingGST() {
        return totalPriceIncludingGST;
    }
    
    
    
    public float getTotalGSTAmount(){
        if(totalGSTAmount>0)
            return totalGSTAmount;
        return -1;
    }
    
    
    //Calculation work
    private void calculateCGSTAmount(){
        CGSTAmount = calculateTax(totalPriceExcludingGST, CGST);
    }
    private void calculateSGSTAmount(){
        SGSTAmount = calculateTax(totalPriceExcludingGST, SGST);
    }
    
    private float calculateTax(float totalAmount, float percent){
        float tax = 0;
        tax = (totalAmount * percent)/100;
        return tax;
    }
    private float calculateTotalTax(){
        return (totalGSTAmount = CGSTAmount + SGSTAmount);
    }
    private float calculateTotalPriceFromOrders(){
        float totalPriceExcludingGST = 0;
        for (Order p : orders){
            totalPriceExcludingGST += (p.price * p.quantity);
        }
        return totalPriceExcludingGST;
    }
    private float calculateTotalPriceIncludingGST(){
        if(totalPriceExcludingGST > 0 && CGSTAmount > 0 && SGSTAmount > 0){
            return (totalPriceIncludingGST = totalPriceExcludingGST + calculateTotalTax());
        }
        return -1;
    }
    
    
    @Override
    public String toString() {
        return "Invoice{" + "path=" + path + ", invoiceNo=" + invoiceNo + '}';
    }

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public void addOrder(String foodName,double price,int quantity){
         orders.add(new Order(foodName, price, quantity));
    }
    public void addOrder(Order pd){
        addOrder(pd.foodName,pd.price,pd.quantity);
    }
//    public void addOrder(ResultSet rs){
//        try {
//            while(rs.next()){
//                addOrder(rs.getString("foodName"),rs.getDouble("price"),rs.getInt("quantity"));
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e + "in addOrderDetails");
//        }
//    }

//    private int getNextInvoiceNo() {
//        try {
//            ResultSet rs = DatabaseManagement.select("SELECT * FROM invoice");
//            rs.last();
//            return rs.getInt("invoiceno");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e + "in getNextInvoiceNo");
//        }
//        return -1;
////        return DatabaseManagement.getNumRows("invoice");
//    }
    private class Order{

        private String foodName;
        private int quantity;
        private double price;

        public Order(String foodName, double price, int quantity) {
            this.foodName = foodName;
            this.price = price;
            this.quantity = quantity;
        }
    }
    
    
    //PDF Writing
    private void loadPDFFile(File file){
        try {
            templatePDF = PDDocument.load(file);
            contentStream = new PDPageContentStream(templatePDF,templatePDF.getPage(0),PDPageContentStream.AppendMode.APPEND,false);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e + " in loadPDFFile");
        }
    }
    public boolean createInvoice(){
        if(orders != null){
            try {
                
                writeInvoiceNo();
                
                contentStream.setFont(PDType1Font.TIMES_ROMAN, 14);
                contentStream.setLeading(22);
                
                writeCustomerDetails();
                int count = 0;
                for(Order p : orders){
                    writeOrderDetails(p,count++);
                }
                totalPriceExcludingGST = calculateTotalPriceFromOrders();
                writeCGSTAmount();
                writeSGSTAmount();
                writeTotalPriceIncludingGST();
                
                saveAndClose();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e + " in createInvoice");
            }
            return true;
        }
        return false;
    }
    private void writeCGSTAmount(){
        calculateCGSTAmount();
        try {
            contentStream.beginText();
            contentStream.newLineAtOffset(CGSTAMOUNTX, CGSTAMOUNTY);
            contentStream.showText("" + getCGSTAmount());
            contentStream.endText();
        } catch (Exception e) {
            System.out.println(e + " in writeCGST");
        }
    }
    private void writeSGSTAmount(){
        calculateSGSTAmount();
        try {
            contentStream.beginText();
            contentStream.newLineAtOffset(SGSTAMOUNTX, SGSTAMOUNTY);
            contentStream.showText("" + getSGSTAmount());
            contentStream.endText();
        } catch (Exception e) {
            System.out.println(e + " in writeSGST");
        }
    }
    private void writeTotalPriceIncludingGST(){
        calculateTotalPriceIncludingGST();
        try {
            contentStream.beginText();
            contentStream.newLineAtOffset(TOTALPRICEX, TOTALPRICEY);
            contentStream.showText("" + getTotalPriceIncludingGST());
            contentStream.endText();
        } catch (Exception e) {
            System.out.println(e + " in writeSGST");
        }
    }
    private void writeOrderDetails(Order p, int productNum) throws IOException{
        /**
         *once a newLineOffset method is called from (0,0) location between a text block i.e in between beginText and endText method it sets the location from the current position when it is recalled
         * Once a text block is finished and restarted the offset is reset to (0,0)
         */
        if(p != null && !isInvoiceEnded(productNum)){
            contentStream.beginText();
            contentStream.newLineAtOffset(PRODUCTNAMEX,PRODUCTNAMEY - (productNum * 22));
            contentStream.showText(p.foodName + " ");
            contentStream.newLineAtOffset(PRODUCTNAMEX + 230, 0);
            contentStream.showText(p.quantity + "");
            contentStream.newLineAtOffset(PRODUCTNAMEX + 160, 0);
            contentStream.showText(p.price + "");
            contentStream.endText();
        }
    }
    private void writeCustomerDetails() throws IOException{
            contentStream.beginText();
            contentStream.newLineAtOffset(CUSTOMERDETAILSX,CUSTOMERDETAILSY);
            contentStream.showText("Hotel Elegance");
            contentStream.newLine();
            contentStream.showText("99999-99999");
            contentStream.newLine();
            contentStream.showText("elegance.com");
            contentStream.endText();
    }
    private boolean isInvoiceEnded(int numOfOrder){
        if(numOfOrder >= 16)
            return true;
        return false;
    }
    private void writeInvoiceNo() throws IOException{
        contentStream.beginText();
        contentStream.setFont(PDType1Font.TIMES_ROMAN, 20);
        contentStream.newLineAtOffset(INVOICENOX,INVOICENOY);
        contentStream.showText(" " + invoiceNo);
        contentStream.endText();
    }
    private void saveAndClose(){
        try {
            contentStream.close();
            templatePDF.save(file);
            templatePDF.close();
        } catch (IOException e) {
            System.out.println(e+ " in saveAndClose");
        }
    }
    private PDDocument templatePDF = null;
    private PDPageContentStream contentStream = null;
    private String path = "C:\\Users\\admin\\Desktop";
    private int invoiceNo = -1;
    private List<Order> orders = null;
    private File file = null;
    public static final float CGST = 2.5F;
    public static final float SGST = 2.5F;
    private float CGSTAmount;
    private float SGSTAmount;
    private float totalGSTAmount;
    private float totalPriceExcludingGST;
    private float totalPriceIncludingGST;
}