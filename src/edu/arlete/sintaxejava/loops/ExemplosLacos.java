package edu.arlete.sintaxejava.loops;

public class ExemplosLacos {
    public static void main(String[] args) {
        /*
        for (int x = 1; x <= 10; x++) {
            if (x % 2 == 0) //% operador que representa módulo de uma divisão
                System.out.println(x);
        }

        String[] nomes = {"Camila", "Venilton", "Leonardo", "Renan", "Rafael"};
        System.out.print(nomes.length);

         */

        int numero = 1;

        for (int x=1; x<2; x++){
            numero = numero + x;
        }
        System.out.println("O valor de número é: " + numero);

        System.out.println("xxxxxx");

        int num = 5, count = 1;
        do {
            num += count;
            System.out.println(num);
            count++;
        } while (count <= 3);

        boolean condicao = false;

        while(condicao){
            System.out.println("executou ... ");
        }

    }
}