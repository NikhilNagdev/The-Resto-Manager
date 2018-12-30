
import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author admin
 */
public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
        initComponents();
        myInitComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize.
     */
    public void myInitComponents(){
        conn = MySqlConnect.connectDB();
        setIconForUsername();
        setIconForPassword();
        this.setIconImage(MyConstants.FRAMELOGO.getImage());
        this.setLocationRelativeTo(null);
        this.setSize(850, 490);
        this.setResizable(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        iconUsername = new javax.swing.JLabel();
        iconPassword = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtInvisible = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("The Resto Manager");

        jPanel1.setBackground(new java.awt.Color(38, 51, 61));
        jPanel1.setForeground(new java.awt.Color(38, 51, 61));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 470, 60));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 220, 180));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 490));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(110, 218, 161));
        jLabel5.setText("THE RESTO MANAGER");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 530, 100));

        /*
        jPanel2.setBackground(new java.awt.Color(233, 233, 233));
        */
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setAlignmentX(1.0F);
        jPanel2.setOpaque(false);
        jPanel2.setBackground(new Color(0, 0, 0, 50));

        jSeparator1.setBackground(new java.awt.Color(38, 51, 61));
        jSeparator1.setForeground(new java.awt.Color(167, 172, 180));
        jSeparator1.setOpaque(true);

        jSeparator2.setBackground(new java.awt.Color(38, 51, 61));
        jSeparator2.setForeground(new java.awt.Color(167, 172, 180));
        jSeparator2.setOpaque(true);

        btnLogin.setBackground(Color.decode("#49C382"));
        btnLogin.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setNextFocusableComponent(btnChangePassword);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnChangePassword.setBackground(Color.decode("#49C382"));
        btnChangePassword.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnChangePassword.setText("Change password");
        btnChangePassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnChangePassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChangePassword.setNextFocusableComponent(txtUsername);
        btnChangePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChangePasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChangePasswordMouseExited(evt);
            }
        });
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 51, 61)));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsername.setBackground(new java.awt.Color(38, 51, 61));
        lblUsername.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(204, 204, 204));
        lblUsername.setText(" Username");
        lblUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 51, 61)));
        jPanel4.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 50));

        txtUsername.setBackground(new java.awt.Color(38, 51, 61));
        txtUsername.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 51, 61)));
        txtUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel4.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 50));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 51, 61)));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPassword.setBackground(new java.awt.Color(38, 51, 61));
        lblPassword.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(204, 204, 204));
        lblPassword.setText(" Password");
        lblPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 51, 61)));
        lblPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 50));

        txtPassword.setBackground(new java.awt.Color(38, 51, 61));
        txtPassword.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 51, 61)));
        txtPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel6.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(iconPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 400, 310));

        txtInvisible.setCaretColor(Color.decode("#29363F"));
        txtInvisible.setBackground(new java.awt.Color(38, 51, 61));
        txtInvisible.setForeground(Color.decode("#29363F"));
        txtInvisible.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 51, 61)));
        txtInvisible.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtInvisible.setNextFocusableComponent(txtUsername);
        jPanel1.add(txtInvisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 21, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\TheRestoManager\\images\\dinner2.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 300, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        if(txtUsername.getText().equals("") || txtPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "User Name or Password is empty!", "Login", JOptionPane.ERROR_MESSAGE);
        }else{
            processLogin();
        }
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        jSeparator2.setBackground(Color.decode("#a7acb4"));
        if(txtPassword.getText().equals("")){
            lblPassword.setText(" Password");
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        jSeparator2.setBackground(Color.decode("#6ed9a1"));
        jSeparator2.setSize(264, 1);
        if(txtPassword.getText().equals("")){
            lblPassword.setText("");
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        if(txtUsername.getText().equals("") || txtPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "User Name or Password is empty!", "Login", JOptionPane.ERROR_MESSAGE);
        }else{
            processLogin();
        }
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        jSeparator1.setBackground(Color.decode("#a7acb4"));
        if(txtUsername.getText().equals("")){
            lblUsername.setText(" Username");
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        jSeparator1.setBackground(Color.decode("#6ed9a1"));
        jSeparator1.setSize(101, 1);
        if(txtUsername.getText().equals("")){
            lblUsername.setText("");
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        close();
        openChangePasswordPage();
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnChangePasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangePasswordMouseExited
        btnChangePassword.setSize(btnChangePassword.getWidth() - 10, btnChangePassword.getHeight() - 7);
        Point p =btnChangePassword.getLocation();
        btnChangePassword.setLocation((int)p.getX()+5, (int)p.getY()+3);
    }//GEN-LAST:event_btnChangePasswordMouseExited

    private void btnChangePasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangePasswordMouseEntered
        btnChangePassword.setSize(btnChangePassword.getWidth() + 10, btnChangePassword.getHeight() + 7);
        Point p = btnChangePassword.getLocation();
        btnChangePassword.setLocation((int)p.getX()-5, (int)p.getY()-3);
    }//GEN-LAST:event_btnChangePasswordMouseEntered

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(txtUsername.getText().equals("") || txtPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Username or Password is empty!", "Login", JOptionPane.ERROR_MESSAGE);
        }else{
            processLogin();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        btnLogin.setSize(btnLogin.getWidth() - 10, btnLogin.getHeight() - 8);
        Point p = btnLogin.getLocation();
        btnLogin.setLocation((int)p.getX()+5, (int)p.getY()+4);
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        btnLogin.setSize(btnLogin.getWidth() + 10, btnLogin.getHeight() + 8);
        Point p = btnLogin.getLocation();
        btnLogin.setLocation((int)p.getX()-5, (int)p.getY()-4);
    }//GEN-LAST:event_btnLoginMouseEntered
    
    /*
      * This method will return the String which contains the post of user that is trying to login 
        to the system.
    */
    private String getPost(){
        String post = null;
        try{
            String sql = "SELECT post FROM users WHERE username = ? and password = ?";
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, txtUsername.getText());
            preparedStatement.setString(2, txtPassword.getText());
            rs = preparedStatement.executeQuery();
            rs.next();
            post = rs.getString(1);
       } catch(SQLException e){
            System.out.println(e);
       }
       return post;
    }
    
    /*
      * This method deals with the users that are trying to login to the system.
    */
    private void processLogin(){
        try {
            String post = getPost(); //This will return the post of the user that is trying to login to the system.
            if (!(post==null)) {
                setLoadingScreen();
                t = new Timer(3000, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae){
                    if(post.equals("Manager")){
                        close();//This will close the login frame.
                        Dashboard.main(null);
                        t.stop();
                    }
                    else if(post.equals("Chef")){
                        close();//This will close the login frame.
                        ChefPage.main(null);
                        t.stop();
                    }
                }});
                t.start();
            }
            else{
                JOptionPane.showMessageDialog(null, "Username or password is incorrect!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong while logging in: " + e.getMessage(), "Login", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * This method sets the background of the panel when the login button is pressed.
     */
    public void setLoadingScreen(){
            jLabel6.setIcon(MyConstants.BLURREDPAGE);
            jLabel7.setIcon(MyConstants.LOADER);
            jLabel8.setText("This may take a while please wait...");
    }
    
    /*This method sets the icon for username field*/
    private void setIconForUsername(){
            ImageIcon ic = MyConstants.USERNAMEICON;
            Image newImg = ic.getImage().getScaledInstance(iconUsername.getWidth(), iconUsername.getHeight(), Image.SCALE_SMOOTH);//this method will return an Image object which will have dimensions that will fit the complete jlabel
            iconUsername.setIcon(new ImageIcon(newImg));
    }
    
    /*This method sets the icon for password field*/
    private void setIconForPassword(){
            ImageIcon ic = MyConstants.PASSWORDICON;
            Image newImg = ic.getImage().getScaledInstance(iconPassword.getWidth(), iconPassword.getHeight(), Image.SCALE_SMOOTH);//this method will return an Image object which will have dimensions that will fit the complete jlabel
            iconPassword.setIcon(new ImageIcon(newImg));
    }
    
    /*
      *This method opens a new frame where user can change his password.
    */
    public void openChangePasswordPage(){
        this.setVisible(false);
        new ChangePassword(LoginPage.this).setVisible(true);
    }
    
    /*
      *This method closes the current active frame.
    */
    private void close(){
        WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
    }
    
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Windows (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginPage lp = new LoginPage();
                lp.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel iconPassword;
    private javax.swing.JLabel iconUsername;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtInvisible;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
    private Connection conn = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet rs = null;
    private Timer t;
    BlurLayerUI b = null;
}
