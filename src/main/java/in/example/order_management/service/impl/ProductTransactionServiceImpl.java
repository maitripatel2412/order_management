package in.example.order_management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.example.order_management.entity.ProductTransaction;
import in.example.order_management.repository.ProductTransactionRepository;
import in.example.order_management.service.ProductTransactionService;

@Service
@Transactional
public class ProductTransactionServiceImpl implements ProductTransactionService {

	@Autowired
	private ProductTransactionRepository productTransactionRepository;
	
	@Override
	public String saveInQty(ProductTransaction productTransaction) {
		productTransactionRepository.save(productTransaction);
		return "data saved";
	}

	@Override
	public String saveOutQty(ProductTransaction productTransaction) {
		productTransactionRepository.save(productTransaction);
		return "data saved";
	}

	@Override
	public int availableQty(long id) {
		return productTransactionRepository.getAvailableQty(id);
	}

}
