package DatabaseTables;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Nikhil
 */
public class FoodCategory {

    public FoodCategory() {
        conn = MySqlConnect.connectDB();
    }
    
    //Select operations
    
    public int getCategoryID(String foodName) {
        String query = "SELECT foodcategory FROM fooditems WHERE foodname = '" + foodName + "'";
        System.out.println("QUERY: " + query);
        System.out.println("QUERY: " + conn);
        try {
            ResultSet rs = conn.prepareStatement(query).executeQuery();
            rs.next();
            return (rs.getInt(1));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Issue while getting category id: " + e);
        }
        return 0;
    }
    
    //This method will return the food category id as specified in database
    public int getFoodCategoryID(String category) {
        String query = "SELECT cat_id FROM foodcategory WHERE cat_name = '" + category + "'";
        System.out.println(query);
        int col = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            rs.next();
            System.out.println(rs.getInt("cat_id"));
            col = rs.getInt("cat_id");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Isuue while fetching category id: " + e);
        }
        return col;
    }

    public ResultSet getFoodCategoryNameLike(String cat_Name) {
        ResultSet rs = null;
        String searchQuery = "SELECT cat_name FROM foodcategory WHERE cat_name like '%" + cat_Name + "%'";
        try {
            PreparedStatement ps = conn.prepareStatement(searchQuery);
            rs = ps.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Issue while seraching " + e);
        }
        return rs;
    }

    public ResultSet getFoodCategory() {
        String query = "SELECT cat_name FROM foodcategory";
        try {
            return (conn.prepareStatement(query).executeQuery());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Issue while getting food category: " + e);
        }
        return null;
    }
    
    
    /**
     * This method is used to delete the food category selected from the food
     * category list from the database.
     */
    public void deleteCategory(String cat_name) {
        String query = "DELETE FROM foodcategory WHERE cat_name = '" + cat_name + "'";
        String deleteQuery = "DELETE FROM fooditems WHERE foodcategory = " + getFoodCategoryID(cat_name);
        try {
            conn.prepareStatement(deleteQuery).execute();
            conn.prepareStatement(query).execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Issue while deleting food category: " + e);
        }
    }

    //Variable Declarations
    private Connection conn = null;
    //End of variable declarations
}
