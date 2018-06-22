package com.shibanov.shopdb.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PRODUCT_CHARACTERISTIC")
public class ProductCharacteristic implements Serializable {
    @Id
    @Column(name = "PRODUCT_CHARACTERISTIC_ID")
    private int productCharacter_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "PRODUCT_ID")
    private Product product;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="CHARACTERISTIC_ID")
    private Characteristic characteristic;

    private String characteristic_value;

    public int getProductCharacter_id() {
        return productCharacter_id;
    }

    public void setProductCharacter_id(int productCharacter_id) {
        this.productCharacter_id = productCharacter_id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    public String getCharacteristic_value() {
        return characteristic_value;
    }

    public void setCharacteristic_value(String characteristic_value) {
        this.characteristic_value = characteristic_value;
    }
}
