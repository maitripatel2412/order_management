package in.example.order_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.example.order_management.entity.Order;
import in.example.order_management.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping("/save")
	public Order createOrder(@RequestBody Order order) {
		return orderService.createOrder(order);
	}
	
	@GetMapping
	public List<Order> getAll(){
		return orderService.getAll();
	}
	
	@GetMapping("/{id}")
	public Order findById(@PathVariable long id) {
		return orderService.findById(id);
	}
	
	@PutMapping("/{id}")
	public Order updateById(@PathVariable long id,@RequestBody Order order) {
		return orderService.updateById(id,order);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable long id) {
		orderService.deleteById(id);
	}
	
}
