package com.example;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppDb {
    private static final String PASSWORD = "";
    private static final String USERNAME = "gitpod";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";

    public static void main(String[] args) {
        new AppDb();
        }
    
    public AppDb(){
        try(var conn = getConnection()){
            listarEstados(conn);   
            localizarEstado(conn, "TO");
            listarDadosTabela(conn, "cliente");
        } catch (SQLException e) {
            System.err.println("Não foi possível conectar ao banco de dados. " + e.getMessage());
        }
    }

    private void listarDadosTabela(Connection conn, String tabela) {
        var sql = "select * from " + tabela;
        System.out.println(sql);
        try {
            var statement = conn.createStatement();
            var result = statement.executeQuery(sql);

            var metadata = result.getMetaData();
            int cols = metadata.getColumnCount();

            for (int i = 1; i <= cols; i++) {
                System.out.printf("%-25s | ", metadata.getColumnName(i));
            }
            System.out.println();

            while(result.next()){
                for (int i = 1; i <= cols; i++) {
                    System.out.printf("%-25s | ", result.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            System.err.println("Erro na execução da consulta.");
        }
    }

    private void localizarEstado(Connection conn, String uf) {
       try{
        // var sql = "select * from estado where uf = '" + uf + "'"; //suscetivel a SQL Injection
        var sql = "select * from estado where uf = ?";
        var statement = conn.prepareStatement(sql);
        System.out.println(sql);
        statement.setString(1, uf);
        var result = statement.executeQuery();
        if(result.next()){
            System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
        }

       } catch(SQLException e){
        System.err.println("Erro ao executar consulta SQL." + e.getMessage());
       }
    }

    private void listarEstados(Connection conn) {
        try{
            System.out.println("Conexão com o banco de dados realizado com sucesso.");
                
                var statement = conn.createStatement();
                var result = statement.executeQuery("select * from estado");
                while(result.next()){
                    System.out.printf("Id: %d Nome: %s UF: %s \n", result.getInt("id"), result.getString("nome"), result.getString("UF"));
                }
            } catch (SQLException e) {
                System.err.println("Não foi possível executar a consulta ao banco de dados. " + e.getMessage());
            }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME,PASSWORD);
    }

    private void carregarDriveJDBC() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possivel carregar a biblioteca para acesso ao banco de dados. " + e.getMessage());
        }
    } 
}
