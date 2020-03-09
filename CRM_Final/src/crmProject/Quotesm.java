package crmProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

public class Quotesm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	  static Quotesm frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new Quotesm();
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
	public Quotesm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreateQuote = new JLabel("Create Quote");
		lblCreateQuote.setBounds(288, 106, 143, 31);
		lblCreateQuote.setFont(new Font("Arial", Font.BOLD, 13));
		contentPane.add(lblCreateQuote);
		
		JLabel lblQuoteName = new JLabel("Quote Name");
		lblQuoteName.setBounds(38, 165, 77, 15);
		lblQuoteName.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblQuoteName);
		
		textField = new JTextField();
		textField.setBounds(222, 163, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Lead Name");
		lblNewLabel.setBounds(38, 194, 77, 21);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblNewLabel);
		
		JList list = new JList();
		list.setBounds(248, 148, 0, 1);
		contentPane.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(237, 137, 1, 0);
		contentPane.add(list_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(222, 195, 86, 20);
		contentPane.add(comboBox);
		
		JLabel lblMobileNumber = new JLabel("Mobile Number");
		lblMobileNumber.setBounds(38, 226, 107, 15);
		lblMobileNumber.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblMobileNumber);
		
		textField_2 = new JTextField();
		textField_2.setBounds(222, 226, 86, 18);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(38, 261, 92, 15);
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setBounds(222, 255, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblProduct = new JLabel("Product");
		lblProduct.setBounds(38, 292, 77, 15);
		lblProduct.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblProduct);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(222, 287, 86, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("Unit Price");
		lblNewLabel_1.setBounds(38, 323, 92, 15);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(222, 321, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setBounds(38, 354, 44, 15);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_2);
		
		textField_6 = new JTextField();
		textField_6.setBounds(222, 352, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblQuoteValidity = new JLabel("Quote Validity");
		lblQuoteValidity.setBounds(38, 383, 92, 21);
		lblQuoteValidity.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblQuoteValidity);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(116, 456, 92, 23);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				SalesManagerHomePage.main(new String [] {});
			}
		});
		btnNewButton_1.setBounds(248, 455, 87, 23);
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Generate Sales Order");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				salesordersm.main(new String[] {});
			}
		});
		btnNewButton_2.setBounds(376, 453, 153, 24);
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("Quote Number");
		lblNewLabel_3.setBounds(354, 162, 77, 14);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Quote Order");
		lblNewLabel_4.setBounds(355, 195, 77, 14);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_4);
		
		textField_8 = new JTextField();
		textField_8.setBounds(472, 160, 67, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(472, 193, 67, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("HOME\r\n");
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton_3.setBounds(38, 52, 89, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("CAMPAIGN");
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton_4.setBounds(120, 52, 107, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("LEADS\r\n");
		btnNewButton_5.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton_5.setBounds(219, 52, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("QUOTES");
		btnNewButton_6.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton_6.setBounds(301, 52, 89, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("SALES ORDER");
		btnNewButton_7.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton_7.setBounds(383, 52, 115, 23);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton_7);
		
		JButton btnProducts = new JButton("INVOICE");
		btnProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProducts.setFont(new Font("Arial", Font.BOLD, 11));
		btnProducts.setBounds(490, 52, 89, 23);
		contentPane.add(btnProducts);
		
		JButton btnNewButton_8 = new JButton("Logout");
		btnNewButton_8.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton_8.setBounds(605, 11, 89, 23);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton_8);
		
		JButton btnProducts_1 = new JButton("PRODUCTS");
		btnProducts_1.setFont(new Font("Arial", Font.BOLD, 11));
		btnProducts_1.setBounds(568, 52, 99, 23);
		contentPane.add(btnProducts_1);
		
		JLabel lblCrm = new JLabel("CUSTOMER RELATIONSHIP MANAGEMENT");
		lblCrm.setFont(new Font("Arial", Font.BOLD, 13));
		lblCrm.setBounds(204, 17, 283, 24);
		contentPane.add(lblCrm);
		
		JLabel lblLogo = new JLabel("Logo");
		lblLogo.setBounds(38, 11, 46, 14);
		contentPane.add(lblLogo);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(222, 384, 86, 20);
		contentPane.add(dateChooser);
	}
}
