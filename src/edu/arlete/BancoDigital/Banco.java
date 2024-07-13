package edu.arlete.BancoDigital;

import java.util.ArrayList;
import java.util.List;

public class Banco {

        private String nome;
        private List<Conta> contas = new ArrayList<>();//armazena uma lista de objetos do tipo conta

        public Banco(String nome) {
            this.nome = nome;
        }

        public void adicionarConta(Conta conta) {
            contas.add(conta);//adiciona conta no arraylist de contas
        }

        public List<Conta> getContas() {
            return contas;
        }

}
