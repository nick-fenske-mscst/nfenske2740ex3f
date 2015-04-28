package ex3f;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class exercise3f extends JFrame {

	private JPanel contentPane;
	private JTextField empIDtxt;
	private JTextField empNameTxt;
	private JComboBox departmentCombo;
	private JTextField positionTxt;
	private DefaultListModel employeeListModel;
	private JButton btnNoArgContructor;
	private JButton btnTwoArgContructor;
	private JButton btnFourArgContructor;
	private JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exercise3f frame = new exercise3f();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public exercise3f() {
		setTitle("Exercise 3F: Overloaded Contructors");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 139);
		contentPane.add(scrollPane);
		
		employeeListModel = new DefaultListModel();
		list = new JList(employeeListModel);
		scrollPane.setViewportView(list);
		
		JLabel lblEmployeeId = new JLabel("Employee ID:");
		lblEmployeeId.setBounds(10, 162, 85, 14);
		contentPane.add(lblEmployeeId);
		
		JLabel lblEmployeeName = new JLabel("Employee name:");
		lblEmployeeName.setBounds(10, 198, 91, 14);
		contentPane.add(lblEmployeeName);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setBounds(10, 268, 106, 14);
		contentPane.add(lblPosition);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setBounds(10, 237, 85, 14);
		contentPane.add(lblDepartment);
		
		empIDtxt = new JTextField();
		empIDtxt.setText("101");
		empIDtxt.setBounds(118, 161, 86, 20);
		contentPane.add(empIDtxt);
		empIDtxt.setColumns(10);
		
		empNameTxt = new JTextField();
		empNameTxt.setText("Nick Fenske");
		empNameTxt.setBounds(118, 195, 142, 20);
		contentPane.add(empNameTxt);
		empNameTxt.setColumns(10);
		
		departmentCombo = new JComboBox();
		departmentCombo.setModel(new DefaultComboBoxModel(new String[] {"Business Office", "Human Resources", "Manufacturing", "Shipping", "Maintenance"}));
		departmentCombo.setBounds(118, 234, 142, 20);
		contentPane.add(departmentCombo);
		
		positionTxt = new JTextField();
		positionTxt.setText("Software Engineer");
		positionTxt.setBounds(118, 265, 142, 20);
		contentPane.add(positionTxt);
		positionTxt.setColumns(10);
		
		btnNoArgContructor = new JButton("No Arg");
		btnNoArgContructor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNoArgContructor_actionPerformed(e);
			}
		});
		btnNoArgContructor.setBounds(66, 307, 89, 23);
		contentPane.add(btnNoArgContructor);
		
		btnTwoArgContructor = new JButton("2 Arg");
		btnTwoArgContructor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnTwoArgContructor_actionPerformed(e);
			}
		});
		btnTwoArgContructor.setBounds(174, 307, 89, 23);
		contentPane.add(btnTwoArgContructor);
		
		btnFourArgContructor = new JButton("4 Arg");
		btnFourArgContructor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnArg_1_actionPerformed(arg0);
			}
		});
		btnFourArgContructor.setBounds(284, 307, 89, 23);
		contentPane.add(btnFourArgContructor);
	}
	protected void do_btnNoArgContructor_actionPerformed(ActionEvent e) 
	{
		//call appropriate constructor
		//add employee to employeelistmodel
		//employeeListModel.addElement(emp);
		Employee emp = new Employee();
		employeeListModel.addElement(emp);
		
		
	}
	protected void do_btnTwoArgContructor_actionPerformed(ActionEvent e) 
	{
		//get empID from epIDtxt, covert to int
		//call appropriate contructor
		//add employee to employeeListModel
		//employeeListModel.addElement(emp);
		int empID = Integer.parseInt(empIDtxt.getText());
		Employee emp = new Employee(empNameTxt.getText(), empID);
		employeeListModel.addElement(emp);
	}
	protected void do_btnArg_1_actionPerformed(ActionEvent arg0) 
	{
		//get empID from empidtxt, conver to int
		//get selected string from deptcombo
		//String dept = (String)deptCombo.getSelectedItem();
		//call appropriate contructor
		//add employee to employeeListModel
		//employeeListModel.addElement(emp);
		
		int empID = Integer.parseInt(empIDtxt.getText());
		String dept = (String)departmentCombo.getSelectedItem();
		Employee emp = new Employee(empNameTxt.getText(), empID, dept, positionTxt.getText());
		employeeListModel.addElement(emp);
		
	}
}
