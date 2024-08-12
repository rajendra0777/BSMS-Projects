package in.ashokit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import in.ashokit.response.Product;

@Service
public class ProductService {
	
	
	public void getAllProducts() {
		
		String apiUrl = "https://api.restful-api.dev/objects";
		
		RestTemplate rt = new RestTemplate(); 
		
		ResponseEntity<Product[]> restEntity = rt.getForEntity(apiUrl, Product[].class);
		
		int status = restEntity.getStatusCode().value();
		
		if(status == 200) {
			Product[] p = restEntity.getBody();
			
			for(Product product: p) {
				System.out.println(product);
			}
		}
	}
	
	
	
	public Product getProductById( String pid) {
		
		String apiUrl = "https://api.restful-api.dev/objects"+pid;
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<Product> restEntity = rt.getForEntity(apiUrl, Product.class);
		
		int value = restEntity.getStatusCode().value();
		
		if(value == 200) {
			Product p = restEntity.getBody();
			return p;
			
		}
		return null;
		
	}

}
