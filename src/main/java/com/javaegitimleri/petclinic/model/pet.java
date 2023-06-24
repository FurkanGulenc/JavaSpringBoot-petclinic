package com.javaegitimleri.petclinic.model;

import java.util.Date;

public class pet {
	
	private long id;
	private String name;
	private Date birtDate;
	
	private Owner owner;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirtDate() {
		return birtDate;
	}

	public void setBirtDate(Date birtDate) {
		this.birtDate = birtDate;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "pet [id=" + id + ", name=" + name + ", birtDate=" + birtDate + ", owner=" + owner + "]";
	}
	
	

}
