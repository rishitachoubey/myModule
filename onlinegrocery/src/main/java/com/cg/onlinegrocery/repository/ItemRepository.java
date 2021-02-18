package com.cg.onlinegrocery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlinegrocery.domain.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {

	//Iterable<Item> findByOrderIdentifier(String orderIdentifier);
	
	
}
