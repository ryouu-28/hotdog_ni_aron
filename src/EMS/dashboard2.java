/*
 * package EMS;
 * 
 * import java.sql.Connection; import java.sql.DriverManager; import
 * java.sql.ResultSet; import java.sql.SQLException; import java.sql.Statement;
 * import java.util.ArrayList; import java.util.List;
 * 
 * import javax.swing.JFrame; import javax.swing.JScrollPane; import
 * javax.swing.JTable; import javax.swing.SwingConstants; import
 * javax.swing.table.DefaultTableCellRenderer; import
 * javax.swing.table.DefaultTableModel;
 * 
 * public class dashboard2 {
 * 
 * Object[][] datas;
 * 
 * public void emp_Datas(List<Employee> empData) {
 * 
 * datas = new Object[empData.size()][11];
 * 
 * int i = 0;
 * 
 * for (Employee employee : empData) { datas[i][0] = employee.getEmployee_id();
 * datas[i][1] = employee.getEmp_first_name(); datas[i][2] =
 * employee.getEmp_last_name(); datas[i][3] = employee.getEmp_middle_name();
 * datas[i][4] = employee.getEmp_dept(); datas[i][5] = employee.getEmp_pos();
 * datas[i][6] = employee.getEmp_doj(); datas[i][7] = employee.getSalary();
 * datas[i][8] = employee.getEmp_contact(); datas[i][9] =
 * employee.getEmp_email(); datas[i][10] = employee.getEmp_address(); i++; }
 * 
 * debug/ print purposes for (Object[] emp : datas) { for (Object data : emp) {
 * System.out.print(data+ " "); } System.out.println(); }
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * public static void main(String[] args) { dashboard2 dashboard = new
 * dashboard2();
 * 
 * String EmpUrl = "jdbc:sqlite:/C:\\Users\\1\\sqlite\\sql\\empdb.db";
 * 
 * ArrayList<Employee> employeeData = new ArrayList<Employee>();
 * 
 * try { Connection empdb = DriverManager.getConnection(EmpUrl); String all =
 * "SELECT * FROM Employee";
 * 
 * Statement state = empdb.createStatement();
 * 
 * ResultSet r = state.executeQuery(all);
 * 
 * 
 * while (r.next()) { int id = r.getInt("employee_id"); String first_name =
 * r.getString("emp_first_name"); String middle_name =
 * r.getString("emp_middle_name"); String last_name =
 * r.getString("emp_last_name"); String dept = r.getString("emp_dept"); String
 * pos = r.getString("emp_pos"); String doj = r.getString("emp_doj"); double
 * salary = r.getDouble("emp_salary"); String contact =
 * r.getString("emp_contact"); String email = r.getString("emp_email"); String
 * address = r.getString("emp_address");
 * 
 * employeeData.add(new Employee(id, first_name, last_name, middle_name, dept,
 * pos, doj, salary, contact, email, address)); }
 * 
 * 
 * dashboard.emp_Datas(employeeData);
 * 
 * 
 * frontend GUI = new frontend(); GUI.DisplayGUI(dashboard.datas); r.close();
 * state.close(); empdb.close();
 * 
 * 
 * 
 * } catch (SQLException e ) { System.out.println("Error"); e.printStackTrace();
 * }
 * 
 * System.out.println("pakyu");
 * 
 * 
 * }
 * 
 * }
 */