/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud_ins;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Stud_ins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try
        {
            Scanner sc=new Scanner(System.in);
            
            System.out.println("First Name =");
            String fn =sc.nextLine();
            System.out.println("Last Name =");
            String ln =sc.nextLine();
            System.out.println("Course =");
            String course =sc.nextLine();
            System.out.println("Semester =");
            String sem =sc.nextLine();
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","");
            
            String query="insert into stud(firstname,lastname,course,semester) values (?,?,?,?)";
            
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1, fn);
            pst.setString(2, ln);
            pst.setString(3, course);
            pst.setString(4, sem);
            pst.executeUpdate();
            System.out.println("Display records:");
            String table="Select *from stud";
            
            ResultSet rs=pst.executeQuery(table);
            
            System.out.println("\tRollNo \t\t FirstName \t\t LastName \t\t Course \t\t Semester \t\t");
            
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getInt(5));
            }
        }
        catch(Exception e)
        {
            System.out.println("sorry"+e);
        }
    }
    
}
