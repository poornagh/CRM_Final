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

public class Quotes extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	static Quotes frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new Quotes();
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
	public Quotes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuotes = new JLabel("Quotes");
		lblQuotes.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblQuotes.setBounds(167, 31, 90, 20);
		contentPane.add(lblQuotes);
		
		JLabel lblQuotesNo = new JLabel("Quotes No");
		lblQuotesNo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblQuotesNo.setBounds(89, 101, 90, 20);
		contentPane.add(lblQuotesNo);
		
		textField = new JTextField();
		textField.setBounds(203, 102, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnSave.setBounds(90, 174, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminHMpage.main(new String[] {});
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnCancel.setBounds(255, 175, 89, 23);
		contentPane.add(btnCancel);
	}

}
