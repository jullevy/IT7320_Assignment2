package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import classes.User;
import database.DatabaseConn;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtEmail;
	private JTextField txtPassword;

	DatabaseConn dbConn = new DatabaseConn();
	User user = new User();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("first name");
		txtFirstName.setBounds(141, 91, 148, 20);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setText("email");
		txtEmail.setBounds(141, 122, 148, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("password");
		txtPassword.setBounds(141, 153, 148, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user.setName(txtFirstName.getText());
				user.setEmail(txtEmail.getText());
				user.setPassword(txtPassword.getText());
			}
		});
		btnRegister.setBounds(169, 197, 89, 23);
		contentPane.add(btnRegister);
	}
}
