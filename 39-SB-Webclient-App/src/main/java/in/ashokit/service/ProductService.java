package in.ashokit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class ProductService {
	
	
	public Mono<String> getProduct(){
		
		String apiUrl = "https://api.restful-api.dev/objects/1";
		
		WebClient webClient = WebClient.create();
		
		Mono<String> productData = webClient.get()
		.uri(apiUrl)
		.retrieve()
		.bodyToMono(String.class);
		
		return productData;
	}

}
