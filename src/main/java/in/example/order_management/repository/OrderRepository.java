package in.example.order_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.example.order_management.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
