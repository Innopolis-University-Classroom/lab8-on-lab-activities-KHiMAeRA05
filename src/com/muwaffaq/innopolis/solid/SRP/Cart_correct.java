package com.muwaffaq.innopolis.solid.SRP.wrong;
import com.muwaffaq.innopolis.solid.SRP.correct.Product;

import java.util.List;

/**
 * ❌ ❌ ❌ ❌
 * how many responsibilities does it have?
 *
 * SRP :
 * a class should only have one responsibility
 * it should only have one reason to change
 */
 
 interface ICart{
    List<Product> products;
    double totals;
    String token;
    
    void addToCart(Product product){}
    void removeFromCart(Product product){}
    void applyDiscount(int percentage){}
}

class addCart : ICart {

    void addToCart(Product product) {
        products.add(product);
    }

}
class removeCart : ICart {

    void removeFromCart(Product product) {
        products.remove(product);
    }
    
}

class applyCart : ICart {

    void applyDiscount(int percentage) {
        totals = totals * percentage;
    }
    
}



