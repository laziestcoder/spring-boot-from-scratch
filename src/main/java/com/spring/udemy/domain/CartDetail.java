package com.spring.udemy.domain;

/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ১১/৪/২০
 Time: ৮:৪১ PM
 ***/
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CartDetail extends AbstractDomainClass {

    @ManyToOne
    private Cart cart;

    @OneToOne
    private Product product;

    private Integer quantity;

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
}
