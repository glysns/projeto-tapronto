package com.digytal.tapronto.app.sql;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao {
    //iniciando a persistencia de dados com JDBC
    public static Connection criarConexao(){
        Connection conn =null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tapronto_app", "postgres", "postgres");
            System.out.println("CONEXAO REALIZADA COM SUCESSO");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

}
