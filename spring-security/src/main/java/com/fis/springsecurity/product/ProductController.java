package com.fis.springsecurity.product;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping(path = "/product")
public class ProductController {
	@Autowired
	private ProductRepository productRepository;

	/*
	 * public @ResponseBody String addNewProduct(@RequestParam String name,double
	 * price) { Product p = new Product(); p.setName(name); p.setPrice(price);
	 * productRepository.save(p); return "Saved"; }
	 */
	@PostMapping(path = "/add")
	public String addNewProduct(@RequestBody Product product) {
		productRepository.save(product);
		return "Saved";
	}

	@GetMapping("/all")
	public @ResponseBody Iterable<Product> getAllProduct() {
		return productRepository.findAll();
	}

	@GetMapping
	public Iterable<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@PostMapping
	public String addProduct(@RequestBody Product product) {
		productRepository.save(product);
		return "Saved";
	}

	@PutMapping("/update")
	public String updateProduct(@RequestBody Product product) {
		Optional<Product> p = productRepository.findById(product.getId());
		if (p.isPresent()) {
			productRepository.save(product);
			return "Updated";
		} else {
			return "Product Not Found!!";
		}
	}

	@DeleteMapping
	public String deleteProduct(@RequestParam int id) {
		Optional<Product> p = productRepository.findById(id);
		if (p.isPresent()) { 
			productRepository.delete(p.get());
			return "Deleted";
		} else {
			return "Product Not Found!!";
		}
	}

	@GetMapping("/{id}")
	public Object getAProduct(@PathVariable int id) {
		Optional<Product> p = productRepository.findById(id);
		if (p.isPresent()) {
			return p.get();
		} else {
			return "Product Not Found!!";
		}
	}
}
