/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe_desplay;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author KSC115
 */
public class Employe_desplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
             Scanner sc=new Scanner(System.in);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/asha","root","");
              //String table="select *from employe where salary>=50000";//salry gretar than 50000
         // String table="select *from employe where city='rajkot'";
            // String table="select *from employe where empnm like 'a%'";
             //String table="select *from employe where designation='manager'";
            //String table="select COUNT(*) from employe ";//count table data
          //  String table="SELECT * FROM employe WHERE salary = (SELECT MAX(salary) FROM employe);";
           /*System.out.print("Employee No.=");
            int id=sc.nextInt();
            
            String table="select *from employe where empno=? ";*/
            System.out.print("Employee Department=");
            String dpt=sc.next();
            
            String table="select empnm,designation from employe where department=?";
            PreparedStatement st=con.prepareStatement(table);
            st.setString(1, dpt);
             ResultSet r_s=st.executeQuery();
            System.out.println("\tName\t\tDesignation\n");
             while(r_s.next())
             {
                System.out.print("\t"+r_s.getString(1));
                System.out.print("\t\t"+r_s.getString(2));
                System.out.print("");
                     
             }

            /*if (r_s.next()) {
                int count = r_s.getInt(1);
                System.out.println("Total rows: " + count);
            }*/
          /*System.out.println("\t\tId\t\tName\t\tDesignation\t\tCity\t\tSalry\t\tDepartment\n");
             while(r_s.next())
             {
                System.out.print("\t\t"+r_s.getInt(1));
                System.out.print("\t\t"+r_s.getString(2));
                System.out.print("\t\t"+r_s.getString(3));
                System.out.print("\t\t"+r_s.getString(4));
                System.out.print("\t\t"+r_s.getInt(5));
                System.out.print("\t\t"+r_s.getString(6));
                 System.out.println("");
                     
             }*/
        }
        catch(Exception e)
        {
            System.out.println("Sorry"+e);
        }
    }
    
}
