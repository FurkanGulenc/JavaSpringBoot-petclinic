package com.javaegitimleri.petclinic.service;

import java.util.List;
import com.javaegitimleri.petclinic.exceptions.OwnerNotFoundException;
import com.javaegitimleri.petclinic.model.Owner;

public interface PetClinicService {
	
	List<Owner> findOwners();
	
	List<Owner> findOwners(String lastName);
	
	Owner findOwner(long id) throws OwnerNotFoundException;
	
	void createOwner(Owner owner);
	
	void updateOwner(Owner owner);
	
	void DeleteOwner(long id);

	
	
	
	
	
}
