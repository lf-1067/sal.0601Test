package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class TestSel {
    public static void  main(String[] args){
        Configuration conf=new Configuration().configure();
        SessionFactory sf=conf.buildSessionFactory();
        Session se=sf.openSession();

        CarEntity ce=(CarEntity) se.get(CarEntity.class,1);
       System.out.println(ce.getName());
    }
}
