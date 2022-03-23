package com.muwaffaq.innopolis.solid.SRP.wrong;
import com.muwaffaq.innopolis.solid.SRP.correct.Product;

import java.util.List;
 
 class Cart{
    List<Product> products;
    double totals;
    String token;
}

class addTo{

    void addToCart(Cart cart, Product product) {
        products.add(product);
    }

}
class removeFrom{

    void removeFromCart(Cart cart, Product product) {
        products.remove(product);
    }
    
}

class applyDiscount {

    void applyDiscount(Cart cart, int percentage) {
        totals = totals * percentage;
    }
    
}



