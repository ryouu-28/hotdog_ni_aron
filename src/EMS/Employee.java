package EMS;

public class Employee {
    private int employee_id;
    private String emp_first_name;
    private String emp_last_name;
    private String emp_middle_name;
    private String emp_dept;
    private String emp_pos;


	private String emp_doj;
    private double salary;
    private String emp_contact;
    private String emp_email;
    private String emp_address;

    
    public Employee(int employee_id, String emp_first_name, String emp_last_name, String emp_middle_name , String emp_dept, String emp_pos, 
                    String emp_doj, double salary, String emp_contact, String emp_email, String emp_address) {
        this.employee_id = employee_id;
        this.emp_first_name = emp_first_name;
        this.emp_last_name = emp_last_name;
        this.emp_middle_name = emp_middle_name;
        this.emp_dept = emp_dept;
        this.emp_pos = emp_pos;
        this.emp_doj = emp_doj;
        this.salary = salary;
        this.emp_contact = emp_contact;
        this.emp_email = emp_email;
        this.emp_address = emp_address;
    }


    public int getEmployee_id() {
        return employee_id;
    }

    public String getEmp_first_name() {
        return emp_first_name;
    }
    public String getEmp_last_name() {
		return emp_last_name;
	}


	public String getEmp_middle_name() {
		return emp_middle_name;
	}



    public String getEmp_dept() {
        return emp_dept;
    }

    public String getEmp_pos() {
        return emp_pos;
    }

    public String getEmp_doj() {
        return emp_doj;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmp_contact() {
        return emp_contact;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public String getEmp_address() {
        return emp_address;
    }
}
