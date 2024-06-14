package edu.arlete.sintaxejava.estruturadedecisao;

public class IfElse {
    // CaixaEletronico
        public static void main(String[] args) {

            double saldo = 25.0;
            double valorSolicitado = 17.0;

            if(valorSolicitado < saldo)
                saldo = saldo - valorSolicitado;

            System.out.println("Seu saldo é R$ "+saldo);

        }
}
