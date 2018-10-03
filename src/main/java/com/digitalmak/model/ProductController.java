package com.digitalmak.model;

import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class ProductController {

    public void create(Product product) {

        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(product);
        session.getTransaction().commit();
        session.close();
    }

    public void remove(Product product) {

        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery("delete Product where id = 9");
        q.executeUpdate();
        session.getTransaction().commit();
        session.close();

    }

    public void update(Product product) {

        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        session.find(Product.class, 4);

        if (product != null) {
            product.setName("Product Edited 1");
            product.setPrice(20.56);
            product.setQty(3);

            session.update(product);
            session.getTransaction().commit();
            session.close();

        }
    }

    public void read(Product product) {

        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        List<Product> products = session.createQuery("from Product ").getResultList();
        System.out.println(products);
        session.getTransaction().commit();
        session.close();

    }
}
