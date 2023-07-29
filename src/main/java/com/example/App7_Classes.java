package com.example;

public class App7_Classes {
    public static void main(String[] args) {
       
// Atribuição direta, como está agora com Private nos atributos de classe, não consigo mais fazer atribuição direta.
//cliente1.renda = 10000;
//cliente1.sexo = 'M';
//cliente1.anoNascimento = 1980;
        // Método Construtor: Cliente cliente1 = new Cliente();
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Giuliano Suetugo");
        cliente1.setCpf("99999999999");
        cliente1.setRenda(10000);
        cliente1.setSexo('M');
        cliente1.setAnoNascimento(1980);
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Renda: " + cliente1.getRenda());
        System.out.println("Sexo: " + cliente1.getSexo());
        System.out.println("Ano de Nascimento: " + cliente1.getAnoNascimento());
        System.out.println("Cliente especial: " + cliente1.isEspecial());
        System.out.println();

        var vetorNome = cliente1.getNome().split(" ");
        // OU String []vetorNome = cliente1.getNome().split(" ");
        System.out.println(vetorNome[0]);
        System.out.println(vetorNome[1]);

// Atribuição com o Set
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Daniela");
        cliente2.setCpf("99999999999");
        cliente2.setRenda(20000);
        cliente2.setSexo('F');
        cliente2.setAnoNascimento(2000);
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("Ano de Nascimento: " + cliente2.getAnoNascimento());
        System.out.println("Cliente especial: " + cliente2.isEspecial());
        System.out.println();

        if(cliente1.getCpf().equals(cliente2.getCpf()))
            System.out.println("Cliente 1 e Cliente 2 possuem o mesmo CPF");
        else System.out.println("Os CPFs são diferentes");

        Cliente cliente3 = new Cliente(50000, 'M');
        System.out.println("Renda: " + cliente3.getRenda());
        System.out.println("Sexo: " + cliente3.getSexo());
        System.out.println("Ano de Nascimento: " + cliente3.getAnoNascimento());
        System.out.println("Cliente especial: " + cliente3.isEspecial());

    }
}
