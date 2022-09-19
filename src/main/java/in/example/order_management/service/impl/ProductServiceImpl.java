package in.example.order_management.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.example.order_management.entity.Product;
import in.example.order_management.entity.ProductItem;
import in.example.order_management.repository.ProductRepository;
import in.example.order_management.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {
		List<ProductItem> oldProductItem = product.getProductItem();
		for(ProductItem productItem : oldProductItem) {
			productItem.setProduct(product);
		}		
		product.setProductItem(oldProductItem);
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}

	@Override
	public Product findById(long id) {
		return productRepository.findById(id).get();
	}

	@Override
	public Product updateById(long id, Product product) {
		Product oldproduct = productRepository.findById(id).get();
		product.setId(id);
		return productRepository.save(product);
	}

	@Override
	public void deleteById(long id) {
		productRepository.deleteById(id);
	}

}
