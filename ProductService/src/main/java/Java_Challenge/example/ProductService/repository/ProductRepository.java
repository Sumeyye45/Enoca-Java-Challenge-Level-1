package Java_Challenge.example.ProductService.repository;

import Java_Challenge.example.ProductService.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    static <T> Optional<Object> findById(Integer productId) {
        return null;
    }
}
