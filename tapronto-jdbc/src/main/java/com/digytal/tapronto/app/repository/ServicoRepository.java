package com.digytal.tapronto.app.repository;

import com.digytal.tapronto.app.model.Servico;
import com.digytal.tapronto.app.sql.FabricaConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
    public void alterar(Servico servico){
        try {
            String sql = "UPDATE tab_servico SET descricao = ?, valor = ? WHERE id = ?";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, servico.getDescricao());
            statement.setDouble(2, servico.getValor());
            statement.setInt(3, servico.getId());
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Serviço alterado com sucesso!");
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public void excluir(Integer id){
        try {
            String sql = "DELETE FROM tab_servico WHERE id = ?";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Servico excluido com sucesso!");
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    //buscar um servico na base atraves do seu id ?
    public Servico buscar(Integer id){
        //que vcs implementem esta lógica
        return null;
    }
    public List<Servico> listar(){
        List<Servico> registros = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tab_servico";
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()){
                Servico servico = new Servico();
                servico.setId(result.getInt("id"));
                servico.setDescricao(result.getString("descricao"));
                servico.setValor(result.getDouble("valor"));
                registros.add(servico);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return registros;
    }
}
