package com.javaegitimleri.petclinic.web;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.javaegitimleri.petclinic.model.Owner;


public class PetClinicRestControllerTests {
	
	private RestTemplate restTemplate;
	
	@Before
	public void setUp() {
		restTemplate = new RestTemplate();
	}
	
	@Test
	public void testCreateOwner() {
		Owner owner = new Owner();
		
		owner.setFirstName("Ahmet");
		owner.setLastName("Aydın");
		
	    URI location =restTemplate.postForLocation("http://localhost:8080/rest/owner", owner);
		
	    Owner owner2 = restTemplate.getForObject(location, Owner.class);
	    
	    MatcherAssert.assertThat(owner2.getFirstName(), Matchers.equalTo(owner.getFirstName()));
	    MatcherAssert.assertThat(owner2.getLastName(), Matchers.equalTo(owner.getLastName()));
		
	} 
	
	@Test
	public void testGetOwnerById() {
	ResponseEntity<Owner> response = restTemplate.getForEntity("http://localhost:8080/rest/owner/1", Owner.class);
	
	MatcherAssert.assertThat(response.getStatusCodeValue(), Matchers.equalTo(200));
	MatcherAssert.assertThat(response.getBody().getFirstName(), Matchers.equalTo("Furkan"));
	}
	
	@Test
	public void testGetOwnerByLastName() {
	ResponseEntity<List> response = restTemplate.getForEntity("http://localhost:8080/rest/owner?ln=gulenc", List.class);
	
	MatcherAssert.assertThat(response.getStatusCode(), Matchers.equalTo(200));
	
	List<Map<String, String>> body = response.getBody();
	
	List<String> firstNames = body.stream().map(e->e.get("firstName")).collect(Collectors.toList()); 
		
	MatcherAssert.assertThat(firstNames, Matchers.containsInAnyOrder("Furkan", "Ali", "Seda" ,"Buse"));

	}
	
	@Test
	public void testGetOwners() {
		
		ResponseEntity<List> response =restTemplate.getForEntity("http://localhost:8080/rest/owners", List.class);
		
		MatcherAssert.assertThat(response.getStatusCodeValue(), Matchers.equalTo(200));
		
		List<Map<String, String>> body = response.getBody();
		
		List<String> firstNames = body.stream().map(e->e.get("firstName")).collect(Collectors.toList()); 
			
		MatcherAssert.assertThat(firstNames, Matchers.containsInAnyOrder("Furkan", "Ali", "Seda" ,"Buse"));


		}
	

		
	}
	
	


