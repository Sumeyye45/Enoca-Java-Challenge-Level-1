package Java_Challenge.example.ProductService.Controllers;

import Java_Challenge.example.ProductService.dtos.requests.OrderRequest;
import Java_Challenge.example.ProductService.entities.Order;
import Java_Challenge.example.ProductService.services.abstracts.OrderServices;
import Java_Challenge.example.ProductService.services.concretes.OrderServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderControllers {

    @Autowired
    private OrderServices orderService;

    // Sipariş oluşturma
    @PostMapping("/place/{customerId}")
    public Order placeOrder(@PathVariable Long customerId, @RequestBody OrderRequest orderRequest) {
        return orderService.placeOrder(customerId, orderRequest);
    }

    // Sipariş numarasına göre sipariş görüntüleme
    @GetMapping("/code/{orderCode}")
    public Order getOrderForCode(@PathVariable String orderCode) {
        return orderService.getOrderForCode(orderCode);
    }

    // Müşteri id'sine göre tüm siparişleri listeleme
    @GetMapping("/customer/{customerId}")
    public List<Order> getAllOrdersForCustomer(@PathVariable Long customerId) {
        return orderService.getAllOrdersForCustomer(customerId);
    }

}
