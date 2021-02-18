package com.cg.onlinegrocery.serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.onlinegrocery.domain.Order;
import com.cg.onlinegrocery.exception.OrderIdException;
import com.cg.onlinegrocery.repository.OrderRepository;
import com.cg.onlinegrocery.service.OrderService;


@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public Order saveOrUpdate(Order order)
	{
		try {
		order.setOrderIdentifier(order.getOrderIdentifier().toUpperCase());
		
		return orderRepository.save(order);
		}
		catch(Exception e)
		{
			throw new OrderIdException("Order Id"+ order.getOrderIdentifier().toUpperCase()+" already exists");
		}
		
	}
	
	public Order findOrderByOrderIdentifier(String orderIdentifier) {
		Order order = orderRepository.findByOrderIdentifier(orderIdentifier.toUpperCase());
		if (order == null) {
			throw new OrderIdException("Order Id : " + orderIdentifier.toUpperCase() + " does not exist");
		}
		return order;
	}
	
	public Iterable<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	public void deleteOrderByIdentifier(String orderIdentifier) {
		Order order = orderRepository.findByOrderIdentifier(orderIdentifier.toUpperCase());
		if (order == null) {
			throw new OrderIdException("Can not delete order with id : " + orderIdentifier.toUpperCase()
					+ ". This order does not exist");
		}
		orderRepository.delete(order);
	}



}
