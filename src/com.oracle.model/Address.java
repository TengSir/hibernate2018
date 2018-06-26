package com.oracle.model;

public class Address {
    private Integer addid;
    private String city;
    private String street;
    private Orders ordersByAddid;

    public Integer getAddid() {
        return addid;
    }

    public void setAddid(Integer addid) {
        this.addid = addid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (addid != null ? !addid.equals(address.addid) : address.addid != null) return false;
        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        if (street != null ? !street.equals(address.street) : address.street != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = addid != null ? addid.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        return result;
    }

    public Orders getOrdersByAddid() {
        return ordersByAddid;
    }

    public void setOrdersByAddid(Orders ordersByAddid) {
        this.ordersByAddid = ordersByAddid;
    }
}
