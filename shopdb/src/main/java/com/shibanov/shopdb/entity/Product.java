package com.shibanov.shopdb.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {
    @Id
    @Column (name = "PRODUCT_ID")
    private int product_id;
    private String product_name;
    private float product_price;

    @OneToOne(mappedBy = "product")
    private Store store;

    @OneToMany(mappedBy = "product")
    private Collection<BuyProducts> buyProducts;

    @OneToMany(mappedBy = "product")
    private Collection<ProductCharacteristic> productCharacteristics;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public float getProduct_price() {
        return product_price;
    }

    public void setProduct_price(float product_price) {
        this.product_price = product_price;
    }
}
