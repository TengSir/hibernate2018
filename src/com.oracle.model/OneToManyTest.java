package com.oracle.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;

import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;

public class OneToManyTest {
    public static void main(String[] args) {

        Configuration c=new Configuration().configure();
        SessionFactory sf=c.buildSessionFactory();
        Session session=sf.openSession();
       Orders  o=(Orders)session.get(Orders.class,8);
        System.out.println(o.getOrderid());
        session.close();

        System.out.println( o.getOrderitemsByOrderid().size());
//        Session session=sf.openSession();
//        Transaction tr=session.beginTransaction();
//
//
//
//        Orders  o=new Orders();
//        o.setOrderid(12322);
//        o.setStatus(1);
//        o.setUserid(22222);
//        o.setTimes(Calendar.getInstance().get(Calendar.YEAR)+"-"+Calendar.getInstance().get(Calendar.MONTH)+"-"+Calendar.getInstance().get(Calendar.DATE)+" "+Calendar.getInstance().get(Calendar.HOUR)+":"+Calendar.getInstance().get(Calendar.MINUTE)+":"+Calendar.getInstance().get(Calendar.SECOND));
//
//
//        Collection<Orderitems>  items=new HashSet<Orderitems>();
//
//
//        Orderitems  item=new Orderitems();
//        item.setPrice(998.0);
//        item.setProductid(1001);
//        item.setCount(2);
//        item.setOrdersByOrderid(o);
//
//
//        Orderitems  item1=new Orderitems();
//        item1.setPrice(98.0);
//        item1.setProductid(1002);
//        item1.setCount(6);
//        item1.setOrdersByOrderid(o);
//
//        Orderitems  item2=new Orderitems();
//        item2.setPrice(9.9);
//        item2.setProductid(1006);
//        item2.setCount(10);
//        item2.setOrdersByOrderid(o);
//
//        items.add(item);
//        items.add(item1);
//        items.add(item2);
//
//
//        o.setOrderitemsByOrderid(items);
//
//
//
//        session.save(o);
//
//        tr.commit();


    }
}
