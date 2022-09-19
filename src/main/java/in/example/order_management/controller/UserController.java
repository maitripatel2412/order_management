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

import in.example.order_management.entity.User;
import in.example.order_management.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping
	public List<User> getAll(){
		return userService.getAll();
	}
	
	@GetMapping("/{id}")
	public User findById(@PathVariable long id) {
		return userService.findById(id);
	}
	
	@PutMapping("/{id}")
	public User updateById(@PathVariable long id, @RequestBody User user) {
		return userService.updateById(id,user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable long id) {
		userService.deleteById(id);
	}
	
}
