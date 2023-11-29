package com.mehdi.demoHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Demo {
	@Id
private int eid ;
private String name;
public int getId() {
	return eid;
}
public void setId(int id) {
	this.eid = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
