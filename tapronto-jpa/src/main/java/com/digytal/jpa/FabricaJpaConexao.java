package com.digytal.jpa;

import javax.persistence.*;
public class FabricaJpaConexao {
    //conexao
    private static EntityManager entityManager;
    public static void criarConexao() {
        try {
            if(entityManager==null) {
                EntityManagerFactory factory = Persistence.createEntityManagerFactory("MY_PU");
                entityManager = factory.createEntityManager();
                System.out.println("conexao realizada com sucesso");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    public static EntityManager getEntityManager() {
        return entityManager;
    }
}
