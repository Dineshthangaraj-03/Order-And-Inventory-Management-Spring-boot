package OrderAndInventoryManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import OrderAndInventoryManagement.entity.Order;
import OrderAndInventoryManagement.service.OrderService;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "http://localhost:5173")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/place")
    public ResponseEntity<Order> placeOrder(
            @RequestParam int id,
            @RequestParam int qty) {

        return ResponseEntity.ok(orderService.placeOrder(id, qty));
    }
}
