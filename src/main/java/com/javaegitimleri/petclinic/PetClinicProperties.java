package com.javaegitimleri.petclinic;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix ="petclinic")

public class PetClinicProperties {
	
	private boolean displayOwnersWithPet=false; 
	
	public boolean isDisplayOwnersWithPet() {
		return displayOwnersWithPet;
	}
	public void setDisplayOwnersWithPet(boolean displayOwnersWithPet) {
		this.displayOwnersWithPet = displayOwnersWithPet;
	}


}
