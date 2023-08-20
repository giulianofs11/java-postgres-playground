package com.example;

import java.util.Scanner;

import com.example.model.Cliente;

public class App10_Scanner {
    public static void main(String[] args) {
       
        Cliente cliente1 = new Cliente();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        cliente1.setNome(scanner.nextLine());
        
        System.out.println("Digite o CPF: ");
        cliente1.setCpf(scanner.nextLine());

        System.out.println("Digite a Renda: ");
        cliente1.setRenda(scanner.nextDouble());

        scanner.nextLine();
        System.out.println("Digite o Sexo: ");
        String sexo = scanner.nextLine();
        cliente1.setSexo(sexo.charAt(0));

        System.out.println("Digite o Ano de nascimento: ");
        cliente1.setAnoNascimento(scanner.nextInt());

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Renda: " + cliente1.getRenda());
        System.out.println("Sexo: " + cliente1.getSexo());
        System.out.println("Ano de Nascimento: " + cliente1.getAnoNascimento());
        System.out.println("Cliente especial: " + cliente1.isEspecial());
        System.out.println();

    }
}
