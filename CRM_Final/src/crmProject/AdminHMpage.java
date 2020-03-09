package crmProject;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.List;
import java.awt.Label;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JTextArea;

public class AdminHMpage extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	 static  AdminHMpage frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				 frame = new AdminHMpage();
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
	public AdminHMpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CRM TOOL");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(0, 0, 167, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Signin.main(new String []{});
			}
		});
		btnLogout.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnLogout.setBounds(686, 0, 126, 29);
		contentPane.add(btnLogout);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(0, 32, 89, 23);
		contentPane.add(btnHome);
		
		JButton btnCampaing = new JButton("Campaign");
		btnCampaing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Campaigntable.main(new String [] {});
			}
		});
		btnCampaing.setBounds(87, 32, 100, 23);
		contentPane.add(btnCampaing);
		
		JButton btnLeads = new JButton("Leads");
		btnLeads.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Leadstable.main(new String [] {});
			}
		});
		btnLeads.setBounds(186, 32, 78, 23);
		contentPane.add(btnLeads);
		
		JButton btnQuotes = new JButton("Quotes");
		btnQuotes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Quotestable.main(new String [] {});
			}
		});
		btnQuotes.setBounds(351, 32, 89, 23);
		contentPane.add(btnQuotes);
		
		JButton btnSalesOrder = new JButton("Sales Order");
		btnSalesOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Saleordertable.main(new String [] {});
			}
		});
		btnSalesOrder.setBounds(439, 32, 131, 23);
		contentPane.add(btnSalesOrder);
		
		JButton btnInvoice = new JButton("Invoice");
		btnInvoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Invoicetable.main(new String [] {});
			}
		});
		btnInvoice.setBounds(570, 32, 89, 23);
		contentPane.add(btnInvoice);
		
		JButton btnPurchaseOrder = new JButton("Purchase Order");
		btnPurchaseOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Purchasrordertable.main(new String [] {});
			}
			
			
		});
		btnPurchaseOrder.setBounds(655, 32, 157, 23);
		contentPane.add(btnPurchaseOrder);
		
		JButton btnProduct = new JButton("Product");
		btnProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Producttable.main(new String [] {});
			}
		});
		btnProduct.setBounds(263, 32, 89, 23);
		contentPane.add(btnProduct);
		
		table_1 = new JTable();
		table_1.setBounds(374, 107, -118, 64);
		contentPane.add(table_1);
		
		JButton btnCreateCampaign = new JButton("Create \r\nCampaign\r\n  owner");
		btnCreateCampaign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.dispose();
			Campaign.main(new String [] {});
			}
		});
		btnCreateCampaign.setBounds(20, 107, 167, 58);
		contentPane.add(btnCreateCampaign);
		
		JButton btnCreateLeadOwner = new JButton("Create \r\nLead\r\n  owner");
		btnCreateLeadOwner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Leads.main(new  String [] {});
			}
			
		});
		btnCreateLeadOwner.setBounds(212, 107, 167, 58);
		contentPane.add(btnCreateLeadOwner);
		
		JButton btnCreateProduct = new JButton("Create \r\nProduct");
		btnCreateProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Product.main(new String [] {});
			}
		});
		btnCreateProduct.setBounds(439, 107, 167, 58);
		contentPane.add(btnCreateProduct);
		
		JButton btnCreateQuotes = new JButton("Create \r\nQuotes");
		btnCreateQuotes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Quotes.main(new String[] {});
			}
		});
		btnCreateQuotes.setBounds(631, 107, 167, 58);
		contentPane.add(btnCreateQuotes);
		
		JButton btnCreateSaleorder = new JButton("Create \r\nSaleOrder");
		btnCreateSaleorder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Salesorder.main(new String [] {});
			}
		});
		btnCreateSaleorder.setBounds(20, 249, 167, 58);
		contentPane.add(btnCreateSaleorder);
		
		JButton btnCreateInvoice = new JButton("Create \r\nInvoice");
		btnCreateInvoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Invoice.main(new String [] {});
			}
		});
		btnCreateInvoice.setBounds(212, 249, 167, 58);
		contentPane.add(btnCreateInvoice);
	}
}
