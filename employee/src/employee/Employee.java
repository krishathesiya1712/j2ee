/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.sql.*;
/**
 *
 * @author Dell
 */
public class Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","");
           // String query="insert into emp (empno,empnm,designation,city,salary,department) values (101,'Akshita','Manager','Surat',50000,'MCA')";
           // String query="insert into emp (empno,empnm,designation,city,salary,department) values (102,'Yashvi','Web Developer','Ahmedabad',70000,'IT')";
           // String query="insert into emp (empno,empnm,designation,city,salary,department) values (103,'Najnin','Analyst','Gandhinagar',65000,'Finance')";
           // String query="insert into emp (empno,empnm,designation,city,salary,department) values (104,'Asha','Designer','Rajkot',50000,'Marketing')";
           // String query="insert into emp (empno,empnm,designation,city,salary,department) values (105,'Himali','Manager','Ahmedabad',75000,'HR')";
           // String query="insert into emp (empno,empnm,designation,city,salary,department) values (106,'Akshita','Tax Accountant','Rajkot',86000,'Accounting')";
            
            System.out.println("Display Records:");
            
            String query = "Select *from emp";
            
            Statement st=con.createStatement();
           // st.executeUpdate(query);
            
            ResultSet rs=st.executeQuery(query);
            System.out.println("EmpNo \t\t"+"EmpNm \t\t"+"Designation \t\t"+"City \t\t"+"Salary \t\t"+"Department \t\t");
            
            while (rs.next()) {
                System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getInt(5)+"\t\t"+rs.getString(6));
                
            }
            
          /* if(query != null)
            {
                System.out.println("Record Inserted");
            } */
        }
        catch(Exception e)
        {
            System.out.println("sorry"+e);
        }
    }
    
}
