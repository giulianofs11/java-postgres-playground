package com.example;

import java.sql.SQLException;

import com.example.dao.ConnectionManager;
import com.example.dao.ProdutoDAO;
import com.example.model.Marca;
import com.example.model.Produto;

public class AppDb_produto {
    public static void main(String[] args) {    
        new AppDb_produto();
    }
    public AppDb_produto() {
        try(var conn = ConnectionManager.getConnection()) {
                  
            var marca = new Marca();
            marca.setId(2L);

            var produto = new Produto();
            produto.setId(102L);
            produto.setMarca(marca);
            produto.setValor(90);
            produto.setNome("Produto Novo");

            var produtoDAO = new ProdutoDAO(conn);
            produtoDAO.inserir(produto);
            //produtoDAO.alterar(produto);
            //produtoDAO.excluir(100L);
            //produtoDAO.listar(produto);
    

        } catch (SQLException e) {
                System.err.println("Não foi possivel conectar ao banco de dados" + e.getMessage());
        }
    }
}
