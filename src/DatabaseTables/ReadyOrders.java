package DatabaseTables;

import DatabaseTables.MySqlConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author admin
 */
public class ReadyOrders {

    public ReadyOrders(){
        conn = MySqlConnect.connectDB();
    }
    
    //Select operations
    
    /**
     * This method will return food name, quantity of the food and
     * table no for which the order is ready in the readyorders table.
     * @param tableNO table no for which the food name, quantity has to be returned.
     */
    public ResultSet getReadyFoodOrders(int tableNO) {
        String query = "SELECT * FROM readyorders where tableno = " + tableNO;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Issue while fetching ready orders" + e);
        }
        return null;
    }
    
    /**
     * This method will delete food name, quantity and table no from readyorders table in the database
     * @param foodName name of the food for which data has to be deleted
     * @param tableNo table no for which the data has to be deleted.
     */
    public void deleteOrder(String foodName, int tableNo) {
        String sqlQuery = "DELETE FROM readyorders where foodname = '" + foodName + "' AND tableno = " + tableNo;
        System.out.println(sqlQuery);
        try {
            conn.prepareStatement(sqlQuery).execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Issue while deleting orders: " + e);
        }
    }

    /**
     * This method will truncate the readyorders table.
     */
    public void truncTable() {
        String query = "TRUNCATE TABLE readyorders";
        try {
            System.out.println(conn + "     " + query);
            conn.prepareStatement(query).execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error while truncating: " + e);
        }
    }
    
    //Variable declarations
    Connection conn = null;
    //End of variable declarations
    
}
