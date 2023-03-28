package com.ramos.serializacion.model;

import java.io.Serial;
import java.io.Serializable;

/**
 *
 * @author javierrampob
 */
public class Product implements Serializable{

    private int id;
    private String name;
    private int price;

    public Product() {
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * @return the id
     */
    protected int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    protected void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    protected String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    protected void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    protected int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    protected void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + '}';
    }
    
    

}
