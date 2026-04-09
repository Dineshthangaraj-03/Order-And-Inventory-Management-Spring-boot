package OrderAndInventoryManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import OrderAndInventoryManagement.entity.Product;
import OrderAndInventoryManagement.repository.ProductRepository;

@RestController
public class ProductController {
	
	 @Autowired
	    private ProductRepository productRepository;

	    @PostMapping("/save")
	    public Product saveProduct(@RequestBody Product product) {
	        return productRepository.save(product);
	    }

}
