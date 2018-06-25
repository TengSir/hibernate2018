package com.oracle.model;

import java.sql.Timestamp;

public class Orders {
    private Integer orderid;
    private Timestamp times;
    private Integer addressid;
    private Integer status;
    private Integer userid;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Timestamp getTimes() {
        return times;
    }

    public void setTimes(Timestamp times) {
        this.times = times;
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
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
        if (addressid != null ? !addressid.equals(orders.addressid) : orders.addressid != null) return false;
        if (status != null ? !status.equals(orders.status) : orders.status != null) return false;
        if (userid != null ? !userid.equals(orders.userid) : orders.userid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderid != null ? orderid.hashCode() : 0;
        result = 31 * result + (times != null ? times.hashCode() : 0);
        result = 31 * result + (addressid != null ? addressid.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        return result;
    }
}
