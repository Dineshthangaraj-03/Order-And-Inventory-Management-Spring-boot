package OrderAndInventoryManagement.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import OrderAndInventoryManagement.entity.Order;
import OrderAndInventoryManagement.entity.OrderItem;
import OrderAndInventoryManagement.entity.Product;
import OrderAndInventoryManagement.exception.InsuffcientStockException;
import OrderAndInventoryManagement.repository.OrderRepository;
import OrderAndInventoryManagement.repository.ProductRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public Order placeOrder(int id, int qty) {

        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not available"));

        if (product.getStock() < qty) {
            throw new InsuffcientStockException("Insufficient stock");
        }

        product.setStock(product.getStock() - qty);

        Order order = new Order();
        order.setDateTime(LocalDateTime.now());

        OrderItem item = new OrderItem();
        item.setProduct(product);
        item.setQty(qty);
        item.setOrder(order);

        order.setItems(List.of(item));

        return orderRepository.save(order);
    }
}
