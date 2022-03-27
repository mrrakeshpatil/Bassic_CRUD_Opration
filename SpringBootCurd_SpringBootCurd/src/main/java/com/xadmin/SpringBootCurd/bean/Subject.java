package com.xadmin.SpringBootCurd.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Subject")
public class Subject {

	@Id
  private String id;
  public Subject(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
  
public Subject() {
	super();
	// TODO Auto-generated constructor stub
}

private String name;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 
}
