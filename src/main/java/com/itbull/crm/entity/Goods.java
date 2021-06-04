package com.itbull.crm.entity;

import java.util.Date;

public class Goods {
    private Integer id;

    private String name;

    private Date publishdate;

    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Goods(Integer id, String name, Date publishdate, Double price) {
        this.id = id;
        this.name = name;
        this.publishdate = publishdate;
        this.price = price;
    }
}