
package schoolmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class SchoolManagementSystem {
    public static Connection conn;
   
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        LoginPage obj = new LoginPage();
        obj.setVisible(true);
    }
}
