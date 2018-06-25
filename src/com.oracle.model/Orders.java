package com.oracle.model;


public class Orders {
    private Integer orderid;
    private String times;

    private Integer status;
    private Integer userid;

    //设置对象之间的一对已关联
    private Address  add;

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
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

    public Orders(Integer orderid, String times, Integer status, Integer userid, Address add) {
        this.orderid = orderid;
        this.times = times;
        this.status = status;
        this.userid = userid;
        this.add = add;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderid=" + orderid +
                ", times=" + times +
                ", status=" + status +
                ", userid=" + userid +
                ", add=" + add +

                '}';
    }

    public Orders() {
    }

}
