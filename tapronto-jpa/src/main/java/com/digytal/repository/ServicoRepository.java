package com.digytal.repository;

import com.digytal.jpa.FabricaJpaConexao;
import com.digytal.model.Servico;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class ServicoRepository {
    private EntityManager em;
    public ServicoRepository(){
        em=FabricaJpaConexao.getEntityManager();
    }
    public void salvar (Servico servico){
        System.out.println("nao implementado");
    }
    public void alterar (Servico servico){
        System.out.println("nao implementado");
    }
    public void excluir (Integer id){
        System.out.println("nao implementado");
    }

    public List<Servico> listar(){
        //JPQL->SELECTS SOBRE ENTIDADES
        Query query = em.createQuery("SELECT s FROM Servico s");
        return query.getResultList();
    }
}
