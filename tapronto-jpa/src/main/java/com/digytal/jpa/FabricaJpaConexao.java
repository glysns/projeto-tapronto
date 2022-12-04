package com.digytal.jpa;

import javax.persistence.*;
public class FabricaJpaConexao {
    //conexao
    private static EntityManager entityManager;
    public static void conectar() {
        try {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("MY_PU");
            entityManager = factory.createEntityManager();
            System.out.println("conexao realizada com sucesso");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FabricaJpaConexao.conectar();
    }
}
