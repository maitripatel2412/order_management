package in.example.order_management.service;

import java.util.List;

import in.example.order_management.entity.Product;

public interface ProductService {

	Product createProduct(Product product);

	List<Product> getAll();

	Product findById(long id);

	Product updateById(long id, Product product);

	void deleteById(long id);

}
