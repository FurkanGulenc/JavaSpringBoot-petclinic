package com.javaegitimleri.petclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Owner {
	
	private long id;
	private String firstName;
	private String lastName;
	
	private Set<pet> pets= new HashSet<>(); 
	
	
	public Set<pet> getPets() {
		return pets;
	}
	public void setPets(Set<pet> pets) {
		this.pets = pets;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Owner [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
