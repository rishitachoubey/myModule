package com.cg.onlinegrocery.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlinegrocery.domain.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
	Order findByOrderIdentifier(String orderIdentifier);	

}
