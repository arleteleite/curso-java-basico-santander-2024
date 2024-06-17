package edu.arlete.sintaxejava.desafios.poo.usuario;

import edu.arlete.sintaxejava.desafios.poo.iphone.Iphone;
import edu.arlete.sintaxejava.desafios.poo.iphone.internet.InternetNavegar;
import edu.arlete.sintaxejava.desafios.poo.iphone.internet.Navegador;

public class Usuario {
    public static void main(String[] args) {
        Navegador internet = new Iphone();

       internet.exibirPagina("www.mariajoaquina.com.br");
    }
}
