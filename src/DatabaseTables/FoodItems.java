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
public class FoodItems {

    //Constructor
    /**
     * This constructor initializes the object of Connection class from
     * accessing the database.
     */
    public FoodItems() {
        conn = MySqlConnect.connectDB();
    }

    //Select operations for fooditems table in the database
    /**
     * This method will return the price of the food item
     *
     * @param foodName it is the name of the food for which the price has to be
     * returned
     */
    public String getFoodPrice(String foodName) {
        String query = "SELECT foodprice FROM fooditems WHERE foodname = '" + foodName + "'";
        try {
            ResultSet rs = conn.prepareStatement(query).executeQuery();
            rs.next();
            return (rs.getDouble(1) + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Issue while fetching price: " + e);
        }
        return null;
    }

    /**
     * This method will return the id of the food item
     *
     * @param foodName it is the name of the food for which the id has to be
     * returned
     */
    public int getFoodID(String foodName) {
        String query = "SELECT foodid FROM fooditems WHERE foodname = '" + foodName + "'";
        int col = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            rs.next();
            col = rs.getInt(1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Isuue while fetching food id: " + e);
        }
        return col;
    }

    /**
     * This method will return the food name from the food items table in the
     * database for searching operations
     *
     * @param foodName the food name to be searched
     */
    public ResultSet getFoodNameLike(String foodName) {
        ResultSet rs = null;
        String searchQuery = "SELECT foodname FROM fooditems WHERE foodname like '%" + foodName + "%'";
        try {
            PreparedStatement ps = conn.prepareStatement(searchQuery);
            rs = ps.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Issue while seraching food " + e);
        }
        return rs;
    }

    /**
     * This method will return all the food items from the fooditems table in
     * the database.
     */
    public ResultSet getFoodItems() {
        String query = "SELECT foodname FROM fooditems";
        try {
            return (conn.prepareStatement(query).executeQuery());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Issue while getting food items: " + e);
        }
        return null;
    }

    /**
     * This method will delete the food name, food id, food category and price
     * of the food from fooditems table according to the foodname.
     *
     * @param foodName name of the food for which the food id, food price, food
     * category has to be deleted
     */
    public void deleteFoodItem(String foodName) {
        String query = "DELETE FROM fooditems WHERE foodname = '" + foodName + "'";
        try {
            conn.prepareStatement(query).execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Issue while deleting food item: " + e);
        }
    }

    //Insert operations
    public void insertIntoFooditems(String foodName, int foodCategoryID, double foodPrice) {
        String query = "INSERT INTO fooditems(foodname, foodcategory, foodprice) VALUES (?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, foodName);
            ps.setInt(2, foodCategoryID);
            ps.setDouble(3, foodPrice);
            ps.execute();
            JOptionPane.showMessageDialog(null, "New food item added sucessfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Issue while inserting orders: " + e);
        }
    }

    //Update operations
    public void updateFoodItems(String foodName, int foodCategoryID, double foodPrice, int foodID) {
        String query = "UPDATE fooditems SET foodname=?, foodcategory=?, foodprice=? WHERE foodid = " + foodID;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, foodName);
            ps.setInt(2, foodCategoryID);
            ps.setDouble(3, foodPrice);
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Issue while updating records: " + e);
        }
    }

    //Variable declarations
    private Connection conn = null;
    //End of variable declarations
}
