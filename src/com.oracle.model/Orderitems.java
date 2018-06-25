package com.oracle.model;

public class Orderitems {
    private Integer itemsid;
    private Integer productid;
    private Integer count;

    public Integer getItemsid() {
        return itemsid;
    }

    public void setItemsid(Integer itemsid) {
        this.itemsid = itemsid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    private Double price;
    private Integer orderid;

    public Orderitems(Integer itemsid, Integer productid, Integer count, Double price, Integer orderid) {
        this.itemsid = itemsid;
        this.productid = productid;
        this.count = count;
        this.price = price;
        this.orderid = orderid;
    }

    public Orderitems() {
    }

    @Override
    public String toString() {
        return "Orderitems{" +
                "itemsid=" + itemsid +
                ", productid=" + productid +
                ", count=" + count +
                ", price=" + price +
                ", orderid=" + orderid +
                '}';
    }
}
