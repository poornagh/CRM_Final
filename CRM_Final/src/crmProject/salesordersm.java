package crmProject;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JButton;

public class salesordersm extends JFrame {
	//*
	static salesordersm frame;
	//*

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTable table_7;
	private JButton btnCancel;
	private JButton btnGenerateInvoice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//*
					 frame = new salesordersm();
					 //*
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
	public salesordersm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SALES ORDER");
		lblNewLabel.setBounds(368, 20, 147, 53);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Create Sales Order");
		lblNewLabel_1.setBounds(87, 72, 209, 53);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sales Order No");
		lblNewLabel_2.setBounds(152, 124, 114, 33);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(305, 123, 129, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Sales Order Date");
		lblNewLabel_3.setBounds(149, 168, 157, 53);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Quote Number");
		lblNewLabel_4.setBounds(152, 233, 114, 28);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(305, 231, 129, 37);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_5 = new JLabel("Customer Name");
		lblNewLabel_5.setBounds(152, 295, 101, 13);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(305, 281, 129, 38);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setBounds(152, 340, 101, 28);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(305, 330, 129, 38);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_7 = new JLabel("Mobile Number");
		lblNewLabel_7.setBounds(152, 398, 114, 28);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(305, 388, 129, 38);
		textField_5.setColumns(10);
		contentPane.add(textField_5);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(305, 180, 129, 33);
		dateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(dateChooser);
		
		table = new JTable();
		table.setBounds(164, 547, 340, -27);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(174, 645, 403, -114);
		contentPane.add(table_1);
		
		table_2 = new JTable();
		table_2.setBounds(189, 674, 326, -139);
		contentPane.add(table_2);
		
		table_3 = new JTable();
		table_3.setBounds(293, 593, 1, 1);
		contentPane.add(table_3);
		
		table_4 = new JTable();
		table_4.setBounds(459, 634, 1, 1);
		contentPane.add(table_4);
		
		table_5 = new JTable();
		table_5.setBounds(343, 546, 1, 1);
		contentPane.add(table_5);
		
		table_6 = new JTable();
		table_6.setBounds(293, 560, 1, 1);
		contentPane.add(table_6);
		
		table_7 = new JTable();
		table_7.setBounds(10, 648, 736, -160);
		contentPane.add(table_7);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(68, 566, 116, 38);
		contentPane.add(btnNewButton);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				SalesManagerHomePage.main(new String [] {});
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnCancel.setBounds(279, 566, 116, 38);
		contentPane.add(btnCancel);
		
		btnGenerateInvoice = new JButton("Generate Invoice");
		btnGenerateInvoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//*
				frame.dispose();
				invoicesm.main(new String[] {});
			}
		});
		//*
		btnGenerateInvoice.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnGenerateInvoice.setBounds(477, 566, 199, 38);
		contentPane.add(btnGenerateInvoice);
	}
}