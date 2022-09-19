package in.example.order_management.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.example.order_management.entity.Order;
import in.example.order_management.entity.OrderItem;
import in.example.order_management.repository.OrderRepository;
import in.example.order_management.service.OrderService;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order createOrder(Order order) {
		List<OrderItem> oldOrderItem = order.getOrderItem();
		for(OrderItem orderItem : oldOrderItem) {
			orderItem.setOrder(order);
		}
		order.setOrderItem(oldOrderItem);
		return orderRepository.save(order);
	}

	@Override
	public List<Order> getAll() {
		return orderRepository.findAll();
	}

	@Override
	public Order findById(long id) {
		return orderRepository.findById(id).get();
	}

	@Override
	public Order updateById(long id, Order order) {
		Order oldorder = orderRepository.findById(id).get();
		order.setId(id);
		return orderRepository.save(order);
	}

	@Override
	public void deleteById(long id) {
		orderRepository.deleteById(id);
	}

}
