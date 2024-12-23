package Java_Challenge.example.ProductService.entities;
import jakarta.persistence.*;

import lombok.*;
@Getter
@Setter
@Entity
@Table(name= "products")
public class Product extends BaseEntity{

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Integer stock;


    public boolean getStock() {
        return false ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
