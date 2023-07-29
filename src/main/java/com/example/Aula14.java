package com.example;

public class Aula14 {
    public static void main(String[] args) {
        int idadeInt = 35;
        byte idade = (byte) idadeInt; 
        
        double peso = 80.5;
        char sexo = 'M';
        boolean necessidadesEspeciais = true;

// Com var você define qual tipo.
        var anonascimento = 1970;

        System.out.println("A idade é " + idade + " , o peso é " + peso + " e o sexo é " + sexo);
        System.out.println("Necessidades especiais: " + necessidadesEspeciais);
        System.out.println("Ano nascimento: " + anonascimento);
        
    }
}
