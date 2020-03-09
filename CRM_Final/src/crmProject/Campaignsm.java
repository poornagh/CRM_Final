package crmProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Choice;
import java.awt.Checkbox;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Campaignsm extends JFrame {
//
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTable table_1;
	private JTextField textField_2;
	 static Campaignsm frame;
	/**
	 * @wbp.nonvisual location=-38,219
	 */
	private final JTextArea textArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new Campaignsm();
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
	public Campaignsm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreateCampaign = new JLabel("Create campaign");
		lblCreateCampaign.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCreateCampaign.setBounds(10, 79, 123, 22);
		contentPane.add(lblCreateCampaign);
		
		JLabel lblCampaignOwner = new JLabel("Campaign owner");
		lblCampaignOwner.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCampaignOwner.setBounds(99, 112, 110, 14);
		contentPane.add(lblCampaignOwner);
		
		JList list = new JList();
		list.setBounds(245, 115, 0, -37);
		contentPane.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(265, 125, 1, 1);
		contentPane.add(list_1);
		
		JList list_2 = new JList();
		list_2.setBounds(265, 115, 1, 1);
		contentPane.add(list_2);
		
		JLabel lblCampaignName = new JLabel("Campaign name");
		lblCampaignName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCampaignName.setBounds(99, 152, 98, 14);
		contentPane.add(lblCampaignName);
		
		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStartDate.setBounds(99, 197, 87, 14);
		contentPane.add(lblStartDate);
		
		JLabel lblEndDate = new JLabel("End Date");
		lblEndDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEndDate.setBounds(99, 236, 98, 14);
		contentPane.add(lblEndDate);
		
		table = new JTable();
		table.setBounds(258, 187, -68, -21);
		contentPane.add(table);
		
		JLabel lblTypeOfCampaign = new JLabel("Type of Campaign");
		lblTypeOfCampaign.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTypeOfCampaign.setBounds(87, 282, 110, 14);
		contentPane.add(lblTypeOfCampaign);
		
		JCheckBox chckbxOnline = new JCheckBox("Online");
		chckbxOnline.setBounds(153, 314, 60, 23);
		contentPane.add(chckbxOnline);
		
		JList list_3 = new JList();
		list_3.setBounds(361, 155, 1, 1);
		contentPane.add(list_3);
		
		JList list_4 = new JList();
		list_4.setBounds(281, 125, 1, 1);
		contentPane.add(list_4);
		
		JCheckBox chckbxMail = new JCheckBox("Mail");
		chckbxMail.setBounds(222, 314, 60, 23);
		contentPane.add(chckbxMail);
		
		JCheckBox chckbxSchool = new JCheckBox("School");
		chckbxSchool.setBounds(297, 314, 70, 23);
		contentPane.add(chckbxSchool);
		
		JCheckBox chckbxCollages = new JCheckBox("Collages");
		chckbxCollages.setBounds(396, 314, 77, 23);
		contentPane.add(chckbxCollages);
		
		textField = new JTextField();
		textField.setBounds(207, 149, 108, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(207, 109, 108, 20);
		contentPane.add(comboBox);
		
		table_1 = new JTable();
		table_1.setBounds(299, 177, -92, -21);
		contentPane.add(table_1);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStatus.setBounds(97, 363, 50, 14);
		contentPane.add(lblStatus);
		
		JCheckBox chckbxActive = new JCheckBox("Active");
		chckbxActive.setBounds(153, 354, 97, 23);
		contentPane.add(chckbxActive);
		
		JCheckBox chckbxInactive = new JCheckBox("Inactive");
		chckbxInactive.setBounds(281, 354, 97, 23);
		contentPane.add(chckbxInactive);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDescription.setBounds(88, 404, 70, 14);
		contentPane.add(lblDescription);
		
		textField_2 = new JTextField();
		textField_2.setBounds(168, 397, 305, 28);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(195, 436, 70, 23);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				SalesManagerHomePage.main(new String [] {});
			}
			
		});
		btnCancel.setBounds(313, 436, 81, 23);
		contentPane.add(btnCancel);
		
		JLabel lblImage = new JLabel("image");
		lblImage.setBounds(10, 11, 46, 14);
		contentPane.add(lblImage);
		
		JLabel lblCrm = new JLabel("CRM");
		lblCrm.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCrm.setBounds(280, 11, 46, 14);
		contentPane.add(lblCrm);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				SalesManagerHomePage.main(new String [] {});
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogout.setBounds(547, 2, 89, 23);
		contentPane.add(btnLogout);
		
		JButton btnHome = new JButton("Home");
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnHome.setBounds(0, 26, 87, 22);
		contentPane.add(btnHome);
		
		JButton btnCampaign = new JButton("Campaign");
		btnCampaign.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnCampaign.setBounds(78, 26, 108, 22);
		contentPane.add(btnCampaign);
		
		JButton btnLeads = new JButton("Leads");
		btnLeads.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnLeads.setBounds(177, 26, 89, 23);
		contentPane.add(btnLeads);
		
		JButton btnQuotes = new JButton("Quotes");
		btnQuotes.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnQuotes.setBounds(264, 26, 98, 23);
		contentPane.add(btnQuotes);
		
		JButton btnSalesOrder = new JButton("Sales Order");
		btnSalesOrder.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnSalesOrder.setBounds(350, 26, 110, 23);
		contentPane.add(btnSalesOrder);
		
		JButton btnInvoice = new JButton("Invoice");
		btnInvoice.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnInvoice.setBounds(452, 26, 87, 23);
		contentPane.add(btnInvoice);
		
		JButton btnPurchaseOrder = new JButton("Purchase Order");
		btnPurchaseOrder.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnPurchaseOrder.setBounds(538, 26, 98, 23);
		contentPane.add(btnPurchaseOrder);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(207, 197, 91, 20);
		contentPane.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(207, 230, 91, 20);
		contentPane.add(dateChooser_1);
	}
}