package assignment2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


public class ParkCar extends JFrame {

	private JPanel contentPane;
	JFrame jframe;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParkCar frame = new ParkCar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
	    Scanner in = new Scanner(System.in);
        check obj = new check(); 
        private JTextField textField;
        private JTextField searchField;

	/**
	 * Create the frame.
	 */
	public ParkCar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 735, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 717, 523);
		panel.setLayout(null);
		panel.setForeground(Color.RED);
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(135, 206, 235)));
		contentPane.add(panel);
		
		JLabel lblParking = new JLabel("Parking Assist");
		lblParking.setForeground(new Color(25, 25, 112));
		lblParking.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblParking.setBounds(201, 13, 308, 79);
		panel.add(lblParking);
		
		JTextArea viewText = new JTextArea();
		viewText.setBackground(Color.WHITE);
		viewText.setBounds(293, 103, 395, 323);
		panel.add(viewText);		
	        
	        obj.parkingHM.put(1, "Stevens Grove, Green Zone - $1 per hour");
	        obj.parkingHM.put(2, "Knights Road, Green Zone - $1 per hour");
	        obj.parkingHM.put(3, "Laings Road, Yellow Zone - $1 per hour");
	        obj.parkingHM.put(4, "Myrtle Street, Orange Zone - 70c per hour");
	        obj.parkingHM.put(5, "Fraser Street, Green Zone - $1 per hour");
	        obj.parkingHM.put(6, "Riverbank Park, Blue Zone - 70c per hour");
	        obj.parkingHM.put(7, "Cornwall Street, Yellow Zone - $1 per hour");
	        obj.parkingHM.put(8, "Ward Street, Green Zone - $1 per hour");
	        obj.parkingHM.put(9, "Rutherford Street, Green Zone - $1 per hour");
	        obj.parkingHM.put(10, "High Street, Blue Zone - 70c per hour");
	        obj.parkingHM.put(11, "Pretoria Street, Green Zone - $1 per hour");
	        obj.parkingHM.put(12, "Dudley Street, Blue Zone - 70c per hour");
	        obj.parkingHM.put(13, "Queens Drive, Green Zone - $1 per hour");
	        obj.parkingHM.put(14, "Market Grove, Blue Zone - 70c per hour");
	        obj.parkingHM.put(15, "Osbourne Place, Yellow Zone - $1 per hour");
	        obj.parkingHM.put(16, "Vivian Street, Orange Zone - 70c per hour");
	        obj.parkingHM.put(17, "Bloomfield Terrace, Blue Zone - 70c per hour");
		
		JButton btnViewAllZones = new JButton("View all Parks");
		btnViewAllZones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{	
				 Set s = obj.parkingHM.entrySet();
                 Iterator itr = s.iterator();
                 while (itr.hasNext()) 
                 {
                	 
                     Map.Entry mapEntry = (Map.Entry) itr.next();
                     viewText.append("Parking ID: " + mapEntry.getKey() + " | Details: " + mapEntry.getValue() + "\n");
                     
                 }
	                
			}
		});
		
	
		btnViewAllZones.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnViewAllZones.setBounds(76, 116, 124, 25);
		panel.add(btnViewAllZones);
		
		JButton btnBookAPark = new JButton("Book Park");
		btnBookAPark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int takenPark = Integer.parseInt(textField.getText());
				
                if (obj.parkingHM.containsKey(takenPark)){
                obj.parkTaken.put(takenPark, obj.parkingHM.get(takenPark));
            	                
                JOptionPane.showMessageDialog(jframe, "Carpark: " + takenPark + " has been booked for an hour. ");


			}
			}
		});
		btnBookAPark.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBookAPark.setBounds(76, 213, 124, 25);
		panel.add(btnBookAPark);
		
		JLabel lblBookAPark = new JLabel("Book a park using park ID: ");
		lblBookAPark.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBookAPark.setBounds(14, 176, 186, 24);
		panel.add(lblBookAPark);
		
		textField = new JTextField();
		textField.setBounds(201, 178, 70, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnViewTakenParks = new JButton("View Taken Parks");
		btnViewTakenParks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  {
					  viewText.setText("");
                      Set s = obj.parkTaken.entrySet();
                      Iterator itr = s.iterator();
                  
                  while (itr.hasNext()) 
                  {
                	  viewText.setText("");
                      Map.Entry mapEntry = (Map.Entry) itr.next();
                      viewText.append("Taken Parks:" + "\n");

                      viewText.append("Parking ID: " + mapEntry.getKey() + " | Zone: " + mapEntry.getValue());
                  }

                  }
			}
		});
		btnViewTakenParks.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnViewTakenParks.setBounds(61, 363, 152, 25);
		panel.add(btnViewTakenParks);
		
		JButton btnViewFreeParks = new JButton("View Free Parks");
		btnViewFreeParks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 Set s = obj.parkingHM.entrySet();
                 Iterator itr = s.iterator();     
                   
                 while(itr.hasNext()) { 
                 Map.Entry mapEntry = (Map.Entry) itr.next();
                 
                 	if ( !obj.parkTaken.containsKey(mapEntry.getKey())) {
                 		obj.freePark.put((Integer) mapEntry.getKey(), (String) mapEntry.getValue());
                 
           	  
                 viewText.setText("");
                 Set s2 = obj.freePark.entrySet();
                 Iterator itr2 = s2.iterator();
                 
                 while (itr2.hasNext()) {
                 Map.Entry mapEntry2 = (Map.Entry) itr2.next();
                 viewText.append("Free park ID: " + mapEntry2.getKey() + " " + mapEntry2.getValue() + "\n");
             }
			}
                 
			}
			}
		});
		btnViewFreeParks.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnViewFreeParks.setBounds(61, 401, 152, 25);
		panel.add(btnViewFreeParks);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(64, 64, 64)));
		panel_1.setBounds(288, 100, 405, 331);
		panel.add(panel_1);
		
		JLabel lblSearchForPark = new JLabel("Search for park using Park ID: ");
		lblSearchForPark.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSearchForPark.setBounds(14, 267, 186, 24);
		panel.add(lblSearchForPark);
		
		searchField = new JTextField();
		searchField.setColumns(10);
		searchField.setBounds(201, 269, 70, 22);
		panel.add(searchField);
		
		JButton btnSearchPark = new JButton("Search Park");
		btnSearchPark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    
					int searchPark = Integer.parseInt(searchField.getText());
					
	                if (obj.parkingHM.containsKey(searchPark)){
	                obj.parkSearch.put(searchPark, obj.parkingHM.get(searchPark));
	                
	                {
						  viewText.setText("");
	                      Set s = obj.parkSearch.entrySet();
	                      Iterator itr = s.iterator();
	                  
	                while (itr.hasNext()) 
	                  {
	                	  viewText.setText("");
	                      Map.Entry mapEntry = (Map.Entry) itr.next();
	                      viewText.append("Park Search:" + "\n");

	                      viewText.append("Parking ID: " + mapEntry.getKey() + " | Zone: " + mapEntry.getValue());
	                  }
	                
			}
	                }
			}
			
		});
		btnSearchPark.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSearchPark.setBounds(76, 297, 124, 25);
		panel.add(btnSearchPark);
		
		JButton btnGoToMain = new JButton("Go To Main Menu");
		btnGoToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				this.setVisible(false);
		        new Main().setVisible(true);
				
			}

			private void setVisible(boolean b) 
			{

			}
			
		});
		btnGoToMain.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGoToMain.setBounds(61, 472, 158, 25);
		panel.add(btnGoToMain);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				viewText.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClear.setBounds(456, 472, 79, 25);
		panel.add(btnClear);
		
			}
}
		