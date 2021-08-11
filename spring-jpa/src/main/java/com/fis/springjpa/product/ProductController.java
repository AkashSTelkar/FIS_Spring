package com.fis.springjpa.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/product")
public class ProductController {
	@Autowired
	private ProductRepository productRepository;

	@PostMapping(path = "/add")
	public @ResponseBody String addNewProduct(@RequestParam String name) {
		Product p = new Product();
		p.setName(name);
		productRepository.save(p);
		return "Saved";
	}

	@GetMapping("/all")
	public @ResponseBody Iterable<Product> getAllProduct() {
		return productRepository.findAll();
	}

}
