package com.digytal.tapronto.app.repository;

import com.digytal.tapronto.app.model.Servico;
import com.digytal.tapronto.app.sql.FabricaConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ServicoRepository {
    private Connection conexao;
    public  ServicoRepository(){
        conexao = FabricaConexao.criarConexao();
    }
    public void salvar (Servico servico){
        try {
            String sql = "INSERT INTO tab_servico (descricao, valor) VALUES (?, ?)";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, servico.getDescricao());
            statement.setDouble(2, servico.getValor());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Um novo serviço foi salvo com sucesso!");
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
