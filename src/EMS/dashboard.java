package EMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class dashboard {
	
	public static void main(String[] args) {
		
		
		databes db = new databes();
		db.accessDatabase();
		
		
		
		System.out.println("eto yung data: " + db.datas);
		
		/*
		 * for(Object emp:employees) { System.out.println(db.datas); }
		 */
		
		frontend GUI = new frontend();
		GUI.DisplayGUI(db.datas);
		
		
	}
	
}
