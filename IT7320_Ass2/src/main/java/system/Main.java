package assignment2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.border.MatteBorder;

import javax.swing.UIManager;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		JFrame jframe = null;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 755, 573);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(50, 50, 50, 50));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(UIManager.getColor("ToolBar.dockingForeground"));
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(135, 206, 235)));
		panel.setBounds(0, 0, 737, 526);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/ccar.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(243, 116, 267, 159);
		panel.add(lblNewLabel);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				this.setVisible(false);
		        new Login().setVisible(true);

			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}

		});
		btnLogin.setBackground(UIManager.getColor("Tree.textBackground"));
		btnLogin.setBounds(323, 285, 97, 25);
		panel.add(btnLogin);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblParkMe = new JLabel("Parking Assist");
		lblParkMe.setBounds(233, 24, 308, 79);
		panel.add(lblParkMe);
		lblParkMe.setForeground(new Color(25, 25, 112));
		lblParkMe.setFont(new Font("Tahoma", Font.PLAIN, 45));
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.setVisible(false);
		        new Hello().setVisible(true);

			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}

		});
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegister.setBackground(Color.WHITE);
		btnRegister.setBounds(323, 323, 97, 25);
		panel.add(btnRegister);
		
		JButton btnViewZoneInformation = new JButton("Green Zone Information");
		btnViewZoneInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				JOptionPane.showMessageDialog(jframe, "Green Zone:\r\n $1.50 per hour\r\n" + 
						"Two-hour maximum parking duration\r\n" + 
						"Monday to Friday 9am–5pm\r\n" + 
						"Saturday P120 (no charge)\r\n" + 
						"Sunday and public holidays unrestricted");

			}
		});
		btnViewZoneInformation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnViewZoneInformation.setBackground(Color.WHITE);
		btnViewZoneInformation.setBounds(71, 370, 202, 25);
		panel.add(btnViewZoneInformation);
		
		JButton btnYellowZoneInformation = new JButton("Yellow Zone Information");
		btnYellowZoneInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(jframe, "Yellow Zone:\r\n $1 per hour\r\n" + 
						"$6 maximum daily charge\r\n" + 
						"No daily maximum parking duration\r\n" + 
						"Monday to Friday 9am–5pm\r\n" + 
						"Saturday, Sunday and public holidays unrestricted");
			}
		});
		btnYellowZoneInformation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnYellowZoneInformation.setBackground(Color.WHITE);
		btnYellowZoneInformation.setBounds(454, 370, 202, 25);
		panel.add(btnYellowZoneInformation);
		
		JButton btnOrangeZoneInformation = new JButton("Orange Zone Information");
		btnOrangeZoneInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(jframe, "Orange Zone:\r\n70 cents per hour\r\n" + 
						"$4 maximum daily charge\r\n" + 
						"No daily maximum parking duration\r\n" + 
						"Monday to Friday 9am–5pm\r\n" + 
						"Saturday, Sunday and public holidays unrestricted");
				
			}
		});
		btnOrangeZoneInformation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnOrangeZoneInformation.setBackground(Color.WHITE);
		btnOrangeZoneInformation.setBounds(71, 430, 202, 25);
		panel.add(btnOrangeZoneInformation);
		
		JButton btnBlueZoneInformation = new JButton("Blue Zone Information");
		btnBlueZoneInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(jframe, "Blue Zone:\r\n70 cents per hour, Monday to Friday 9am-5pm\r\n" + 
						"$2 per hour, Saturday 7am-2pm\r\n" + 
						"$4 maximum daily charge\r\n" + 
						"No daily maximum parking duration\r\n" + 
						"A monthly pass is available at $62 per month (reduced to $46 for December and January)." + 
						"Sunday and public holidays unrestricted");
			}
		});
		btnBlueZoneInformation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBlueZoneInformation.setBackground(Color.WHITE);
		btnBlueZoneInformation.setBounds(454, 430, 202, 25);
		panel.add(btnBlueZoneInformation);
		//frame.getContentPane().add(lblNewLabel);
		
	}
}
