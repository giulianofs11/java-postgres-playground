package com.example2;

import java.sql.SQLException;

import com.example2.dao.ConnectionManager;
import com.example2.dao.ProdutoDAO;
import com.example2.model.*;

public class AppProduto {
    public static void main(String[] args) {
        new AppProduto();
    }
    public AppProduto() {
        try(var conn = ConnectionManager.getConnection()) {
                  
            var marca = new Marca();
            marca.setId(2L);

            var produto = new Produto();
            produto.setId(104L);
            produto.setMarca(marca);
            produto.setValor(450.0);
            produto.setNome("Produto Novissimo");

            var produtoDAO = new ProdutoDAO(conn);
            produtoDAO.inserir(produto);
            //produtoDAO.alterar(produto);
            //produtoDAO.excluir(203L);
            produtoDAO.listar(produto);
    

        } catch (SQLException e) {
                System.err.println("Não foi possivel conectar ao banco de dados" + e.getMessage());
        }
    }
}
