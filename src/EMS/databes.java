package EMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class databes {
Object[][] datas;
	
	public void emp_Datas(List<Employee> empData) {
		
		 this.datas = new Object[empData.size()][11];
		 
		int i = 0;

		for (Employee employee : empData) {
		    this.datas[i][0] = employee.getEmployee_id();
		    this.datas[i][1] = employee.getEmp_first_name();
		    this.datas[i][2] = employee.getEmp_last_name();
		    this.datas[i][3] = employee.getEmp_middle_name();
		    this.datas[i][4] = employee.getEmp_dept();
		    this.datas[i][5] = employee.getEmp_pos();
		    this.datas[i][6] = employee.getEmp_doj();
		    this.datas[i][7] = employee.getSalary();
		    this.datas[i][8] = employee.getEmp_contact();
		    this.datas[i][9] = employee.getEmp_email();
		    this.datas[i][10] = employee.getEmp_address();
		    i++;
		}
		

		//for debugging purposes
		for (Object[] emp : datas) {
            for (Object data : emp) {
                System.out.print(data+ " ");
            }
            System.out.println();
        }
		System.out.println("tite " + datas);
		
		
		}

	
	public Object[][] getDatas() {
		return datas;
	}

	public void setDatas(Object[][] datas) {
		this.datas = datas;
	}

	public void accessDatabase() {
		databes dataBase = new databes();
		
		String EmpUrl = "jdbc:sqlite:/C:\\Users\\1\\sqlite\\sql\\empdb.db";
		
		ArrayList<Employee> employeeData = new ArrayList<Employee>();
		
		try {
			Connection empdb = DriverManager.getConnection(EmpUrl);
			String all = "SELECT * FROM Employee";
			
			Statement state = empdb.createStatement();
			
			ResultSet r = state.executeQuery(all);
			
		
			while (r.next()) {
			    int id = r.getInt("employee_id");
			    String first_name = r.getString("emp_first_name");
			    String middle_name = r.getString("emp_middle_name");
			    String last_name = r.getString("emp_last_name");
			    String dept = r.getString("emp_dept");
			    String pos = r.getString("emp_pos");
			    String doj = r.getString("emp_doj");
			    double salary = r.getDouble("emp_salary");
			    String contact = r.getString("emp_contact");
			    String email = r.getString("emp_email");
			    String address = r.getString("emp_address");

			    employeeData.add(new Employee(id, first_name, last_name, middle_name, dept, pos, doj, salary, contact, email, address));
			}

			
			dataBase.emp_Datas(employeeData);
			

			r.close();
			state.close();
			empdb.close();
			
			
			
		} catch (SQLException e ) {
			System.out.println("Error");
			e.printStackTrace();
		}
	
		System.out.println("pakyu");	
		

	
	}


}
