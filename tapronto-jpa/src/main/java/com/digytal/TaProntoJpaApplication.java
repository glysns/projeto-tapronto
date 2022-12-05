package com.digytal;

import com.digytal.jpa.FabricaJpaConexao;
import com.digytal.model.Servico;
import com.digytal.respository.ServicoRepository;

import java.util.List;

public class TaProntoJpaApplication {
    public static void main(String[] args) {
        FabricaJpaConexao.conectar();
        //listarServicos();
        //salvarServico();
        //alterarServico();
        excluirServico();
    }
    static void salvarServico(){
        Servico servico = new Servico();
        servico.setDescricao("LAVAGEM DE BIKE");
        servico.setValor(15.0);
        ServicoRepository servicoRepository = new ServicoRepository();
        servicoRepository.salvar(servico);
    }
    static void alterarServico(){
        //Servico servico = //?seu metodo buscar   ;
        ServicoRepository servicoRepository = new ServicoRepository();
        Servico servico = servicoRepository.buscar(4);
        servico.setDescricao("LAVAGEM DE BIKE COMPLETA");
        //servico.setValor(45.0);


        servicoRepository.alterar(servico);
    }
    static void excluirServico(){
        ServicoRepository servicoRepository = new ServicoRepository();
        servicoRepository.excluir(4);
    }
    static void listarServicos(){
        ServicoRepository servicoRepository = new ServicoRepository();
        List<Servico> servicos = servicoRepository.listar();
        for(Servico s: servicos){
            System.out.println(s.getDescricao());
        }
    }


}
