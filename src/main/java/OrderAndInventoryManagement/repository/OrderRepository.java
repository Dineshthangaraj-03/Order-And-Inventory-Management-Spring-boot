package OrderAndInventoryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import OrderAndInventoryManagement.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
