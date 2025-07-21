/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package display10_emp;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Display10_emp {

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
            
            System.out.println("Enter empno to diplay records:");
            int no =sc.nextInt();
            
            String query="Select * from emp where empno=(?)";
            
            PreparedStatement pst=con.prepareStatement(query);
            pst.setInt(1, no);
            
            ResultSet rs=pst.executeQuery();
            
            System.out.println("Display records:");
            System.out.println("EmpNo \t\t"+"EmpNm \t\t"+"Designation \t\t"+"City \t\t"+"Salary \t\t"+"Department \t\t");
            
            while (rs.next()) {
                System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getInt(5)+"\t\t"+rs.getString(6));
                
            }  
        }
        catch(Exception e)
        {
            System.out.println("sorry"+e);
        }
    }
    
}
