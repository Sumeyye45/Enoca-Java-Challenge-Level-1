package Java_Challenge.example.ProductService.services.abstracts;

import Java_Challenge.example.ProductService.entities.Cart;

public interface CartServices {
    public Cart addProductToCart(Long cartId, Long productId, Integer quantity);

    Cart removeProductFromCart(Long cartId, Long productId);

    Cart updateProductInCart(Long cartId, Long productId, Integer quantity);

    void emptyCart(Long cartId);

    Cart getCart(Long cartId);

    Double getCartTotalPrice(Long cartId);
}
