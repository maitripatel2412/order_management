package in.example.order_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.example.order_management.entity.ProductTransaction;

@Repository
public interface ProductTransactionRepository extends JpaRepository<ProductTransaction, Long> {

	@Query(value = "SELECT sum(in_qty - out_qty) FROM order_management.tbl_product_transaction where product_item_id =?1",nativeQuery = true)
	int getAvailableQty(long productItemId);
	
}
