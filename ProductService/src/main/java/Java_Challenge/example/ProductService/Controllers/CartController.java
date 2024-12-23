package Java_Challenge.example.ProductService.Controllers;

import Java_Challenge.example.ProductService.entities.Cart;
import Java_Challenge.example.ProductService.services.abstracts.CartServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartServices cartService;

    // Sepete ürün ekleme
    @PostMapping("/{cartId}/add-product/{productId}")
    public Cart addProductToCart(@PathVariable Long cartId, @PathVariable Long productId, @RequestParam Integer quantity) {
        return cartService.addProductToCart(cartId, productId, quantity);
    }

    // Sepetten ürün çıkarma
    @PostMapping("/{cartId}/remove-product/{productId}")
    public Cart removeProductFromCart(@PathVariable Long cartId, @PathVariable Long productId) {
        return cartService.removeProductFromCart(cartId, productId);
    }

    // Sepet güncelleme (Ürün miktarı değişikliği)
    @PutMapping("/{cartId}/update-product/{productId}")
    public Cart updateProductInCart(@PathVariable Long cartId, @PathVariable Long productId, @RequestParam Integer quantity) {
        return cartService.updateProductInCart(cartId, productId, quantity);
    }

    // Sepeti boşaltma
    @DeleteMapping("/{cartId}/empty")
    public void emptyCart(@PathVariable Long cartId) {
        cartService.emptyCart(cartId);
    }

    // Sepet içeriği görüntüleme
    @GetMapping("/{cartId}")
    public Cart getCart(@PathVariable Long cartId) {
        return cartService.getCart(cartId);
    }

    // Sepet toplam fiyatı hesaplama
    @GetMapping("/{cartId}/total-price")
    public Double getCartTotalPrice(@PathVariable Long cartId) {
        return cartService.getCartTotalPrice(cartId);
    }

}
