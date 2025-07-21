/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_display;
import java.sql.*;

/**
 *
 * @author Dell
 */
public class Employee_display {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         try
        {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","");
            
            System.out.println("Display Records:");
            
            //String query= "Select *from emp where salary > 50000";
            //String query="Select *from emp where city='Rajkot'";
            //String query="Select *from emp where empnm like 'A%'";
            //String query="Select *from emp where designation='manager'";
            //String query="Select COUNT(*) from emp";
            //String query="Select *from emp where salary=(select MAX(salary) from emp)";
            String query="Select *from emp ORDER By empnm ASC";
            
            //String query="update emp set salary=45500 where empno=103";
           // String query="delete from emp where empno=101";
                       
            Statement st=con.createStatement();
           // st.executeUpdate(query);
            
            //String query1= "Select *from emp";
            
            ResultSet rs=st.executeQuery(query);
            System.out.println("EmpNo \t\t"+"EmpNm \t\t"+"Designation \t\t"+"City \t\t"+"Salary \t\t"+"Department \t\t");
            
            while (rs.next()) {
                System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getInt(5)+"\t\t"+rs.getString(6));
                
            }  
            
           /* if(rs.next())
            {
                int total=rs.getInt(1);
                System.out.println("Total number of employees="+total);
            }*/
        }
        catch(Exception e)
        {
            System.out.println("sorry"+e);
        }
    }
    
}
