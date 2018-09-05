package assignment2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.RED);
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(135, 206, 235)));
		panel.setBounds(0, 0, 684, 463);
		contentPane.add(panel);
		
		JButton button = new JButton("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.setVisible(false);
		        new ParkCar().setVisible(true);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.setBackground(SystemColor.control);
		button.setBounds(281, 352, 97, 25);
		panel.add(button);
		
		textField = new JTextField();
		textField.setBounds(267, 241, 200, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(266, 276, 199, 22);
		panel.add(textField_1);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEmail.setBounds(215, 241, 56, 19);
		panel.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPassword.setBounds(185, 276, 82, 16);
		panel.add(lblPassword);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(272, 100, 138, 115);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("Parking Me-ter");
		label.setForeground(new Color(25, 25, 112));
		label.setFont(new Font("Tahoma", Font.PLAIN, 45));
		label.setBounds(193, 22, 308, 79);
		panel.add(label);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.setVisible(false);
		        new Main().setVisible(true);

			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
			
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.setBackground(SystemColor.menu);
		btnBack.setBounds(281, 403, 97, 25);
		panel.add(btnBack);
		
	
		
		
	}

}
