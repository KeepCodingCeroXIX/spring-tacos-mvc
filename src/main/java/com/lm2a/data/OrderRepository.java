package com.lm2a.data;

import org.springframework.data.repository.CrudRepository;

import com.lm2a.model.Ingredient;
import com.lm2a.model.Order;
import com.lm2a.model.Taco;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
