package com.example;

import java.time.LocalDate;

public class App17_Eleitor {
    public static void main(String[] args) {
        var cidadao = new Cidadao();
        cidadao.setDataNascimento(LocalDate.of(1980, 10, 10));
        System.out.println(cidadao.idade());
        System.out.println(cidadao.eleitor());
    }
}
