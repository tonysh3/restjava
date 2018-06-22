package com.shibanov.shopdb.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BUY_PRODUCTS")
public class BuyProducts implements Serializable {
    @Id
    @Column(name = "BUY_PRODUCTS_ID")
    private int buyProducts_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "BUY_ID")
    private Buy buy;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;
    private int product_quantity;

    public int getBuyProducts_id() {
        return buyProducts_id;
    }

    public void setBuyProducts_id(int buyProducts_id) {
        this.buyProducts_id = buyProducts_id;
    }

    public Buy getBuy() {
        return buy;
    }

    public void setBuy(Buy buy) {
        this.buy = buy;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }
}
