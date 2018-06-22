package com.shibanov.shopdb.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "CUSTOMER")
public class Customer implements Serializable {

    @Id
    @Column(name = "CUSTOMER_ID")
    private int customer_id;
    private String customer_name;
    private String customer_card;
    private int customer_discount;

    @OneToMany(mappedBy = "customer")
    private Collection<Buy> buys;


    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_card() {
        return customer_card;
    }

    public void setCustomer_card(String customer_card) {
        this.customer_card = customer_card;
    }

    public int getCustomer_discount() {
        return customer_discount;
    }

    public void setCustomer_discount(int customer_discount) {
        this.customer_discount = customer_discount;
    }
}
