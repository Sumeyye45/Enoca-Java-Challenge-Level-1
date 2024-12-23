package Java_Challenge.example.ProductService.services.concretes;

import Java_Challenge.example.ProductService.dtos.requests.OrderRequest;
import Java_Challenge.example.ProductService.entities.Order;
import Java_Challenge.example.ProductService.services.abstracts.OrderServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServicesImpl implements OrderServices {
    @Override
    public Order placeOrder(Long customerId, OrderRequest orderRequest) {
        return null;
    }

    @Override
    public Order getOrderForCode(String orderCode) {
        return null;
    }

    @Override
    public List<Order> getAllOrdersForCustomer(Long customerId) {
        return List.of();
    }
}
