package edu.arlete.BancoDigital;

public class Cliente {
    private String nome;

    public Cliente() {//construtor padrão

    }
    public Cliente(String nome) {//construtor com o atributo nome
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
