package assignment2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hello extends JFrame {

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
					Hello frame = new Hello();
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
	public Hello() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) UIManager.getColor("activeCaption")));
		panel.setBounds(0, 0, 692, 465);
		contentPane.add(panel);
		
		JLabel label = new JLabel("First Name: ");
		label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label.setBounds(204, 228, 92, 16);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Email:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_1.setBounds(204, 257, 92, 16);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(297, 227, 200, 22);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(297, 257, 200, 22);
		panel.add(textField_1);
		
		JLabel label_2 = new JLabel("Password:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_2.setBounds(204, 286, 82, 16);
		panel.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(297, 286, 199, 22);
		panel.add(textField_2);
		
		JButton button = new JButton("Register");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				this.setVisible(false);
		        new ParkCar().setVisible(true);
				
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.setBounds(279, 354, 97, 25);
		panel.add(button);
		
		JLabel label_3 = new JLabel("Register");
		label_3.setForeground(SystemColor.activeCaption);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		label_3.setBounds(264, 111, 180, 79);
		panel.add(label_3);
		
		JLabel lblParkingAssist = new JLabel("Parking Assist");
		lblParkingAssist.setForeground(new Color(25, 25, 112));
		lblParkingAssist.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblParkingAssist.setBounds(189, 19, 308, 79);
		panel.add(lblParkingAssist);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.setVisible(false);
		        new Main().setVisible(true);

			}

			private void setVisible(boolean b) 
			{
				
			}
			
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.setBounds(279, 390, 97, 25);
		panel.add(btnBack);
	}

}
