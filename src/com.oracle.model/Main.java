package  com.oracle.model;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {



        //使用hibernate提供给的api来操作数据库

        //1. 创建configuration对象,并立马读取配置
        Configuration  c=new Configuration().configure();

        //2.在配置对象的基础上创建sessionfactory

        SessionFactory  sf=c.buildSessionFactory();

        //3.使用sessionfactory创建一个session
        Session  session=sf.openSession();


        //4.开启一个事务
        Transaction  tr=session.beginTransaction();

        //5.可以直接使用session里面的方法来对数据库操作了

        Users  user=new Users();
        user.setUsername("jack");
        user.setPassword("rose");
        user.setAge(10);
        user.setSex("m");
        user.setBio("xxxxx");





        session.save(user);//执行session的水库操作方法




        //6.事务要么提交要么回滚
        tr.commit();

        //7.释放资源
        session.close();
        sf.close();


    }
}
