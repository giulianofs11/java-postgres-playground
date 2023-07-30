package com.example;

public class App13_OperadoresRelacionais {
    public static void main(String[] args) {
        var cliente1 = new Cliente();
        cliente1.setAnoNascimento(1990);

        var cliente2 = new Cliente();
        cliente2.setAnoNascimento(1980);

        if(cliente1.getAnoNascimento() > cliente2.getAnoNascimento()) {
            System.out.println("O cliente 1 é mais velho que o cliente 2");
            System.out.println("O ano de nascimento dos cliente é " + cliente1.getAnoNascimento());
            System.out.println("O ano de nascimento dos cliente é " + cliente2.getAnoNascimento());
        } 
        
        else if(cliente1.getAnoNascimento() < cliente2.getAnoNascimento()) {
            System.out.println("O cliente 1 é mais novo que o cliente 2");
            System.out.println("O ano de nascimento dos cliente é " + cliente1.getAnoNascimento());
            System.out.println("O ano de nascimento dos cliente é " + cliente2.getAnoNascimento());
        } 
        
        else {
            System.out.println("Os clientes tem a mesma idade.");
            System.out.println("O ano de nascimento dos cliente é " + cliente1.getAnoNascimento());
        }
    }
}
