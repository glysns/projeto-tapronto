package com.digytal.respository;

import com.digytal.jpa.FabricaJpaConexao;
import com.digytal.model.Servico;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ServicoRepository {
    private EntityManager em;
    public ServicoRepository(){
        em = FabricaJpaConexao.getEntityManager();
    }
    public void salvar (Servico servico){

    }
    public void alterar(Servico servico){

    }
    public void excluir(Integer id){

    }
    //buscar um servico na base atraves do seu id ?
    public Servico buscar(Integer id){
        //que vcs implementem esta lógica
        return null;
    }
    public List<Servico> listar(){
        //JPQL - > SELECT sobre as nossas classes
        Query query = em.createQuery("SELECT s FROM Servico s");
        return query.getResultList();
    }
}
