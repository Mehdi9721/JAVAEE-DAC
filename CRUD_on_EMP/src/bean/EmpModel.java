package bean;

import java.io.Serializable;
//javabean
public class EmpModel implements Serializable{
	int idForEdit;
	public int getIdForEdit() {
		return idForEdit;
	}
	public void setIdForEdit(int idForEdit) {
		this.idForEdit = idForEdit;
	}
	public EmpModel() {
		
	}
	public EmpModel(int empid , String name, String email, String country, String gender, String pass) {
		super();
		this.id = empid;
		this.name = name;
		this.email = email;
		this.country = country;
		this.gender = gender;
		this.pass = pass;
	}
	private int id;
	private String name,email,country,gender,pass;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
