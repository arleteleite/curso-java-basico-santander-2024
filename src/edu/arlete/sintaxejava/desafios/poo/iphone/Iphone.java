package edu.arlete.sintaxejava.desafios.poo.iphone;

import edu.arlete.sintaxejava.desafios.poo.iphone.internet.Navegador;
import edu.arlete.sintaxejava.desafios.poo.iphone.telefone.Telefone;
import edu.arlete.sintaxejava.desafios.poo.iphone.tocadorMusical.TocadorMusical;

public class Iphone implements Telefone, Navegador, TocadorMusical {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página da internet com iphone.");
    }

    @Override
    public void addNovaAba() {
        System.out.println("Adicionando nova página da internet com iphone.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada da internet com iphone.");

    }

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

    @Override
    public void tocar() {
        System.out.println("TOCANDO UMA MUSICA");

    }

    @Override
    public void pausar() {
        System.out.println("MUSICA PAUSADA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO UMA MUSICA");

    }
}
