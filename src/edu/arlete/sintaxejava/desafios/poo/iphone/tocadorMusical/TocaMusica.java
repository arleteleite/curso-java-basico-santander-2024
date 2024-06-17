package edu.arlete.sintaxejava.desafios.poo.iphone.tocadorMusical;

public class TocaMusica implements TocadorMusical{
    public void tocar(){
        System.out.println("TOCANDO UMA MUSICA");

    }
    public void pausar(){
        System.out.println("MUSICA PAUSADA");

    }

    public void selecionarMusica(String musica){
        System.out.println("SELECIONANDO UMA MUSICA");

    }
}
