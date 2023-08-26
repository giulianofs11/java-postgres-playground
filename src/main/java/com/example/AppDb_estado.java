package com.example;

import java.sql.SQLException;

import com.example.dao.ConnectionManager;
import com.example.dao.EstadoDAO;

public class AppDb_estado {
    public static void main(String[] args) {    
        new AppDb_estado();
    }

    public AppDb_estado() {
        try(var conn = ConnectionManager.getConnection()) {
            
            var estadoDAO = new EstadoDAO(conn);
            var listaEstados = estadoDAO.listar();
            for (var estado : listaEstados) {
                System.out.println(estado);
            }

            estadoDAO.localizar("TO");

        } catch (SQLException e) {
                System.err.println("Não foi possivel conectar ao banco de dados" + e.getMessage());
        }
    }
}
