package edu.arlete.sintaxejava.loops;
import java.util.concurrent.ThreadLocalRandom;
public class ExemplosWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada>0) {//enquanto a mesada for maior que 0... joazinho poderá comprar doces.
            Double valorDoce = valorAleatorio();

            /*if apenas para garantir que joazinho não gaste mais do que o valor que possui.
            ou seja, não tenhamos um resultado negativo
            */
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");

    }

    /*
     * Não se preocupe quanto a formatação de valores
     * Iremos explorar os recursos de formatação em breve !!
     *
     */

    /**
     * este método faz um sorteio aleatorio para os valores dos doces
     * @return valores double variando de 2 a 8.
     */
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}


