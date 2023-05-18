package projectjava1;
import java.util.*;
import java.sql.Connection;
import java.sql.*;

public class Supplychain {
	   
           private static Connection connection=null;
           private static Scanner scan=new Scanner(System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Supplychain supplychain=new Supplychain();
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql//localhost:3306//supply";
			String username="root";
			String password="root";
			
			connection  =DriverManager.getConnection(dburl,username,password);
			System.out.println("1.supplier details");
			System.out.println("2.customer details");
			System.out.println("3.product details");
			System.out.println("4.purchase details");
			System.out.println("enter your choice");
			int choice=Integer.parseInt(scan.nextLine());
			
			switch(choice) {
				
			case 1:  
					
					System.out.println("1.enter supplier details");
					System.out.println("2.update supplier details");
					System.out.println("3.show supplier details");
					System.out.println("4.show supplier details");
					System.out.println("Enter your choice");
					
				
					
					supplychain.insertsupplier();
					break;
					
					
			default:
				 break;
					
					
					
				
			}
			
			
		}
		
		catch(Exception e) {
			
			throw new RuntimeException("Something went wrong");
		}
		

	}
	
	
   private void insertsupplier() {
		System.out.println("enter supplier details");
	   
	   
   }
}
