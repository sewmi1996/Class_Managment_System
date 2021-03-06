/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classmanagmentsystem;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author sewmi
 */
public class Add_User_Details extends javax.swing.JFrame {
    JDBC jdbc=new JDBC();
    private static String  uid;
   
    /**
     * Creates new form Add_User_Details
     */
    public Add_User_Details() {
        initComponents();
        genNewUserID();
        btnupdate.setVisible(false);
    }
    public Add_User_Details(String st){
        initComponents();
        uid=st;
        loadUserDetails(uid);
        btnadd.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        txtNIC = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        txtUserID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArAddress = new javax.swing.JTextArea();
        comboPosition = new javax.swing.JComboBox<>();
        btnadd = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add_User_Details");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Add user details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel2.setText("Position");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jLabel3.setText("User ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 83, -1, -1));

        jLabel4.setText("User Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 123, -1, -1));

        jLabel5.setText("Address:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 219, 49, -1));

        jLabel6.setText("NIC No:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel7.setText("Tel.No:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        txtUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 120, 320, -1));

        txtNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNICActionPerformed(evt);
            }
        });
        getContentPane().add(txtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 185, -1));

        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 185, -1));

        jTextField5.setText("jTextField1");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 102, -1, 0));

        txtUserID.setEditable(false);
        txtUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 82, 180, -1));

        txtArAddress.setColumns(20);
        txtArAddress.setRows(5);
        jScrollPane1.setViewportView(txtArAddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 196, 320, 130));

        comboPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Tutor", "Employee" }));
        comboPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPositionActionPerformed(evt);
            }
        });
        getContentPane().add(comboPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 185, -1));

        btnadd.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        btnadd.setText("Save");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 80, 40));

        btnClose.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 80, 40));

        btnClear.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 80, 40));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 11, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/icons8-join-50.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel10.setText("Email:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 185, -1));

        jLabel11.setText("Name:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 161, -1, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 158, 320, -1));

        btnupdate.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        btnupdate.setText("Save");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 80, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNICActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtArAddress.setText("");
     txtUname.setText("");
   txtNIC.setText("");
   txtTel.setText("");
    jTextField5.setText("");
    txtUserID.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIDActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIDActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
       String address=txtArAddress.getText();
       String uname=txtUname.getText();
       String nic=txtNIC.getText();
       String tel=txtTel.getText();
       String uid=txtUserID.getText();
       String name=txtName.getText();
       String email=txtEmail.getText();
       String position =(String) comboPosition.getSelectedItem();
        String s=genNewPass();   
        boolean sent=SendMail.sendMail(email, "User Registration", "Your account has created.new password is "+s+". Please log in to system using this.");
        if(sent){
            jdbc.putData("INSERT INTO user_details(UserID,Username,Name,NICNo,Address,Position,Tel,Password,Email)VALUES('"+uid+"','"+uname+"','"+name+"','"+nic+"','"+address+"','"+position+"','"+tel+"',password('"+s+"'),'"+email+"')");
            
            JOptionPane.showMessageDialog(null, "User added successfully");
        }else{
            JOptionPane.showMessageDialog(null, "Unable to send your email.Check the intrenet connection");
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void comboPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPositionActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnameActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
       String address=txtArAddress.getText();
       String uname=txtUname.getText();
       String nic=txtNIC.getText();
       String tel=txtTel.getText();
       String uid=txtUserID.getText();
       String name=txtName.getText();
       String email=txtEmail.getText();
       String position =(String) comboPosition.getSelectedItem();
       jdbc.putData("UPDATE user_details SET Username='"+uname+"',Name='"+name+"',NICNo='"+nic+"',Address='"+address+"',Position='"+position+"',Email='"+email+"' WHERE UserID='"+uid+"'");
    }//GEN-LAST:event_btnupdateActionPerformed

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
            java.util.logging.Logger.getLogger(Add_User_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_User_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_User_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_User_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_User_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> comboPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextArea txtArAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtUname;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables

    private String genNewPass() {
        String pass="";
        int i=0;
        while(i<10){
            int j=(int)(Math.random()*124);
            if((48<=j && j<=57) || (65<=j && j<=90) || (97<=j && j<=122)){
                pass+=(char)j;
                i++;
           }
        }
        return pass;
    }

    private void genNewUserID() {
        try {
            ResultSet rs=new JDBC().getData("SELECT MAX(UserID) FROM user_details");
            rs.next();
            int id=Integer.valueOf(rs.getString("MAX(UserID)"))+1;
            txtUserID.setText(String.valueOf(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadUserDetails(String uid) {
        JDBC jdbc=new JDBC();
        try {
            ResultSet rs=jdbc.getData("SELECT UserID,Address,Name,UserName,NICNo,Position,Tel,Email FROM user_details where UserID = '"+uid+"'");
            
            if(rs.next()){
                txtUserID.setText(rs.getString("UserID"));
                txtUname.setText(rs.getString("UserName"));
                txtName.setText(rs.getString("Name"));
                txtArAddress.setText(rs.getString("Address"));
                txtNIC.setText(rs.getString("NICNo"));
                txtTel.setText(rs.getString("Tel"));
                txtEmail.setText(rs.getString("Email"));
                comboPosition.setSelectedItem(rs.getString("Position"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      jdbc.close();
    }

  
}
