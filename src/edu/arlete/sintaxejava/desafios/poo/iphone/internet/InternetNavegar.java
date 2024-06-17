package edu.arlete.sintaxejava.desafios.poo.iphone.internet;

public class InternetNavegar implements Navegador{
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página da internet");
    }

    @Override
    public void addNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada.");
    }
}
