package crmProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTable;

public class SalesManagerHomePage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	static SalesManagerHomePage frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new SalesManagerHomePage();
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
	public SalesManagerHomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCrm = new JLabel("CRM");
		lblCrm.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCrm.setBounds(20, 11, 46, 14);
		contentPane.add(lblCrm);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Signin.main(new String [] {});
			}
		});
		btnNewButton.setBounds(533, 7, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnHome.setBounds(0, 41, 75, 23);
		contentPane.add(btnHome);
		
		JButton btnCampaign = new JButton("Campaign");
		btnCampaign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Campaignsm.main(new String [] {});
			}
		});
		btnCampaign.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCampaign.setBounds(66, 41, 99, 23);
		contentPane.add(btnCampaign);
		
		JButton btnLeads = new JButton("Leads");
		btnLeads.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Leadssm.main(new String [] {});
				
			}
		});
		btnLeads.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLeads.setBounds(161, 41, 81, 23);
		contentPane.add(btnLeads);
		
		JButton btnQuotes = new JButton("Quotes");
		btnQuotes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Quotesm.main(new String [] {});
				
			}
		});
		btnQuotes.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnQuotes.setBounds(237, 41, 84, 23);
		contentPane.add(btnQuotes);
		
		JButton btnSalesOrder = new JButton("Sales Order");
		btnSalesOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				salesordersm.main(new String [] {});	
			}
		});
		btnSalesOrder.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalesOrder.setBounds(312, 41, 118, 23);
		contentPane.add(btnSalesOrder);
		
		JButton btnInvoice = new JButton("Invoice");
		btnInvoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				invoicesm.main(new String [] {});	
			}
		});
		btnInvoice.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnInvoice.setBounds(415, 41, 99, 23);
		contentPane.add(btnInvoice);
		
		JButton btnNewButton_1 = new JButton("Product");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Productsm.main(new String [] {});		
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(499, 41, 133, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnCompaing = new JButton("Compaign");
		btnCompaing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCompaing.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCompaing.setBounds(10, 75, 89, 23);
		contentPane.add(btnCompaing);
		
		JButton btnLeads_1 = new JButton("Leads");
		btnLeads_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLeads_1.setBounds(211, 75, 89, 23);
		contentPane.add(btnLeads_1);
		
		JButton btnQuotes_1 = new JButton("Quotes");
		btnQuotes_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnQuotes_1.setBounds(415, 75, 89, 23);
		contentPane.add(btnQuotes_1);
		
		JButton btnSalesOrder_1 = new JButton("Sales Order");
		btnSalesOrder_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSalesOrder_1.setBounds(10, 232, 110, 23);
		contentPane.add(btnSalesOrder_1);
		
		JButton btnInvoice_1 = new JButton("Invoice");
		btnInvoice_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnInvoice_1.setBounds(211, 232, 89, 23);
		contentPane.add(btnInvoice_1);
		
		JButton btnProduct = new JButton("Product");
		btnProduct.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnProduct.setBounds(415, 232, 89, 23);
		contentPane.add(btnProduct);
		
		table = new JTable();
		table.setBounds(10, 94, 110, 127);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(211, 94, 110, 117);
		contentPane.add(table_1);
		
		table_2 = new JTable();
		table_2.setBounds(415, 94, 110, 117);
		contentPane.add(table_2);
		
		table_3 = new JTable();
		table_3.setBounds(10, 252, 118, 117);
		contentPane.add(table_3);
		
		table_4 = new JTable();
		table_4.setBounds(211, 252, 110, 117);
		contentPane.add(table_4);
		
		table_5 = new JTable();
		table_5.setBounds(415, 252, 110, 117);
		contentPane.add(table_5);
	}
}
