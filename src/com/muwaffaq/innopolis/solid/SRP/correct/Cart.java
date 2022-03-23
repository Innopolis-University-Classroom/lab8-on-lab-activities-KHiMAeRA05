package com.muwaffaq.innopolis.solid.SRP.correct;
import com.muwaffaq.innopolis.solid.SRP.correct.Product;

import java.util.List;
 
class Cart{
    List<Product> products;
    double totals;
    String token;
}

class addTo{

    void addToCart(Cart cart, Product product) {
        cart.products.add(product);
    }

}
class removeFrom{

    void removeFromCart(Cart cart, Product product) {
        cart.products.remove(product);
    }
    
}

class applyDiscount {

    void applyDiscount(Cart cart, int percentage) {
        cart.totals = cart.totals * percentage;
    }
    
}
