package Java_Challenge.example.ProductService.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="cartItem")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    private Integer quantity;

    private Double priceAtTimeOfAddition;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPriceAtTimeOfAddition() {
        return priceAtTimeOfAddition;
    }

    public void setPriceAtTimeOfAddition(Double priceAtTimeOfAddition) {
        this.priceAtTimeOfAddition = priceAtTimeOfAddition;
    }
}
