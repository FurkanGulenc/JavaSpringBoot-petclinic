package com.javaegitimleri.petclinic.dao.mem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.javaegitimleri.petclinic.dao.OwnerRepository;
import com.javaegitimleri.petclinic.model.Owner;
 
@Repository
public class OwnerRepositoryMemoryImpl implements OwnerRepository {
	
	private Map<Long, Owner> ownersMap = new HashMap<>();
	
	public OwnerRepositoryMemoryImpl() {
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Furkan");
		owner1.setLastName("gulenc");
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Ali");
		owner2.setLastName("Türk");
		
		Owner owner3 = new Owner();
		owner3.setId(3L);
		owner3.setFirstName("Seda");
		owner3.setLastName("Tüysüz");
		
		Owner owner4 = new Owner();
		owner4.setId(4L);
		owner4.setFirstName("Buse");
		owner4.setLastName("Sarı");
		
		ownersMap.put(owner1.getId(), owner1);
		ownersMap.put(owner2.getId(), owner2);
		ownersMap.put(owner3.getId(), owner3);
		ownersMap.put(owner4.getId(), owner4);
		
		
	}

	@Override
	public List<Owner> findAll() {
		return new ArrayList<>(ownersMap.values());
	}

	@Override
	public Owner findById(long id) {
		return ownersMap.get(id);
	}

	@Override
	public List<Owner> findByLastName(String lastName) {
		return ownersMap.values().stream().filter(o->o.getLastName().equals(lastName)).collect(Collectors.toList());
	}

	@Override
	public void create(Owner owner) {
		ownersMap.put(owner.getId(), owner);

	}

	@Override
	public Owner update(Owner owner) {
		ownersMap.replace(owner.getId(), owner);
		return owner;
	}

	@Override
	public void delete(long id) {
		ownersMap.remove(id);

	}

}
