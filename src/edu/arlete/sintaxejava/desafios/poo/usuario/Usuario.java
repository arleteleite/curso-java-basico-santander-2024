package edu.arlete.sintaxejava.desafios.poo.usuario;

import edu.arlete.sintaxejava.desafios.poo.iphone.Iphone;

public class Usuario {
    public static void main(String[] args) {

       Iphone smartphone = new Iphone();
       smartphone.ligar("256843");
       smartphone.atender();
    }
}
