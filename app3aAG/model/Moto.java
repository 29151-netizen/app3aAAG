// Adelia V. Conscetta 3a tec ti
//Gabriel Simione 3a tec ti
//Lucas Oliveira 3a tec ti
//Lucas Fernandes da Silva 3a tec ti


package com.sgp.modelos;

public class Moto {

    private String nome;
    private String placa;
    private int ano;
    private double cilindrada; // 4º atributo

    //  Construtor padrão
    public Moto() {
        this.nome = "Honda CG 160";
        this.placa = "BRA0P52";
        this.ano = 2022;
        this.cilindrada = 160.0;
    }

    
    public Moto(String nome, String placa, int ano, double cilindrada) {
        setNome(nome);
        setPlaca(placa);
        setAno(ano);
        setCilindrada(cilindrada);
    }

    //  Método específico 1
    public void saudacao() {
        System.out.println("A moto " + nome + " com placa " + placa + " tem " + calcularIdade() + " anos.");
    }

    // Método específico 2
    public int calcularIdade() {
        return 2026 - ano;
    }

    
    public String getNome() {
        return nome;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    //  Setters com validação
    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        this.nome = nome;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.length() < 5) {
            throw new IllegalArgumentException("Placa inválida!");
        }
        this.placa = placa;
    }

    public void setAno(int ano) {
        if (ano < 1900 || ano > 2026) {
            throw new IllegalArgumentException("Ano inválido!");
        }
        this.ano = ano;
    }

    public void setCilindrada(double cilindrada) {
        if (cilindrada <= 0) {
            throw new IllegalArgumentException("Cilindrada inválida!");
        }
        this.cilindrada = cilindrada;
    }

    // toString 
    @Override
    public String toString() {
        return "Moto [nome=" + nome +", placa=" + placa +", ano=" + ano +  ", cilindrada=" + cilindrada +  ", idade=" + calcularIdade() + "]";
    }
}

