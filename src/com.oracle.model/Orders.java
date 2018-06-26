package com.oracle.model;

import java.util.Collection;

public class Orders {
    private Integer orderid;
    private String times;
    private Integer status;

    @Override
    public String toString() {
        return "Orders{" +
                "orderid=" + orderid +
                ", times='" + times + '\'' +
                ", status=" + status +
                ", userid=" + userid +
                ", addressByOrderid=" + addressByOrderid +
                ", orderitemsByOrderid=" + orderitemsByOrderid +
                '}';
    }

    private Integer userid;
    private Address addressByOrderid;
    private Collection<Orderitems> orderitemsByOrderid;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orders orders = (Orders) o;

        if (orderid != null ? !orderid.equals(orders.orderid) : orders.orderid != null) return false;
        if (times != null ? !times.equals(orders.times) : orders.times != null) return false;
        if (status != null ? !status.equals(orders.status) : orders.status != null) return false;
        if (userid != null ? !userid.equals(orders.userid) : orders.userid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderid != null ? orderid.hashCode() : 0;
        result = 31 * result + (times != null ? times.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        return result;
    }

    public Address getAddressByOrderid() {
        return addressByOrderid;
    }

    public void setAddressByOrderid(Address addressByOrderid) {
        this.addressByOrderid = addressByOrderid;
    }

    public Collection<Orderitems> getOrderitemsByOrderid() {
        return orderitemsByOrderid;
    }

    public void setOrderitemsByOrderid(Collection<Orderitems> orderitemsByOrderid) {
        this.orderitemsByOrderid = orderitemsByOrderid;
    }
}
