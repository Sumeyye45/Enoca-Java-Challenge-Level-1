package Java_Challenge.example.ProductService.repository;

import Java_Challenge.example.ProductService.entities.Customer;
import Java_Challenge.example.ProductService.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
