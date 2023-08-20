package com.example.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.model.Produto;

public class ProdutoDAO {
    private Connection conn;

    public ProdutoDAO(Connection conn) {
        this.conn = conn;
    }
    public void inserir(Produto produto) throws SQLException {
        var sql = "insert into produto (nome, marca_id, valor) values (?, ?, ?)";
        var statement = conn.prepareStatement(sql);
        statement.setString(1, produto.getNome());
        statement.setLong(2, produto.getMarca().getId());
        statement.setDouble(3, produto.getValor());
        statement.executeUpdate();
    }

    public void excluir(long id) throws SQLException {
        var sql = "delete from produto where id = ?";
        var statement = conn.prepareStatement(sql);
        statement.setLong(1, id);
        if(statement.executeUpdate() == 1)
            System.out.println("Produto excluído com sucesso.");
        else System.out.println("Prouto não foi localizado");
        }

    public void alterar(Produto produto) throws SQLException {
        var sql = "update produto set nome = ?, marca_id = ?, valor = ? where id = ?";
        var statement = conn.prepareStatement(sql);
        statement.setString(1, produto.getNome());
        statement.setLong(2, produto.getMarca().getId());
        statement.setDouble(3, produto.getValor());
        statement.setLong(4, produto.getId());
        statement.executeUpdate();
    }
}
