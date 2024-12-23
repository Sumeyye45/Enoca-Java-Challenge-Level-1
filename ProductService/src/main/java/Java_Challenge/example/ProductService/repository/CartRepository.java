package Java_Challenge.example.ProductService.repository;

import Java_Challenge.example.ProductService.entities.Cart;
import Java_Challenge.example.ProductService.entities.Product;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Integer> {
    static <T> ScopedValue<T> findById(Long Id) {
        return null;
    }


}
