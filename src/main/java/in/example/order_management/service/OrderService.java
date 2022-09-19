package in.example.order_management.service;

import java.util.List;

import in.example.order_management.entity.Order;

public interface OrderService {

	Order createOrder(Order order);

	List<Order> getAll();

	Order findById(long id);

	Order updateById(long id, Order order);

	void deleteById(long id);

}
