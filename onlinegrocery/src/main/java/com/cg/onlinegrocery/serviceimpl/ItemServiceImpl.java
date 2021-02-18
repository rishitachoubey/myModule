package com.cg.onlinegrocery.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlinegrocery.domain.Item;
import com.cg.onlinegrocery.domain.Order;
import com.cg.onlinegrocery.repository.ItemRepository;
import com.cg.onlinegrocery.repository.OrderRepository;
import com.cg.onlinegrocery.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public Item saveOrUpdate(Item item) {
	   
		//Exceptions:
		// 1. Item Name == Product Name
		// 2. Product Count< itemQuantity 
		
		return itemRepository.save(item);
	  
	}
	@Override
	 public Iterable<Item> findAll() {
	        return itemRepository.findAll();
	    }
	

}
