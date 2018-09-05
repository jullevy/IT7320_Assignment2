/*package assignment2;
	
//	import classes.User;
	import java.sql.*;

	public class Connection {

		private String url = "jdbc:mysql://localhost:3306/test";
		private String username = "root";
		private String pass = "";
		private Connection conn;
		
		public void connectToBD() {
			try {
				this.conn = (Connection) DriverManager.getConnection(url, username, pass);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public boolean login(User user) {
			
			this.connectToBD();
			
			try {
				
				PreparedStatement statement = conn.prepareStatement("select * from user where email = " + user.getEmail());
				ResultSet rs = statement.executeQuery();
				
				while(rs.next()) {
					
					if(user.getEmail().equals(rs.getString("email"))) {
						if(user.getPassword().equals(rs.getString("password"))) {
							conn.close();
							statement.close();
							
							return true;
						} else if(!user.getPassword().equals(rs.getString("password"))) {
							conn.close();
							statement.close();
							
							return false;
						}
					} else {
						return false;
					}
				}		
				conn.close();
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return false;
		}
		
		public boolean createUser(User user) {
			
			this.connectToBD();
			
			try {
				PreparedStatement statement = conn.prepareStatement("insert into user (fname, email, password) values (?, ?, ?)");
				
				statement.setString( 1, user.getName());
				statement.setString( 2, user.getEmail());
				statement.setString( 3, user.getPassword());			
				statement.execute();
				
				statement.close();
				conn.close();
				return true;
			} catch (SQLException e) {
				e.printStackTrace();
			}

			return false;
		}
		/**
		 * Function will check if user entered a unique email, as a unique entry is a requirement for the database to acept a new user account
		 * 
		 * @param user		User object from input details
		 * @return			true - if email is unique
		 * 					false - if email not unique or exception 
		 
		public boolean checkUniqueEmail(User user) {
			
			this.connectToBD();
			
			try {
				
				PreparedStatement statement = conn.prepareStatement( "select * from user where email = " + user.getEmail());			
				ResultSet rs = statement.executeQuery();
				
				while(rs.next()) {
					if( user.getEmail().equals(rs.getString("email"))) {
						conn.close();
						statement.close();
						
						return false;
					} else {
						return true;
					}
				}
				
				conn.close();
				statement.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return false;
		}
	}

}
*/