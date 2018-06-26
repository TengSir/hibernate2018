package com.oracle.model;

public class Orderitems {
    private Integer itemsid;
    private Integer productid;
    private Integer count;
    private Double price;
    private Orders ordersByOrderid;

    @Override
    public String toString() {
        return "Orderitems{" +
                "itemsid=" + itemsid +
                ", productid=" + productid +
                ", count=" + count +
                ", price=" + price +
                '}';
    }

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


    public Orders getOrdersByOrderid() {
        return ordersByOrderid;
    }

    public void setOrdersByOrderid(Orders ordersByOrderid) {
        this.ordersByOrderid = ordersByOrderid;
    }
}
