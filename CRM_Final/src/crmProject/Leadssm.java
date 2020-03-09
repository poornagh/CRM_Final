package crmProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class Leadssm extends JFrame {

private JPanel contentPane;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Leadssm frame = new Leadssm();
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
public Leadssm() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 583, 393);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);

//JLabel lblImage = new JLabel("Image");
//lblImage.setBounds(5, 0, 109, 63);
//Image img=new ImageIcon(this.getClass().getResource("/24gb.jpg")).getImage();
//contentPane.setLayout(null);
//lblImage.setIcon(new ImageIcon(img));
//contentPane.add(lblImage);

JLabel lblCrm = DefaultComponentFactory.getInstance().createTitle("CRM");
lblCrm.setBounds(217, 15, 40, 14);
contentPane.add(lblCrm);

JButton btnLogout = new JButton("Logout");
btnLogout.setBounds(492, 11, 65, 23);
contentPane.add(btnLogout);

JButton btnHome = new JButton("Home");
btnHome.setBounds(5, 40, 70, 23);
contentPane.add(btnHome);

JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Create Lead");
lblNewJgoodiesLabel.setBounds(217, 77, 59, 14);
contentPane.add(lblNewJgoodiesLabel);

JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Lead Owner");
lblNewJgoodiesTitle.setBounds(59, 117, 102, 14);
contentPane.add(lblNewJgoodiesTitle);

JComboBox comboBox = new JComboBox();
comboBox.setBounds(171, 114, 157, 20);
contentPane.add(comboBox);

JLabel lblLeadName = DefaultComponentFactory.getInstance().createTitle("Lead Name");
lblLeadName.setBounds(59, 151, 102, 14);
contentPane.add(lblLeadName);

textField = new JTextField();
textField.setBounds(171, 145, 157, 20);
contentPane.add(textField);
textField.setColumns(10);

textField_1 = new JTextField();
textField_1.setBounds(171, 176, 157, 20);
contentPane.add(textField_1);
textField_1.setColumns(10);

textField_2 = new JTextField();
textField_2.setBounds(171, 207, 157, 20);
contentPane.add(textField_2);
textField_2.setColumns(10);

JComboBox comboBox_1 = new JComboBox();
comboBox_1.setBounds(171, 238, 157, 20);
contentPane.add(comboBox_1);

JLabel lblNewJgoodiesTitle_1 = DefaultComponentFactory.getInstance().createTitle("Mobile Number");
lblNewJgoodiesTitle_1.setBounds(59, 179, 70, 14);
contentPane.add(lblNewJgoodiesTitle_1);

JLabel lblNewJgoodiesTitle_2 = DefaultComponentFactory.getInstance().createTitle("Email id");
lblNewJgoodiesTitle_2.setBounds(59, 210, 102, 14);
contentPane.add(lblNewJgoodiesTitle_2);

JLabel lblLeadssmsmource = DefaultComponentFactory.getInstance().createTitle("Lead Source");
lblLeadssmsmource.setBounds(59, 241, 102, 14);
contentPane.add(lblLeadssmsmource);

JButton btnSave = new JButton("Save");
btnSave.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
}
});
btnSave.setBounds(195, 296, 114, 23);
contentPane.add(btnSave);

JButton btnNewButton = new JButton("Cancel");
btnNewButton.setBounds(399, 296, 65, 23);
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
}
});
contentPane.add(btnNewButton);

JButton btnNewButton_1 = new JButton("Campaign");
btnNewButton_1.setBounds(72, 40, 89, 23);
btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
}
});
contentPane.add(btnNewButton_1);

JButton btnLeadssmsm = new JButton("Leadssmsm");
btnLeadssmsm.setBounds(154, 40, 89, 23);
contentPane.add(btnLeadssmsm);

JButton btnQuotes = new JButton("Quotes");
btnQuotes.setBounds(239, 40, 89, 23);
contentPane.add(btnQuotes);

JButton btnNewButton_2 = new JButton("Sales Order");
btnNewButton_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
}
});
btnNewButton_2.setBounds(321, 40, 89, 23);
contentPane.add(btnNewButton_2);

JButton btnNewButton_3 = new JButton("Invoice");
btnNewButton_3.setBounds(397, 40, 89, 23);
contentPane.add(btnNewButton_3);

JButton btnNewButton_4 = new JButton("Product");
btnNewButton_4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
}
});
btnNewButton_4.setBounds(478, 40, 89, 23);
contentPane.add(btnNewButton_4);
}
}
