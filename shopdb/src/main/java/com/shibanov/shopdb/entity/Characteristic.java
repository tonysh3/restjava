package com.shibanov.shopdb.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "CHARACTERISTIC")
public class Characteristic implements Serializable {
    @Id
    @Column(name = "CHARACTERISTIC_ID")
    private int character_id;
    private String character_name;

    @OneToMany(mappedBy = "characteristic")
    private Collection<ProductCharacteristic> productCharacteristics;

    public int getCharacter_id() {
        return character_id;
    }

    public void setCharacter_id(int character_id) {
        this.character_id = character_id;
    }

    public String getCharacter_name() {
        return character_name;
    }

    public void setCharacter_name(String character_name) {
        this.character_name = character_name;
    }
}
