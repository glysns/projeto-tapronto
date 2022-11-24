package com.digytal.tapronto.app;

import com.digytal.tapronto.app.model.Servico;
import com.digytal.tapronto.app.repository.ServicoRepository;

import java.util.List;

public class TaProntoApplication {
    public static void main(String[] args) {
       //salvarServico();
        // alterarServico();
        System.out.println("LISTANDO ANTES DA EXCLUSAO");
        listarServicos();
        excluirServico();
        System.out.println("LISTANDO APOS A EXCLUSAO");
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
