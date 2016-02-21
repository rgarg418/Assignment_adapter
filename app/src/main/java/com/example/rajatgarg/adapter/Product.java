package com.example.rajatgarg.adapter;
/**
 * Created by Rajat Garg on 2/21/2016.
 */
public class Product {
    private int id;
    private String code;
    private String name;
    private String ltp;

    public Product(int id, String code, String name, String ltp) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.ltp = ltp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLtp() {
        return ltp;
    }

    public void setLtp(String ltp) {
        this.ltp = ltp;
    }
}
