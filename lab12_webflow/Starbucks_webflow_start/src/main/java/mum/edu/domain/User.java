package mum.edu.domain;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = 4321030766673021580L;
	private String name;
	private String password;

	public User() {
	}

	public User(String name, String password) {
		this.password = password;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
