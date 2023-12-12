package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentModel {
	@Id
	private int id;
	
private String name;
StudentModel(){
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "StudentModel [name=" + name + ", id=" + id + "]";
}


}
