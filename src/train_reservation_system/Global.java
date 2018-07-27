/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train_reservation_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class Global {
    Connection con;
    Statement stmt;
    ResultSet rs;
    public Global()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost/train_reservation_system";
            con=DriverManager.getConnection(url,"root","");
            stmt=con.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public ResultSet execute(String s)throws Exception
    {
        rs=stmt.executeQuery(s);
        return rs;
    }
    public void update(String s)throws Exception
    {
        stmt.executeUpdate(s);
    }
    
    
}
