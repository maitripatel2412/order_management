package in.example.order_management.service;

import java.util.List;

import in.example.order_management.entity.User;

public interface UserService {

	User createUser(User user);

	List<User> getAll();

	User findById(long id);

	User updateById(long id, User user);

	void deleteById(long id);

}
