
package schoolmanagementsystem;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class FeesPayment extends javax.swing.JFrame {

    
    public FeesPayment() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextPane();
        admission_number = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        student_class = new javax.swing.JTextField();
        month = new javax.swing.JTextField();
        tution_fee = new javax.swing.JTextField();
        sports_fee = new javax.swing.JTextField();
        due_amt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        library_fee = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        lab_fee = new javax.swing.JTextField();
        total_amt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 750));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(0, 102, 204));
        jLabel11.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fees Payment");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/icons/fees-payment.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 90, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 170));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setBackground(new java.awt.Color(255, 255, 255));
        text.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(text);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 350, 500));

        admission_number.setBackground(new java.awt.Color(153, 153, 153));
        admission_number.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(admission_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 170, 30));

        name.setBackground(new java.awt.Color(153, 153, 153));
        name.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 170, 30));

        student_class.setBackground(new java.awt.Color(153, 153, 153));
        student_class.setForeground(new java.awt.Color(0, 0, 0));
        student_class.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                student_classFocusLost(evt);
            }
        });
        jPanel2.add(student_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 170, 30));

        month.setBackground(new java.awt.Color(153, 153, 153));
        month.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, 30));

        tution_fee.setBackground(new java.awt.Color(153, 153, 153));
        tution_fee.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(tution_fee, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 170, 30));

        sports_fee.setBackground(new java.awt.Color(153, 153, 153));
        sports_fee.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(sports_fee, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 170, 30));

        due_amt.setBackground(new java.awt.Color(153, 153, 153));
        due_amt.setForeground(new java.awt.Color(0, 0, 0));
        due_amt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                due_amtFocusLost(evt);
            }
        });
        jPanel2.add(due_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 170, 30));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Total  Amount ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/icons/cancel-button.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/icons/submit-button.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Admission Number ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Name ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/icons/print-icon.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Class  ");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, 20));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Month ");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 30));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Tution Fee ");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 30));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Sports Fee ");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, 30));

        library_fee.setBackground(new java.awt.Color(153, 153, 153));
        library_fee.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(library_fee, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 170, 30));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Library  Fee  ");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 30));

        lab_fee.setBackground(new java.awt.Color(153, 153, 153));
        lab_fee.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(lab_fee, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 170, 30));

        total_amt.setBackground(new java.awt.Color(153, 153, 153));
        total_amt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(total_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 170, 30));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Lab Fee ");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, 30));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Due  Amount ");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 710, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        // TODO add your handling code here:
        FeesPayment obj =new FeesPayment();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel13MousePressed

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        // TODO add your handling code here:
        String status="Paid";
        int addmission = Integer.parseInt(admission_number.getText());
        String name = this.name.getText();
        int Studentclass = Integer.parseInt(student_class.getText());
        String month = this.month.getText();
        String tution = tution_fee.getText();
        double tutionfee = Double.parseDouble(tution);
        String sports = sports_fee.getText();
        double sportsfee= Double.parseDouble(sports);
        String library = library_fee.getText();
        double libraryfee= Double.parseDouble(library);
        String  lab= lab_fee.getText();
        double labfee= Double.parseDouble(lab);
        double dueamt=Double.parseDouble(due_amt.getText());
        double total= tutionfee+sportsfee+libraryfee+labfee+dueamt;
        text.setText("*********************************************************************\n"+ 
                     "                     CHRIST INTERNATIONAL SCHOOL \n"+
                     "*********************************************************************\n"+
                     "\n                                    FEE RECEIPT "+
                     "\n\n         Admission Number : "+addmission+
                     "\n\n                              Name : "+name+
                     "\n\n                              Month : "+month+
                     "\n\n          S.No                Particulars            Amount "+
                     "\n\n           1.                   Tution FEE             "+tutionfee+
                     "\n\n           2.                  Sports FEE             "+sportsfee+
                     "\n\n           3.                  Library FEE             "+libraryfee+
                     "\n\n           4.                       Lab FEE             "+libraryfee+
                     "\n\n        --------------------------------------------------------"+
                     "\n\n                                        Due Amount :  "+dueamt+
                     "\n\n                                            Total FEE :  "+total);
        try{
        
        String sql= "insert into fees_paid values(?,?,?,?,?,?)";
        PreparedStatement ptst = SchoolManagementSystem.conn.prepareStatement(sql);
        ptst.setInt(1,addmission);
        ptst.setString(2,name);
        ptst.setInt(3,Studentclass);
        ptst.setString(4,month);
        ptst.setDouble(5,total);
        ptst.setString(6,status);
        ptst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Fee Paid Sucessfully");
        //conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel12MousePressed

    private void student_classFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_student_classFocusLost
        // TODO add your handling code here:
        String admission_nunber = admission_number.getText();
        String  name = this.name.getText();
        int  student_class= Integer.parseInt(this.student_class.getText());
        String  month= this.month.getText();
        try{
       
        String sql= "select * from fee where class = "+student_class+";";
        Statement st= (Statement)SchoolManagementSystem.conn.createStatement();
        ResultSet rs= st.executeQuery(sql);
         while(rs.next()){
               float tution = rs.getFloat("tution_fee");
               float sports = rs.getFloat("sports_fee");
               float library = rs.getFloat("library_fee");
               float lab = rs.getFloat("lab_fee");
               tution_fee.setText(Float.toString(tution));
               sports_fee.setText(Float.toString(sports));
               library_fee.setText(Float.toString(library));
               lab_fee.setText(Float.toString(lab));
         }
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_student_classFocusLost

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        // TODO add your handling code here:
        OfficeHomePage obj=new OfficeHomePage();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel6MousePressed

    private void due_amtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_due_amtFocusLost
        // TODO add your handling code here:
        int addmission = Integer.parseInt(admission_number.getText());
        String name = this.name.getText();
        int Studentclass = Integer.parseInt(student_class.getText());
        String month = this.month.getText();
        String tution = tution_fee.getText();
        double tutionfee = Double.parseDouble(tution);
        String sports = sports_fee.getText();
        double sportsfee= Double.parseDouble(sports);
        String library = library_fee.getText();
        double libraryfee= Double.parseDouble(library);
        String  lab= lab_fee.getText();
        double labfee= Double.parseDouble(lab);
        double dueamt=Double.parseDouble(due_amt.getText());
        double total= tutionfee+sportsfee+libraryfee+labfee+dueamt;
        total_amt.setText(Double.toString(total));
    }//GEN-LAST:event_due_amtFocusLost

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
       /*
        String text = this.text.getText();
        BufferedImage image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);// Represents an image with 8-bit RGBA color components packed into integer pixels.
        Graphics2D graphics2d = image.createGraphics();
        Font font = new Font("TimesNewRoman", Font.PLAIN, 14);
        graphics2d.setFont(font);
        FontMetrics fontmetrics = graphics2d.getFontMetrics();
        int width = fontmetrics.stringWidth(text);
        int height = fontmetrics.getHeight();
        graphics2d.dispose();

        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        graphics2d = image.createGraphics();
        graphics2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        graphics2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        graphics2d.setFont(font);
        fontmetrics = graphics2d.getFontMetrics();
        graphics2d.setColor(Color.GREEN);
        graphics2d.drawString(text, 0, fontmetrics.getAscent());
        graphics2d.dispose();
        try {
            ImageIO.write(image, "png", new File("D:/school-management-system/fee receipt/Sample.jpg"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }*/
    }//GEN-LAST:event_jLabel1MousePressed

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
            java.util.logging.Logger.getLogger(FeesPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeesPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeesPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeesPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeesPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField admission_number;
    private javax.swing.JTextField due_amt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lab_fee;
    private javax.swing.JTextField library_fee;
    private javax.swing.JTextField month;
    private javax.swing.JTextField name;
    private javax.swing.JTextField sports_fee;
    private javax.swing.JTextField student_class;
    private javax.swing.JTextPane text;
    private javax.swing.JTextField total_amt;
    private javax.swing.JTextField tution_fee;
    // End of variables declaration//GEN-END:variables
}
