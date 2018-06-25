package com.oracle.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Timestamp;
import java.util.Date;

public class oneToOneTest {

    public static void main(String[] args) {

        Configuration c=new Configuration().configure();
        SessionFactory sf=c.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tr=session.beginTransaction();


        Address  newAdd=new Address();
        newAdd.setCity("襄阳");
        newAdd.setStreet("隆重大道");



        Orders  o=new Orders();
        o.setUserid(123);
        o.setStatus(0);
        o.setTimes(new Date().toLocaleString());

        o.setAdd(newAdd);
        newAdd.setO(o);
        session.save(o);



        tr.commit();




//        Orders order=(Orders)session.get(Orders.class,1);
//        System.out.println(order);



    }


}
