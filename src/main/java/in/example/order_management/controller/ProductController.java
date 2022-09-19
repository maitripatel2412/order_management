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

import in.example.order_management.entity.Product;
import in.example.order_management.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@PostMapping("/save")
	public Product createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}
	
	@GetMapping
	public List<Product> getAll(){
		return productService.getAll();
	}
	
	@GetMapping("/{id}")
	public Product findById(@PathVariable long id) {
		return productService.findById(id);
	}
	
	@PutMapping("/{id}")
	public Product updateById(@PathVariable long id,@RequestBody Product product) {
		return productService.updateById(id,product);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable long id) {
		productService.deleteById(id);
	}
	
	
}
