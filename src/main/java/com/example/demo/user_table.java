package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class user_table {
	
	@Id
	private int iduser;
	private String first_name;
	private String last_name;
	
	public user_table(){}
	public user_table(int iduser, String first_name, String last_name) {
		super();
		this.iduser = iduser;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	@Override
	public String toString() {
		return "user_table [iduser=" + iduser + ", first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	
	

}
