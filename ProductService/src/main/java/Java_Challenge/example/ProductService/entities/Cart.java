package Java_Challenge.example.ProductService.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="carts")
public class Cart extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItem> items;

    private Double totalPrice = 0.0;

    // Getters and Setters

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }



}
