package com.example;

public class Cliente {

    // 1. ATRIBUTOS: são Variáveis criadas em uma classe
    private String nome;
    private String cpf;
    private double renda;
    private char sexo;
    private int anoNascimento;
    private boolean especial;

     // 2. MÉTODOS CONSTRUTORES
    public Cliente(){
        System.out.println("Criando um cliente usando o construtor sem parametros.");
        double aleatorio = Math.random();
        if(aleatorio > 0.5)
            especial=true;
    }

    public Cliente(double renda, char sexo){
        this();
        System.out.println("Criando um cliente usando o construtor com parametros.");
        setRenda(renda);
        setSexo(sexo);
    }

    // 3. MÉTODOS CONVENCIONAIS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.isBlank())
            System.out.println("Nome é obrigatório!");
        else this.nome = nome.toUpperCase().trim();
    }

    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    } 

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        if(renda >= 0)
            this.renda = renda;
        else System.out.println("A renda deve ser maior que zero.");
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if(sexo == 'M' || sexo == 'F')
            this.sexo = sexo;
        else System.out.println("Sexo inválido.");
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public String toString() {
        return "Cliente: " + nome + " CPF: " + cpf;
    }
}