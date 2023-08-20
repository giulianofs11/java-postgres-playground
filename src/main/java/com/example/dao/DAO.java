package com.example.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.model.Produto;

public class DAO {
    private Connection conn;

    public DAO(Connection conn) {
        this.conn = conn;
    }
    public void listar(Produto produto) throws SQLException {
        var sql = "select * from " + produto;
        var statement = conn.createStatement();
        var result = statement.executeQuery(sql);

        var metadata = result.getMetaData();
        int cols = metadata.getColumnCount();

        for (int i = 1; i <= cols; i++) {
            System.out.printf("%-25s | ", metadata.getColumnName(i));
        }
        System.out.println();

        while(result.next()){
            for (int i = 1; i < cols; i++) {
                System.out.printf("%-25s | ", result.getString(i));
            }
            System.out.println();
        }
    }
}
