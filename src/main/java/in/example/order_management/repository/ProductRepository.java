package in.example.order_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.example.order_management.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
