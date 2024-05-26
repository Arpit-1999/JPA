package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu")){
           try(EntityManager em= emf.createEntityManager()) {
               em.getTransaction().begin();
               tech d = em.find(tech.class, 1);
               System.out.println(d);
               em.getTransaction().commit();
           }



           }


        }



    }
