package com.digytal.tapronto.app;

import com.digytal.tapronto.app.model.Servico;
import com.digytal.tapronto.app.repository.ServicoRepository;

public class TaProntoApplication {
    public static void main(String[] args) {
        Servico servico = new Servico();

        servico.setDescricao("LAVAGEM DE CARPETE");
        servico.setValor(28.5);

        ServicoRepository servicoRepository = new ServicoRepository();
        servicoRepository.salvar(servico);
    }
}
