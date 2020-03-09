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

public class Campaign extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
static Campaign frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Campaign();
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
	public Campaign() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCampaign = new JLabel("Campaign");
		lblCampaign.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCampaign.setBounds(176, 11, 90, 20);
		contentPane.add(lblCampaign);
		
		JLabel lblCampaignName = new JLabel("Campaign Name");
		lblCampaignName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCampaignName.setBounds(73, 71, 110, 20);
		contentPane.add(lblCampaignName);
		
		textField = new JTextField();
		textField.setBounds(215, 72, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnSave.setBounds(83, 150, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminHMpage.main(new String [] {});
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnCancel.setBounds(212, 151, 89, 23);
		contentPane.add(btnCancel);
	}

}
