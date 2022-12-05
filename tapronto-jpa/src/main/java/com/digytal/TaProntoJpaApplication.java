package com.digytal;

import com.digytal.jpa.FabricaJpaConexao;
import com.digytal.model.Servico;
import com.digytal.respository.ServicoRepository;

import java.util.List;

public class TaProntoJpaApplication {
    public static void main(String[] args) {
        FabricaJpaConexao.conectar();
        listarServicos();
    }
    static void excluirServico(){
        ServicoRepository servicoRepository = new ServicoRepository();
        servicoRepository.excluir(3);
    }
    static void listarServicos(){
        ServicoRepository servicoRepository = new ServicoRepository();
        List<Servico> servicos = servicoRepository.listar();
        for(Servico s: servicos){
            System.out.println(s.getDescricao());
        }
    }
    static void alterarServico(){
        //Servico servico = //?seu metodo buscar   ;

        Servico servico = new Servico();
        servico.setId(3);
        servico.setDescricao("LAVAGEM DE CARPETE");
        servico.setValor(45.0);

        ServicoRepository servicoRepository = new ServicoRepository();
        servicoRepository.alterar(servico);
    }
    static void salvarServico(){
        Servico servico = new Servico();
        servico.setDescricao("LAVAGEM DE CARPETE");
        servico.setValor(28.5);
        ServicoRepository servicoRepository = new ServicoRepository();
        servicoRepository.salvar(servico);
    }
}
