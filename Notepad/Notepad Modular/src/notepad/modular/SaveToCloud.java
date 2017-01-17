package notepad.modular;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SnK
 */
public class SaveToCloud {
 private PreparedStatement pst = null;
 private FileReader fileReader = null;
 private File file;
 private Connection conn;
 private String yolo ="";
 
 public SaveToCloud(File _file)
 {
    file = _file;
 }
 
 public void Cloud() 
 {
     conn = MySqlConnect.ConnectDB();
     try{  
        fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        String name = null; 
        String s = null;
        
        while((s=br.readLine())!=null)
        {
            this.yolo +=s;
        }
   
        name = file.getName();
        String sql = "INSERT into ErvinDatabase (Nume, Continut) " + "values (?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, name);         
        pst.setString(2, yolo);

        //execute insert query
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"File stored in the Cloud!");
        }catch (FileNotFoundException | SQLException e) {
        } catch (IOException ex) {
            Logger.getLogger(SaveToCloud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        try {
        if(fileReader!=null) fileReader.close(); 
        if(pst!=null) pst.close(); 
        if(conn!=null) conn.close(); 
        } catch (SQLException | IOException e) {}
        }
        }
    }
