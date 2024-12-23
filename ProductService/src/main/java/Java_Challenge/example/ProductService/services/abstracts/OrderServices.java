package Java_Challenge.example.ProductService.services.abstracts;

import Java_Challenge.example.ProductService.dtos.requests.OrderRequest;
import Java_Challenge.example.ProductService.entities.Order;

import java.util.List;

public interface OrderServices {
    Order placeOrder(Long customerId, OrderRequest orderRequest);

    Order getOrderForCode(String orderCode);

    List<Order> getAllOrdersForCustomer(Long customerId);
}
