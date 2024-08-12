package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.response.Product;
import in.ashokit.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	
	@GetMapping("/")
	public String getProduct(@ModelAttribute("p") Product p,  Model model) {
		service.getAllProducts();
		return "index";
	}
	
	@GetMapping("/product")
	public String getProduct(@RequestParam("pid") String pid, Model model) {
		
		Product product = service.getProductById(pid);
		
		model.addAttribute("p", product);
		
		return "index";
	}

}
