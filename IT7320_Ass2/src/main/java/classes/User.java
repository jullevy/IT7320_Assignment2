package classes;

public class User {

	private String name;
	private String email;
	private String password;
	
	// constructors
	public User() {}
	public User(String n, String e, String p) {
		this.name = n; this.email = e; this.password = p;
	}
	
	// getters and setters
	public void setName(String n) {
		this.name = n;
	}
	public void setEmail(String e) {
		this.email = e;
	}
	public void setPassword(String p) {
		this.password = p;
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getPassword() {
		return this.password;
	}
}
