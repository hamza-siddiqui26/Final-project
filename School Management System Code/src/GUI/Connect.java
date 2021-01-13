

package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Connect {
    
    Connection con=null;
   
        public static Connection ConnectDB(){
            
          String dbURL = "jdbc:ucanaccess://D:/Spring 2017-II/JAVA/Projects/Semester Project-SRMS-00/Student.accdb";
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection(dbURL); 
            return con;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    
    }      
    
        }
}