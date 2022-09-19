package in.example.order_management.service;

import in.example.order_management.entity.ProductTransaction;

public interface ProductTransactionService {

	String saveInQty(ProductTransaction productTransaction);

	String saveOutQty(ProductTransaction productTransaction);

	int availableQty(long id);

}
