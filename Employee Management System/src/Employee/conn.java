/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author Keshav
 */
import java.sql.*;

public class conn {
    
    public Connection c;
    public Statement s;
    
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/empmgmt?useSSL=false","root","");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
