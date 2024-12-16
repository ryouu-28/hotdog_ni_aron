package EMS;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


import javax.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class frontend {
	
	 private JTextField EmpFirstName;
	    private JTextField EmpLastName;
	    private JTextField EmpMiddleName;
	    private JTextField EmpDept;
	    private JTextField EmpPos;
	    private JTextField EmpDOJ;
	    private JTextField EmpSalary;
	    private JTextField EmpContact;
	    private JTextField EmpEmail;
	    private JTextField EmpAddress;
	    
	Object[] newEmployee;
	
	
	public void DisplayGUI(Object[][] datas) {
		String[] ent = { "ID", "First Name", "Last Name", "Middle Name", "Department", "Position" };
		DefaultTableModel model = new DefaultTableModel(datas, ent);
		JTable table = new JTable(model);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

		table.setRowHeight(30);

		DefaultTableCellRenderer center = new DefaultTableCellRenderer();
		center.setHorizontalAlignment(SwingConstants.CENTER);
		table.setDefaultRenderer(Object.class, center);

		// for table no to be editable
		table.setDefaultEditor(Object.class, null);
		table.getTableHeader().setReorderingAllowed(false);

		JPanel Frame1 = new JPanel();
		Frame1.setBackground(Color.blue);
		Frame1.setPreferredSize(new Dimension(1000, 200));

		JPanel Frame2 = new JPanel();
		Frame2.setBackground(Color.DARK_GRAY);
		Frame2.setPreferredSize(new Dimension(1000, 10));

		JScrollPane scrollPane = new JScrollPane(table);

		JFrame mainFrame = new JFrame();
		
		JPanel TPanel = TextFieldGUI();
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setTitle("Employee Management System");
		mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		mainFrame.setResizable(false);
//		mainFrame.setUndecorated(true);
		mainFrame.setLayout(new BorderLayout());

		mainFrame.setVisible(true);
//		mainFrame.add(scrollPane);
//		mainFrame.add(addButton);	
		mainFrame.add(Frame1, BorderLayout.LINE_END);
		mainFrame.add(Frame2, BorderLayout.LINE_START);

		 Frame1.setLayout(new BorderLayout());
	     Frame1.add(TPanel, BorderLayout.CENTER);
//	     Frame1.add(addButton, BorderLayout.SOUTH);
		
		Frame2.add(scrollPane);
		
		
		


	}


	public JPanel TextFieldGUI () {
		
		JPanel InputF = new JPanel();
		InputF.setBackground(Color.magenta);
		InputF.setPreferredSize(new Dimension(100, 10));
		
		
		  EmpFirstName =   new JTextField  ("");
		  EmpLastName =  new JTextField  ("");
		  EmpMiddleName =  new JTextField  ("");
		  EmpDept =  new JTextField  ("");
		  EmpPos =  new JTextField  ("");
		  EmpDOJ =  new JTextField  ("");
		  EmpSalary =  new JTextField  ("");
		  EmpContact =  new JTextField  ("");
		  EmpEmail =  new JTextField  ("");
		  EmpAddress =  new JTextField  ("");
		
		
		InputF.setLayout(new GridLayout(11,2, 2, 2));
		InputF.add(new JLabel("Employee First Name:"));
		InputF.add(EmpFirstName);
		InputF.add(new JLabel("Employee Last Name:"));
		InputF.add(EmpLastName);
		InputF.add(new JLabel("Employee Middle Name:"));
		InputF.add(EmpMiddleName);
		InputF.add(new JLabel("Department:"));
		InputF.add(EmpDept);
		InputF.add(new JLabel("Position:"));
		InputF.add(EmpPos);
		InputF.add(new JLabel("Date of Joining:"));
		InputF.add(EmpDOJ);
		InputF.add(new JLabel("Salary:"));
		InputF.add(EmpSalary);
		InputF.add(new JLabel("Contact:"));
		InputF.add(EmpContact);
		InputF.add(new JLabel("Email:"));
		InputF.add(EmpEmail);
		InputF.add(new JLabel("Address:"));
		InputF.add(EmpAddress);
		
		
JButton addButton = new JButton("Add");

		
		

//		addButton.setBounds(150, 100, 100, 50);
		addButton.setPreferredSize(new Dimension(100, 100));
		addButton.setBackground(Color.green);

		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				newEmployee = new Object[10];
				
				
				newEmployee[0] = EmpFirstName.getText();
				newEmployee[1] = EmpLastName.getText();
				newEmployee[2] = EmpMiddleName.getText();
				newEmployee[3] = EmpDept.getText();
				newEmployee[4] = EmpPos.getText();
				newEmployee[5] = EmpDOJ.getText();
				newEmployee[6] = EmpSalary.getText();
				newEmployee[7] = EmpContact.getText();
				newEmployee[8] = EmpEmail.getText();
				newEmployee[9] = EmpAddress.getText();
				
				
				
				add_system addEmp = new add_system();
				addEmp.addNewEmp(newEmployee, frontend.this);


			}
		});

		InputF.add(addButton);
		return InputF;

		
		
	}
	
	public void ClearTextField() {
		EmpFirstName.setText("");
		EmpLastName.setText("");
		EmpMiddleName.setText("");
		EmpDept.setText("");
		EmpPos.setText("");
		EmpDOJ.setText("");
		EmpSalary.setText("");
		EmpContact.setText("");
		EmpEmail.setText("");
		EmpAddress.setText("");
	}
	
	

}


