package Java_Challenge.example.ProductService.services.concretes;

import Java_Challenge.example.ProductService.entities.Cart;
import Java_Challenge.example.ProductService.entities.CartItem;
import Java_Challenge.example.ProductService.repository.CartRepository;
import Java_Challenge.example.ProductService.repository.ProductRepository;
import Java_Challenge.example.ProductService.services.abstracts.CartServices;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartServices {

    @Override
    public Cart addProductToCart(Long cartId, Long productId, Integer quantity) {
        Cart cart = (Cart) CartRepository.findById(cartId).orElseThrow(() -> new RuntimeException("Cart not found"));
        Object product = ProductRepository.findById(Math.toIntExact(productId)).orElseThrow(() -> new RuntimeException("Product not found"));


        return null;
    }

    @Override
    public Cart removeProductFromCart(Long cartId, Long productId) {
        return null;
    }

    @Override
    public Cart updateProductInCart(Long cartId, Long productId, Integer quantity) {
        return null;
    }

    @Override
    public void emptyCart(Long cartId) {

    }

    @Override
    public Cart getCart(Long cartId) {
        return null;
    }

    @Override
    public Double getCartTotalPrice(Long cartId) {
        return 0.0;
    }

    CartItem cartItem = new CartItem();
        cartItem.setCart(cart);
        cartItem.setProduct(product);
        cartItem.setQuantity(quantity);
        cartItem.setPriceAtTimeOfAddition(product.getPrice());

        cart.getItems().add(cartItem);
        cart.setTotalPrice(cart.getItems().stream().

    void mapToDouble(item -> item.getPriceAtTimeOfAddition() * item.getQuantity()).sum());

        return cartRepository.save(cart);
}
