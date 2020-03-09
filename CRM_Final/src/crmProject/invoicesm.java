package crmProject;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class invoicesm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JTable table_1;
	static invoicesm frame;
	/**
	 * @wbp.nonvisual location=-20,159
	 */
	private final JTable table_2 = new JTable();
	private JTable table_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new invoicesm();
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
	public invoicesm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 1700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INVOICE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(248, 11, 92, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Create  Invoice");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 39, 116, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblInvoiceNo = new JLabel("Invoice No");
		lblInvoiceNo.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblInvoiceNo.setBounds(356, 35, 116, 24);
		contentPane.add(lblInvoiceNo);
		
		JLabel lblInvoiceDate = new JLabel("Invoice Date");
		lblInvoiceDate.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblInvoiceDate.setBounds(356, 69, 116, 24);
		contentPane.add(lblInvoiceDate);
		
		textField = new JTextField();
		textField.setBounds(482, 39, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(482, 73, 91, 20);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel_2 = new JLabel("Sales order No");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(23, 95, 116, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(167, 89, 116, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Customer Name");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(23, 136, 116, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(167, 130, 116, 30);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_4 = new JLabel("Email Id");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(29, 183, 97, 24);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(167, 182, 116, 30);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_5 = new JLabel("Mobile No");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(29, 229, 97, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(167, 223, 116, 30);
		contentPane.add(textField_4);
		
		table = new JTable();
		table.setBounds(157, 361, 1, 1);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(10, 448, 449, -86);
		contentPane.add(table_1);
		
		table_3 = new JTable();
		table_3.setBounds(23, 264, 465, 121);
		contentPane.add(table_3);
		
		JLabel lblNewLabel_6 = new JLabel("Customer Address");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(10, 435, 157, 26);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Shipping Address");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(407, 436, 138, 24);
		contentPane.add(lblNewLabel_7);
		
		JButton btnCoppyAddress = new JButton("Copy Address");
		btnCoppyAddress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCoppyAddress.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnCoppyAddress.setBounds(186, 393, 166, 23);
		contentPane.add(btnCoppyAddress);
		
		JLabel lblNewLabel_8 = new JLabel("Address 1");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(10, 495, 107, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel label = new JLabel("Address 1");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label.setBounds(316, 495, 107, 14);
		contentPane.add(label);
		
		textField_5 = new JTextField();
		textField_5.setBounds(131, 494, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(446, 494, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address 2");
		lblAddress.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblAddress.setBounds(10, 535, 107, 14);
		contentPane.add(lblAddress);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(131, 534, 86, 20);
		contentPane.add(textField_7);
		
		JLabel lblAddress_1 = new JLabel("Address 2");
		lblAddress_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblAddress_1.setBounds(316, 535, 107, 14);
		contentPane.add(lblAddress_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(446, 534, 86, 20);
		contentPane.add(textField_8);
		
		JLabel lblPincode = new JLabel("Pincode");
		lblPincode.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPincode.setBounds(10, 575, 107, 14);
		contentPane.add(lblPincode);
		
		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblState.setBounds(10, 612, 107, 14);
		contentPane.add(lblState);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCountry.setBounds(10, 637, 107, 24);
		contentPane.add(lblCountry);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(131, 565, 86, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(131, 596, 86, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(131, 641, 86, 20);
		contentPane.add(textField_11);
		
		JLabel label_1 = new JLabel("Pincode");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label_1.setBounds(316, 575, 107, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("State");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label_2.setBounds(316, 612, 107, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Country");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label_3.setBounds(316, 637, 107, 24);
		contentPane.add(label_3);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(446, 574, 86, 20);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(446, 611, 86, 20);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(446, 641, 86, 20);
		contentPane.add(textField_14);
		
		JButton btnNewButton = new JButton("Print");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(157, 697, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				SalesManagerHomePage.main(new String [] {});
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(316, 697, 107, 23);
		contentPane.add(btnNewButton_1);
	}
}
