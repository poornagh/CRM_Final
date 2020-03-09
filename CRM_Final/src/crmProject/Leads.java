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

public class Leads extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	 static Leads frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new Leads();
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
	public Leads() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLeads = new JLabel("Leads");
		lblLeads.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblLeads.setBounds(183, 11, 90, 20);
		contentPane.add(lblLeads);
		
		JLabel lblCreateLeadName = new JLabel("Create Lead Name");
		lblCreateLeadName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCreateLeadName.setBounds(72, 76, 110, 20);
		contentPane.add(lblCreateLeadName);
		
		textField = new JTextField();
		textField.setBounds(223, 77, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnSave.setBounds(78, 152, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminHMpage.main( new String [] {});
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnCancel.setBounds(220, 153, 89, 23);
		contentPane.add(btnCancel);
	}

}
