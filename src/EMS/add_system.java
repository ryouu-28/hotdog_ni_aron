package EMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class add_system {
	
	public void DisplayPrint() {
//		System.out.println("HATDOG");
	}
	
	public void addNewEmp(Object[] newEmp, frontend GUI) {		

		
		for (Object emp : newEmp) {
			System.out.println(emp);
			
            
            }
             try {
             	
             String EmpUrl = "jdbc:sqlite:/C:\\Users\\1\\sqlite\\sql\\empdb.db";
             
             Connection empdb = DriverManager.getConnection(EmpUrl);
             String add = "INSERT INTO employee (emp_first_name, emp_last_name, emp_middle_name, emp_dept, emp_pos, emp_doj, emp_salary, emp_contact, emp_email, emp_address) VALUES (";
             
             for (int i = 0; i < newEmp.length; i++) {
            	 add += "'" + newEmp[i] + "'";
            	 if (i < newEmp.length - 1) {
            	        add += ", ";
            	    }
             }
             add += ");";
             
             String all = "SELECT * FROM employee";
 			
 			
 			Statement state = empdb.createStatement();
 			state.executeUpdate(add);
 			System.out.println("hello");
 			ResultSet r = state.executeQuery(all);
 			

             	
             } catch (SQLException e) {
             	e.printStackTrace();
             }
             GUI.ClearTextField();
		
		}
}

