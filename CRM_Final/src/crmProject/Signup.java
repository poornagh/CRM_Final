package crmProject;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Signup extends JFrame {
//
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	static Signup frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new Signup();
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
	public Signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Signup");
		lblNewLabel.setBounds(190, 11, 80, 20);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(79, 65, 46, 14);
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(184, 63, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(79, 101, 60, 14);
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(184, 99, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblMobileNo = new JLabel("Mobile No");
		lblMobileNo.setBounds(79, 140, 65, 14);
		lblMobileNo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblMobileNo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(184, 138, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEmailId = new JLabel("Email Id");
		lblEmailId.setBounds(79, 177, 55, 20);
		lblEmailId.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblEmailId);
		
		textField_3 = new JTextField();
		textField_3.setBounds(184, 178, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblRole = new JLabel("Role");
		lblRole.setBounds(79, 219, 46, 14);
		lblRole.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblRole);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Salesmanager"}));
		comboBox.setBounds(184, 226, 86, 22);
		
		contentPane.add(comboBox);
		
		JButton btnSignup = new JButton("SignUp");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminHMpage.main(new String [] {});
			}
		});
				
		btnSignup.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnSignup.setBounds(90, 305, 89, 23);
		contentPane.add(btnSignup);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Signin.main(new String [] {});
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnCancel.setBounds(232, 306, 89, 23);
		contentPane.add(btnCancel);
	}
}
