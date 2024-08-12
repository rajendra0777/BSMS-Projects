package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.ashokit.entity.Product;

@RepositoryRestResource(path="product")
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
