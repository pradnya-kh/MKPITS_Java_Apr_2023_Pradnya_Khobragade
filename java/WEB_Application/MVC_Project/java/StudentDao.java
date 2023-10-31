
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pradnya
 */
public class StudentDao {
     Connection connection;
    int result;
    public StudentDao(){
        
         try{
               
                Class.forName("com.mysql.cj.jdbc.Driver"); 
                out.println("Driver loaded");
                connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Pradnya@121");
                out.println("Connection established");
         }catch (Exception ex){
             out.println(ex);
         }
    }
    public int insertRecord(Student student){
        
        try{
            PreparedStatement pstat=connection.prepareStatement("insert into  stud_info values(?,?,?,?) ");
            pstat.setString(1,student.getRollno());
             pstat.setString(2,student.getName());
              pstat.setString(3,student.getAddress());
               pstat.setString(4,student.getCity());
              result=pstat.executeUpdate();
               
            
        }catch(Exception e){
            out.println(e);  
        }
        return result;
    }

  
    }
   
        
        
    
    
