package crmProject;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Product extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	static Product frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new Product();
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
	public Product() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProduct = new JLabel("Product");
		lblProduct.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblProduct.setBounds(169, 28, 90, 20);
		contentPane.add(lblProduct);
		
		JLabel lblCreateProductId = new JLabel(" Product Id");
		lblCreateProductId.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCreateProductId.setBounds(67, 96, 110, 20);
		contentPane.add(lblCreateProductId);
		
		textField = new JTextField();
		textField.setBounds(242, 97, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCreateProductName = new JLabel(" Product Name");
		lblCreateProductName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCreateProductName.setBounds(67, 150, 130, 20);
		contentPane.add(lblCreateProductName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(242, 151, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnSave.setBounds(88, 208, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminHMpage.main(new String[] {});
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnCancel.setBounds(223, 208, 89, 23);
		contentPane.add(btnCancel);
	}

}
