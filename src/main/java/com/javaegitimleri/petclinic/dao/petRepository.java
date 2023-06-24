package com.javaegitimleri.petclinic.dao;

import java.util.List;

import com.javaegitimleri.petclinic.model.pet;

public interface petRepository {
	
	List<pet> findAll();
	pet findById(long id);
	List<pet> findByOwnerId(long ownerId);
	void create (pet pet);
	pet update(pet pet);
	void delete(long id);
	void deleteByOwnerId(long ownerId);


}
