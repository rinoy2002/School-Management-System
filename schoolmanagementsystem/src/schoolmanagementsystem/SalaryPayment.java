
package schoolmanagementsystem;

import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class SalaryPayment extends javax.swing.JFrame {

    
    public SalaryPayment() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        teacher_id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        teacher_class = new javax.swing.JTextField();
        month = new javax.swing.JTextField();
        basic = new javax.swing.JTextField();
        special_allowance = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        bonus = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        total_amt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(0, 102, 204));
        jLabel11.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Salary");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/icons/salary.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 90, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 170));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        teacher_id.setBackground(new java.awt.Color(153, 153, 153));
        teacher_id.setForeground(new java.awt.Color(0, 0, 0));
        teacher_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                teacher_idFocusLost(evt);
            }
        });
        jPanel2.add(teacher_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 170, 30));

        name.setBackground(new java.awt.Color(153, 153, 153));
        name.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 170, 30));

        teacher_class.setBackground(new java.awt.Color(153, 153, 153));
        teacher_class.setForeground(new java.awt.Color(0, 0, 0));
        teacher_class.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                teacher_classFocusLost(evt);
            }
        });
        jPanel2.add(teacher_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 170, 30));

        month.setBackground(new java.awt.Color(153, 153, 153));
        month.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 170, 30));

        basic.setBackground(new java.awt.Color(153, 153, 153));
        basic.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(basic, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 170, 30));

        special_allowance.setBackground(new java.awt.Color(153, 153, 153));
        special_allowance.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(special_allowance, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 170, 30));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Total  Amount ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/icons/cancel-button.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/icons/submit-button.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Teacher ID ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, 30));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Name ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, 30));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Class  ");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, 20));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Month ");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, 30));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Basic");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, 30));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Special Allowance");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, 30));

        bonus.setBackground(new java.awt.Color(153, 153, 153));
        bonus.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(bonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 170, 30));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Bonus");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 40, 30));

        total_amt.setBackground(new java.awt.Color(153, 153, 153));
        total_amt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(total_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 170, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 520, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void teacher_classFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_teacher_classFocusLost
        // TODO add your handling code here:
        String teacherid = teacher_id.getText();
        String  name = this.name.getText();
        int  teacherclass= Integer.parseInt(teacher_class.getText());
        String  month= this.month.getText();
        float totalamt=0,bonusamt=0,basicamt=0,spallowance=0;
        try{
        String sql= "select * from salary where class = "+teacherclass+";";
        Statement st= (Statement)SchoolManagementSystem.conn.createStatement();
        ResultSet rs= st.executeQuery(sql);
         while(rs.next()){
               basicamt = rs.getFloat("basic");
               spallowance = rs.getFloat("special_allowance");
               bonusamt = rs.getFloat("bonus");
               basic.setText(Float.toString(basicamt));
               special_allowance.setText(Float.toString(spallowance));
               bonus.setText(Float.toString(bonusamt));
         }
         totalamt = basicamt+spallowance+bonusamt;
         total_amt.setText(Float.toString(totalamt));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_teacher_classFocusLost

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        // TODO add your handling code here:
        OfficeHomePage obj=new OfficeHomePage();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        // TODO add your handling code here:
        String status="Paid";
        String teacherid = teacher_id.getText();
        String  name = this.name.getText();
        String  month= this.month.getText();
        double totalamt= Double.parseDouble(total_amt.getText());
  
        try{
            String sql= "insert into salary_paid values(?,?,?,?,?)";
            PreparedStatement ptst = SchoolManagementSystem.conn.prepareStatement(sql);
            ptst.setString(1,teacherid);
            ptst.setString(2,name);
            ptst.setString(3,month);
            ptst.setDouble(4,totalamt);
            ptst.setString(5,status);
            ptst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salary Paid Sucessfully");
            //conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel12MousePressed

    private void teacher_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_teacher_idFocusLost
        // TODO add your handling code here:
        String teacherid = teacher_id.getText();
        int teacherclass = 0;
        String teachername = null;
        try{
            String sql= "select * from teacher where teacher_id = '"+teacherid+"';";
            Statement st= (Statement)SchoolManagementSystem.conn.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                teacherclass = rs.getInt("class");
                teachername  = rs.getString("name");
            }
            teacher_class.setText(Integer.toString(teacherclass));
            name.setText(teachername);

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_teacher_idFocusLost

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
            java.util.logging.Logger.getLogger(SalaryPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalaryPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalaryPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalaryPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalaryPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField basic;
    private javax.swing.JTextField bonus;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField month;
    private javax.swing.JTextField name;
    private javax.swing.JTextField special_allowance;
    private javax.swing.JTextField teacher_class;
    private javax.swing.JTextField teacher_id;
    private javax.swing.JTextField total_amt;
    // End of variables declaration//GEN-END:variables

}
