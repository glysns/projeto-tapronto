package com.digytal.respository;

import com.digytal.jpa.FabricaJpaConexao;
import com.digytal.model.Servico;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class ServicoRepository {
    private EntityManager em;
    public ServicoRepository(){
        em = FabricaJpaConexao.getEntityManager();
    }
    public void salvar (Servico servico){
        em.getTransaction().begin();
        em.persist(servico);
        em.getTransaction().commit();
    }
    public void alterar(Servico servico){
        em.getTransaction().begin();
        em.merge(servico);
        em.getTransaction().commit();
    }
    public void excluir(Integer id){

        Servico registro = buscar(id);
        if(registro!=null){
            em.getTransaction().begin();
            em.remove(registro);
            em.getTransaction().commit();
        }


    }
    //buscar um servico na base atraves do seu id ?
    public Servico buscar(Integer id){
       Servico registro = em.find(Servico.class,id);
        return registro;
    }
    public List<Servico> listar(){
        //JPQL - > SELECT sobre as nossas classes
        Query query = em.createQuery("SELECT s FROM Servico s");
        return query.getResultList();
    }
}
