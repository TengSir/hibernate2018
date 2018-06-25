package com.oracle.model;

public class Orderitems {
    private Integer itemsid;
    private Integer productid;
    private Integer count;
    private Double price;
    private Integer orderid;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orderitems that = (Orderitems) o;

        if (itemsid != null ? !itemsid.equals(that.itemsid) : that.itemsid != null) return false;
        if (productid != null ? !productid.equals(that.productid) : that.productid != null) return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (orderid != null ? !orderid.equals(that.orderid) : that.orderid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = itemsid != null ? itemsid.hashCode() : 0;
        result = 31 * result + (productid != null ? productid.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (orderid != null ? orderid.hashCode() : 0);
        return result;
    }
}
