package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App18_Listas {
    public static void main(String[] args) {
        List<Cliente> listaClientes = new ArrayList<>();
        var cliente1 = new Cliente();
        cliente1.setNome("Manoel");
        cliente1.setCpf("999999999999");

        var cliente2 = new Cliente();
        cliente2.setNome("Giuliano");
        cliente2.setCpf("999999999999");

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);

        System.out.println(listaClientes);

    }
}
