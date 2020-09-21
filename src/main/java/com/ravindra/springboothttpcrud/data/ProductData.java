package com.ravindra.springboothttpcrud.data;

import org.springframework.stereotype.Component;

@Component
public class ProductData {
    private String id;
    private String name;
    private String lastName;
    private String postCode;

    public ProductData() {
    }

    public ProductData(String id, String name, String lastName, String postCode) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.postCode = postCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
