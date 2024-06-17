package edu.arlete.sintaxejava.desafios.poo.iphone.telefone;

public class Chamada implements Telefone{

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando.");

    }

    @Override
    public void atender() {
        System.out.println("Atender");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz.");

    }
}
