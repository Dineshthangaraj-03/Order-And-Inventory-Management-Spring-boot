package OrderAndInventoryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import OrderAndInventoryManagement.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
