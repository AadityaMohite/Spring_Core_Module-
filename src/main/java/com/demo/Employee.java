package com.aadi;

import java.util.List;

import javax.sound.midi.SysexMessage;

public class Employee {
  private int id;
  private String name;
  private String dep;
  private String[] skill;
  private List<String> roles;
  
  void display() {
	  
	  System.out.println("Id: "+id);
	  System.out.println("Name: "+name);
	  System.out.println("Department: "+dep);
	  for (String s : skill) {
		System.out.println(s);
	}
	  
	  for (String s : roles) {
		System.out.println(s);
	}
	  System.out.println("------------------------------------------------------");
  }
  
  
  
  
  
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
  public String getDep() {
	return dep;
  }
  public void setDep(String dep) {
	this.dep = dep;
  }
  public String[] getSkill() {
	return skill;
  }
  public void setSkill(String[] skill) {
	this.skill = skill;
  }
  public List<String> getRoles() {
	return roles;
  }
  public void setRoles(List<String> roles) {
	this.roles = roles;
  }
  
}
