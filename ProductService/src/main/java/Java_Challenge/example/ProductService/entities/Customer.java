package Java_Challenge.example.ProductService.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
@Table(name= "customers")
public class Customer extends BaseEntity{

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Cart> carts;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orders;

}
