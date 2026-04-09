package OrderAndInventoryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import OrderAndInventoryManagement.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
