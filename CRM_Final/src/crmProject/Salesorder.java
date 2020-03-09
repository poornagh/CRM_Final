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

public class Salesorder extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	static Salesorder frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new Salesorder();
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
	public Salesorder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSalesOrder = new JLabel("Sales Order");
		lblSalesOrder.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblSalesOrder.setBounds(181, 26, 90, 20);
		contentPane.add(lblSalesOrder);
		
		JLabel lblSaleOrderNo = new JLabel("Saleorder No");
		lblSaleOrderNo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSaleOrderNo.setBounds(83, 93, 90, 14);
		contentPane.add(lblSaleOrderNo);
		
		textField = new JTextField();
		textField.setBounds(206, 91, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnSave.setBounds(94, 177, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminHMpage.main(new String [] {});
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnCancel.setBounds(237, 178, 89, 23);
		contentPane.add(btnCancel);
	}
}
