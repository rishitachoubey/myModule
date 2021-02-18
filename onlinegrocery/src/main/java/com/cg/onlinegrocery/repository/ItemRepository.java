package com.cg.onlinegrocery.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.onlinegrocery.domain.Item;

public interface ItemRepository extends CrudRepository<Item, Integer> {

}
