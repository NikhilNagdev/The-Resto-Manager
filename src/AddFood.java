
import DatabaseTables.FoodCategory;
import DatabaseTables.FoodItems;
import DatabaseTables.MySqlConnect;
import constants.MyConstants;

import java.awt.Color;
import java.awt.Point;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Nikhil
 */
public class AddFood extends javax.swing.JFrame {

    //Variable declarations
    private Connection conn = null;
    private FoodItems foodItems = null;
    private int foodID = 0;
    private FoodCategory foodCategory = null;
    //End of variable declarations

    //Constructor
    /**
     * This constructor will create a new JFrame through which we can add food
     * items in the menu. The constructor initializes all the components of the
     * JFrame. It sets all the lists in the JFrame
     */
    public AddFood() {
        this.setResizable(false);
        this.setIconImage(MyConstants.FRAMELOGO.getImage());
        initComponents();
        foodItems = new FoodItems();
        foodCategory = new FoodCategory();
        conn = MySqlConnect.connectDB();
        setFoodCategoryList();
        setFoodItemsList();
        setCategoryComboBox();
        addDocumentListenerToSearch();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblFoodPrice1 = new javax.swing.JLabel();
        txtFoodPrice = new javax.swing.JTextField();
        txtFoodName = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnNew2 = new javax.swing.JButton();
        btnAdd2 = new javax.swing.JButton();
        btnUpdate2 = new javax.swing.JButton();
        categoryComboBox = new javax.swing.JComboBox<>();
        txtFoodSearch = new javax.swing.JTextField();
        lblFoodName = new javax.swing.JLabel();
        lblFoodPrice = new javax.swing.JLabel();
        btnAddCategory = new javax.swing.JButton();
        txtCategorySearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        foodItemsList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        categoryList = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add food items");
        setBackground(new java.awt.Color(38, 51, 61));

        jPanel1.setBackground(new java.awt.Color(38, 51, 61));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\TheRestoManager\\images\\bell-covering-hot-dish.png")); // NOI18N

        jPanel4.setBackground(new java.awt.Color(38, 51, 61));

        lblFoodPrice1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblFoodPrice1.setForeground(new java.awt.Color(255, 255, 255));
        lblFoodPrice1.setText("Enter Food Price:");

        txtFoodPrice.setBackground(new java.awt.Color(38, 51, 61));
        txtFoodPrice.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtFoodPrice.setForeground(new java.awt.Color(255, 255, 255));
        txtFoodPrice.setBorder(null);
        txtFoodPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFoodPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFoodPriceFocusLost(evt);
            }
        });

        txtFoodName.setBackground(new java.awt.Color(38, 51, 61));
        txtFoodName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtFoodName.setForeground(new java.awt.Color(255, 255, 255));
        txtFoodName.setBorder(null);
        txtFoodName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFoodNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFoodNameFocusLost(evt);
            }
        });
        txtFoodName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFoodNameKeyTyped(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(38, 51, 61));

        btnNew2.setBackground(new java.awt.Color(110, 218, 161));
        btnNew2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnNew2.setText("New");
        btnNew2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNew2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNew2MouseExited(evt);
            }
        });

        btnAdd2.setBackground(new java.awt.Color(110, 218, 161));
        btnAdd2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnAdd2.setText("Add");
        btnAdd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdd2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdd2MouseExited(evt);
            }
        });
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2btnAddActionPerformed(evt);
            }
        });

        btnUpdate2.setBackground(new java.awt.Color(110, 218, 161));
        btnUpdate2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnUpdate2.setText("Update");
        btnUpdate2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdate2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdate2MouseExited(evt);
            }
        });
        btnUpdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate2btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnNew2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnUpdate2)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew2)
                    .addComponent(btnAdd2)
                    .addComponent(btnUpdate2))
                .addGap(15, 15, 15))
        );

        categoryComboBox.setBackground(new java.awt.Color(38, 51, 61));
        categoryComboBox.setForeground(new java.awt.Color(255, 255, 255));

        txtFoodSearch.setBackground(new java.awt.Color(38, 51, 61));
        txtFoodSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtFoodSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 218, 161)));

        lblFoodName.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblFoodName.setForeground(new java.awt.Color(255, 255, 255));
        lblFoodName.setText("Enter Food Name:");

        lblFoodPrice.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblFoodPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblFoodPrice.setText("Select Category:");

        btnAddCategory.setBackground(new java.awt.Color(110, 218, 161));
        btnAddCategory.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnAddCategory.setText("+Category");
        btnAddCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddCategoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddCategoryMouseExited(evt);
            }
        });
        btnAddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCategoryActionPerformed(evt);
            }
        });

        txtCategorySearch.setBackground(new java.awt.Color(38, 51, 61));
        txtCategorySearch.setForeground(new java.awt.Color(255, 255, 255));
        txtCategorySearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 218, 161)));

        foodItemsList.setBackground(new java.awt.Color(38, 51, 61));
        foodItemsList.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        foodItemsList.setForeground(new java.awt.Color(255, 255, 255));
        foodItemsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodItemsListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(foodItemsList);

        categoryList.setBackground(new java.awt.Color(38, 51, 61));
        categoryList.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        categoryList.setForeground(new java.awt.Color(255, 255, 255));
        categoryList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(categoryList);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Search:");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Search:");

        btnDelete.setBackground(new java.awt.Color(110, 218, 161));
        btnDelete.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletebtnDeleteActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(38, 51, 61));
        jSeparator1.setForeground(new java.awt.Color(255, 164, 0));
        jSeparator1.setOpaque(true);

        jSeparator2.setBackground(new java.awt.Color(38, 51, 61));
        jSeparator2.setForeground(new java.awt.Color(255, 164, 0));
        jSeparator2.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(47, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFoodName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFoodPrice1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFoodPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(txtFoodName)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFoodSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(lblFoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(228, 228, 228)
                            .addComponent(btnAddCategory))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCategorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(277, 277, 277))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11)))))
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFoodName))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFoodPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(54, 54, 54)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtFoodSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(186, 186, 186)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddCategory)
                        .addComponent(lblFoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)
                    .addComponent(txtCategorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdd2btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2btnAddActionPerformed
                                       //Name of the food
        foodItems.insertIntoFooditems(txtFoodName.getText(),
                                       //Category id of food
                                       foodCategory.getFoodCategoryID(categoryComboBox.getSelectedItem().toString()),
                                       //Price of the food
                                       Double.parseDouble(txtFoodPrice.getText()));
        setFoodItemsList();
    }//GEN-LAST:event_btnAdd2btnAddActionPerformed

    private void btnUpdate2btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate2btnUpdateActionPerformed
                                  //Name of the food
        foodItems.updateFoodItems(txtFoodName.getText(), 
                                  //Category id of food
                                  foodCategory.getFoodCategoryID((String)categoryComboBox.getSelectedItem()), 
                                  //Price of the food
                                  Double.parseDouble(txtFoodPrice.getText()), 
                                  //Id of food
                                  foodID);
        setFoodCategoryList();
        setFoodItemsList();
    }//GEN-LAST:event_btnUpdate2btnUpdateActionPerformed

    /**
     * This method is used to delete the food category and the name of the food in the menu.
     */
    private void btnDeletebtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletebtnDeleteActionPerformed
        if(txtFoodName.getText().equals("")){
            int result = JOptionPane.showConfirmDialog(null, "Do you only want to delete the category?");
            if(result == JOptionPane.YES_OPTION){
                foodCategory.deleteCategory(categoryList.getSelectedValue());
            }
            else{
                JOptionPane.showMessageDialog(null, "Please select the food item to be deleted");
            }
        }
        else{
            foodItems.deleteFoodItem(txtFoodName.getText());
        }
        setFoodCategoryList();
        setFoodItemsList();
        setCategoryComboBox();
        clearFields();
    }//GEN-LAST:event_btnDeletebtnDeleteActionPerformed

    private void btnAddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCategoryActionPerformed
        String txt = JOptionPane.showInputDialog(null, "Enter the name of category", "Food Category", JOptionPane.OK_CANCEL_OPTION);
        if(txt!=null){
            String query = "INSERT INTO foodcategory(cat_name) VALUES (?)";
            try {
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, txt);
                ps.execute();
                setFoodCategoryList();
                setCategoryComboBox();
                JOptionPane.showMessageDialog(null, "Food category sucessfully added");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Issue while inserting food item: " + e);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please enter the name of category", "", JOptionPane.ERROR_MESSAGE);
        }
        setCategoryComboBox();
        setFoodCategoryList();
    }//GEN-LAST:event_btnAddCategoryActionPerformed

    private void foodItemsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodItemsListMouseClicked
        fillFields();
        foodID  = foodItems.getFoodID(txtFoodName.getText());
    }//GEN-LAST:event_foodItemsListMouseClicked

    private void categoryListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryListMouseClicked
        categoryComboBox.setSelectedIndex(categoryList.getSelectedIndex());
        Vector<String> foodCategory = new Vector<>();
        String query = "SELECT foodname FROM fooditems where foodcategory = ?" ;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, this.foodCategory.getFoodCategoryID(categoryList.getSelectedValue()));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                foodCategory.add(rs.getString(1));
            }
            foodItemsList.removeAll();
            foodItemsList.setListData(foodCategory);
            clearFields();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_categoryListMouseClicked

    private void btnNew2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNew2MouseEntered
        mouseEnteredAnimation(btnNew2);
    }//GEN-LAST:event_btnNew2MouseEntered

    private void btnNew2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNew2MouseExited
        mouseExitedAnimation(btnNew2);
    }//GEN-LAST:event_btnNew2MouseExited

    private void btnAdd2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdd2MouseEntered
        mouseEnteredAnimation(btnAdd2);
    }//GEN-LAST:event_btnAdd2MouseEntered

    private void btnAdd2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdd2MouseExited
        mouseExitedAnimation(btnAdd2);
    }//GEN-LAST:event_btnAdd2MouseExited

    private void btnUpdate2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdate2MouseEntered
        mouseEnteredAnimation(btnUpdate2);
    }//GEN-LAST:event_btnUpdate2MouseEntered

    private void btnUpdate2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdate2MouseExited
        mouseExitedAnimation(btnUpdate2);
    }//GEN-LAST:event_btnUpdate2MouseExited

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        mouseEnteredAnimation(btnDelete);
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        mouseExitedAnimation(btnDelete);
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnAddCategoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCategoryMouseEntered
        mouseEnteredAnimation(btnAddCategory);
    }//GEN-LAST:event_btnAddCategoryMouseEntered

    private void btnAddCategoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCategoryMouseExited
        mouseExitedAnimation(btnAddCategory);
    }//GEN-LAST:event_btnAddCategoryMouseExited

    private void txtFoodNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFoodNameKeyTyped
        if(Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_txtFoodNameKeyTyped

    private void txtFoodNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFoodNameFocusGained
        jSeparator1.setBackground(Color.decode("#FFA400"));
        jSeparator1.setSize(264, 1);
    }//GEN-LAST:event_txtFoodNameFocusGained

    private void txtFoodNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFoodNameFocusLost
        jSeparator1.setBackground(Color.decode("#6edaa1"));
    }//GEN-LAST:event_txtFoodNameFocusLost

    private void txtFoodPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFoodPriceFocusGained
        jSeparator2.setBackground(Color.decode("#FFA400"));
        jSeparator2.setSize(264, 1);
    }//GEN-LAST:event_txtFoodPriceFocusGained

    private void txtFoodPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFoodPriceFocusLost
        jSeparator2.setBackground(Color.decode("#6ed9a1"));
    }//GEN-LAST:event_txtFoodPriceFocusLost
    
    
    /**
     * This method is used to fill the field by specified selected item in food items list.
     */
    public void fillFields(){
        txtFoodName.setText(foodItemsList.getSelectedValue());
        txtFoodPrice.setText(foodItems.getFoodPrice(foodItemsList.getSelectedValue()));
        categoryComboBox.setSelectedIndex(foodCategory.getCategoryID(foodItemsList.getSelectedValue())-1);
    }
    
    /**
     * This method is used to set all fields to blank.
     */
    public void clearFields(){
        txtFoodName.setText("");
        txtFoodPrice.setText("");
        categoryComboBox.setSelectedIndex(-1);
    }
    
    /**
     * This method is used to set the list of food category from the food category table.
     */
    public void setFoodCategoryList(){
        Vector<String> foodCategory = new Vector<>();
        try {
            ResultSet rs = this.foodCategory.getFoodCategory();
            while(rs.next()){
                foodCategory.add(rs.getString(1));
            }
            categoryList.setListData(foodCategory);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Issue while setting food category list: " + e);
        }
    }
    
    /**
     * This method is used to set the list of food items from the food items table.
     */
    public void setFoodItemsList(){
        Vector<String> food = new Vector<>();
        try{
            ResultSet rs = foodItems.getFoodItems();
            while(rs.next()){
                food.add(rs.getString(1));
            }
            foodItemsList.setListData(food);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Issue while setting food items list: " + e);
        }
    }
    
    /**
     * This method is used to set the contents of combo box from the food category table.
     */
    public void setCategoryComboBox(){
        categoryComboBox.removeAllItems();
        try {
            ResultSet rs = foodCategory.getFoodCategory();
            while(rs.next()){
                categoryComboBox.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Issue while setting food category combo box: " + e);
        }
    }
    
    private void addDocumentListenerToSearch() {
        txtFoodSearch.getDocument().addDocumentListener(new DocumentListener(){
            @Override
        public void insertUpdate(javax.swing.event.DocumentEvent e) {
                searchFood();
            }

            @Override
        public void removeUpdate(javax.swing.event.DocumentEvent e) {
                searchFood();
            }

            @Override
        public void changedUpdate(javax.swing.event.DocumentEvent e) { }
        });
        
        
        txtCategorySearch.getDocument().addDocumentListener(new DocumentListener(){
            @Override
        public void insertUpdate(javax.swing.event.DocumentEvent e) {
                searchCategory();
            }

            @Override
        public void removeUpdate(javax.swing.event.DocumentEvent e) {
                searchCategory();
            }
            @Override
        public void changedUpdate(javax.swing.event.DocumentEvent e) { }
        });
    }
    
     /**
     * This method is used for searching the particular key in the food category table in the database.
     */
    public void searchFood(){
        String key = txtFoodSearch.getText();
        if(!key.equals("")){
            try{
                ResultSet rs = foodItems.getFoodNameLike(key);
                Vector<String> items = new Vector<>();
                while(rs.next()){
                    items.add(rs.getString(1));
                }
                foodItemsList.removeAll();
                foodItemsList.setListData(items);   
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Issue while seraching: " + e);
            }
        } else {
            try{
                ResultSet rs = foodItems.getFoodNameLike(key);
                Vector<String> items = new Vector<>();
                while(rs.next()){
                    items.add(rs.getString(1));
                }
                foodItemsList.removeAll();
                foodItemsList.setListData(items);   
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Issue while seraching: " + e);
            }
        }   
    }
    
    /**
     * This method is used for searching the particular key in the food category table in the database.
     */
     public void searchCategory() {
        String key = txtCategorySearch.getText();
        if(!key.equals("")){
            try{
                ResultSet rs = foodCategory.getFoodCategoryNameLike(key);
                Vector<String> items = new Vector<>();
                while(rs.next()){
                    items.add(rs.getString(1));
                }
                categoryList.removeAll();
                categoryList.setListData(items);   
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Issue while seraching category: " + e);
            }
        }else{
            try{
                ResultSet rs = foodCategory.getFoodCategoryNameLike(key);
                Vector<String> items = new Vector<>();
                while(rs.next()){
                    items.add(rs.getString(1));
                }
                categoryList.removeAll();
                categoryList.setListData(items);   
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Issue while seraching: " + e);
            }
        }   
    }
    
     public void mouseEnteredAnimation(JButton jb) {
        jb.setSize(jb.getWidth() + 10, jb.getHeight() + 7);
        Point p = jb.getLocation();
        jb.setLocation((int) p.getX() - 5, (int) p.getY() - 3);
    }

    public void mouseExitedAnimation(JButton jb) {
        jb.setSize(jb.getWidth() - 10, jb.getHeight() - 7);
        Point p = jb.getLocation();
        jb.setLocation((int) p.getX() + 5, (int) p.getY() + 3);
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                



}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddFood.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFood.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFood.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFood.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnAddCategory;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew2;
    private javax.swing.JButton btnUpdate2;
    private javax.swing.JComboBox<String> categoryComboBox;
    private javax.swing.JList<String> categoryList;
    private javax.swing.JList<String> foodItemsList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblFoodName;
    private javax.swing.JLabel lblFoodPrice;
    private javax.swing.JLabel lblFoodPrice1;
    private javax.swing.JTextField txtCategorySearch;
    private javax.swing.JTextField txtFoodName;
    private javax.swing.JTextField txtFoodPrice;
    private javax.swing.JTextField txtFoodSearch;
    // End of variables declaration//GEN-END:variables
 }
