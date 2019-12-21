

package DatabaseTables;


import javax.swing.*;
import java.sql.*;

import java.sql.SQLException;

public class User {

    public User(){
        conn = MySqlConnect.connectDB();
    }

    /*
     * This method will return the String which contains the post of user that is trying to login
       to the system.
   */
    public String getPost(String userName, String password){
        String post = null;
        PreparedStatement preparedStatement;
        ResultSet rs;
        try{
            String sql = "SELECT post FROM users WHERE username = ? and password = ?";
            preparedStatement = conn.prepareStatement(sql);
            
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, password);
            rs = preparedStatement.executeQuery();
            rs.next();
            post = rs.getString(1);
            
        } catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e);
        }
        return post;
    }

    private Connection conn = null;

}
