/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad.modular;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author SnK
 */
public class MySqlConnect {
    Connection conn = null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn=DriverManager.getConnection("jdbc:sqlserver://andreiciobanu.database.windows.net:1433;database=TP;user=AndreiMW@andreiciobanu;password=Hesoyam555_;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
            return conn;
    }catch(Exception e){
    return null;}
    }
}

