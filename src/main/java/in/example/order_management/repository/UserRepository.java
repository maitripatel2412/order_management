package in.example.order_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.example.order_management.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
