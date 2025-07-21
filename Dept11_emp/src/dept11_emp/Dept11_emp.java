/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dept11_emp;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Dept11_emp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try
        {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","");
            
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Enter department to diplay records:");
            String dept =sc.next();
            
            String query="Select empnm,designation,department from emp where department=(?)";
            
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1, dept);
            
            ResultSet rs=pst.executeQuery();
            
            System.out.println("Display records:");
            
            System.out.println("EmpNm \t\t"+"Designation \t\t"+"Department \t\t");
            
            while (rs.next()) {
                System.out.println(rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(6));
                
            }  
        }
        catch(Exception e)
        {
            System.out.println("sorry"+e);
        }
    }
    
}
