
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * 
 * @author User
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        Connect();
       // setLocationRelativeTo(null);

//        if(!text1.getText().equals("") && !pass1.getText().equals("")){
//            jButton1.setEnabled(true); 
//        }
//        else {
//            jButton1.setEnabled(false);
//        }
        
    }
    Connection con;
    PreparedStatement pst;
    
        public void Connect(){
        try{
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","suriya1712");
        }
        catch(SQLException ex){
            
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pass1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 0));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Password");

        text1.setToolTipText("Enter the correct username");
        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Enter User Name and Password");

        pass1.setToolTipText("Enter strong password to keep data safe");

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 0));
        jButton2.setText("Create a new account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(pass1))
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String a=text1.getText();
        String b=new String(pass1.getPassword());
        
        try{
            //if(text1!=null && pass1!=null){
            
                if(!(a.equals("")&& b.equals(""))){
                    System.out.println("Connected mi");
                    java.sql.Statement s=con.createStatement();
                    String Sql="Select *from login";
                    ResultSet rs=s.executeQuery(Sql);
                    int flag=0;
                    while(rs.next()){
                        String c=rs.getString("username");
                        String d=rs.getString("password");
                        if(c.equals(a)&& d.equals(b)){
                            Project_java pj=new Project_java(); 
                            pj.setVisible(true);
                            flag=1;
                        }
                    
                    }
                    if(flag==0){
                  
                        JOptionPane.showMessageDialog(this, "Please check the Username or Password");
                    
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Enter Username and Password");
           }  
        }
        catch(SQLException ae)
        {
            System.out.print("Not Connected"+ae);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          String a=text1.getText();
          String b=pass1.getText();
          try{
            if(con!=null){
                System.out.println("Connected mi");
                java.sql.Statement s=con.createStatement();
                String Sql="Select *from login";
                ResultSet rs=s.executeQuery(Sql);
                int flag=0;
                while(rs.next()){
                    String c=rs.getString("username");
                    String d=rs.getString("password");
                    if(c.equals(a)&& d.equals(b)){
                        JOptionPane.showMessageDialog(this, "Hey...You have alreday Logged in!!");
                        flag=1;
                    }
                    
                }
                if(flag==0){
                pst=con.prepareStatement("insert into login(username,password)values(?,?)");
                pst.setString(1,a);
                pst.setString(2,b);
                
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Username and password saved successfully!:)");
                text1.setText("");
		pass1.setText("");
                
                }
            }
        }
        catch(SQLException ae)
        {
            System.out.print("Not Connected"+ae);
        }

        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JTextField text1;
    // End of variables declaration//GEN-END:variables
}
