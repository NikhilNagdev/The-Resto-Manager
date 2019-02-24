package DatabaseTables;

import DatabaseTables.MySqlConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Nikhil
 */
public class FoodToBeMade {

    public FoodToBeMade() {
        conn = MySqlConnect.connectDB();
    }

    //Select operations
    
    /**
     * This method will return food name, quantity of the food to be made and
     * table no from which the order has been placed
     */
    public ResultSet getFoodItemsToBeMade() {
        try {
            String query = "SELECT * FROM foodtobemade";
            PreparedStatement ps = conn.prepareStatement(query);
            return ps.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Issue while setting pending orders: " + e);
        }
        return null;
    }
    
    /**
     * This is an overloaded method which will return food name, quantity of the food to be made and
     * table no from which the order has been placed.
     * @param tableNo table no for which the food name and the quantity of the food has to be returned.
     */
    public ResultSet getFoodItemsToBeMade(int tableNo) {
        String query = "SELECT * FROM foodtobemade where tableno = " + tableNo;
        try {
            return conn.prepareStatement(query).executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Issue while getting food to be made " + e);
        }
        return null;
    }
    
    //Delete operations
    
    /**
     * This method will delete the food name, quantity and table no from the table fooditemstobemade in the database.
     * @param foodName name of the food for which the data has to be deleted.
     */
    public void deleteFromFoodToBeMade(String foodName) {
        try {
            String query = "DELETE FROM foodtobemade where foodname = '" + foodName + "'";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Issue while deleting ready orders" + e);
        }
    }
    
    /**
     * This method will delete the food name, quantity and table no from the table fooditemstobemade in the database.
     * @param tableNo table no for which the data has to be deleted.
     */
    public void deleteOrders(int tableNo) {
        String query = "DELETE FROM foodtobemade where tableno = " + tableNo;
        String sqlQuery = "DELETE FROM readyorders where tableno = " + tableNo;
        try {
            conn.prepareStatement(query).execute();
            conn.prepareStatement(sqlQuery).execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Issue while deleting orders: " + e);
        }
    }

    public ResultSet search(String key){
        String searchQuery = "SELECT foodname FROM foodtobemade WHERE foodname like '%" + key + "%'";
        try {
            PreparedStatement ps = conn.prepareStatement(searchQuery);
            return ps.executeQuery();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Issue while searching: " + e);
        }
        return null;
    }


    //Variable declarations
    private Connection conn = null;
    //End of variable declarations
}
