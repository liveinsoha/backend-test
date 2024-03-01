package soha.product.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import soha.product.model.Product;
import soha.product.model.ProductRepository;


import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping("/products")
    public ResponseEntity<?> products() {
        List<Product> products = productRepository.findAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/hello1")
    public ResponseEntity<String> hello1() {
        return new ResponseEntity<>("Hello from hello1", HttpStatus.OK);
    }

    @GetMapping("/hello2")
    public ResponseEntity<String> hello2() {
        return new ResponseEntity<>("Hello from hello2", HttpStatus.OK);
    }
}
