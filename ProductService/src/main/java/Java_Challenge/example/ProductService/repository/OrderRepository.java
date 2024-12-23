package Java_Challenge.example.ProductService.repository;

import Java_Challenge.example.ProductService.entities.Order;
import Java_Challenge.example.ProductService.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
