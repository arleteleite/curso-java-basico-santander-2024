package edu.arlete.sintaxejava.loops;

public class ExemplosFor {
    public static void main(String[] args) {

        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
        }

        for (int x = 1; x <= 10; x++) {
            if (x % 2 == 0) //% operador que representa módulo de uma divisão
                System.out.println(x);
        }

        int numero = 1;

        for (int x=1; x<2; x++){
            numero = numero + x;
        }
        System.out.println("O valor de número é: " + numero);

        // Outras estruturas

        //estrutura 1
        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
        }

        //estrutura 2
        //o que importa é somente o bloco condicional
        int carneirinhos = 1;
        for( ; carneirinhos <=20; ) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
            carneirinhos ++;
        }

        //for( somente 1x ; deve ser uma expresão boolean; acontecerá a cada final da execução ) { }

        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        //Forma abreviada
        for(String aluno : alunos) {
            System.out.println("O aluno é "+aluno);
        }

        for(int teste = 1; teste <=5; teste ++) {
            if (teste == 3)
                break;

            System.out.println(teste);
        }
        for(int teste = 1; teste <=5; teste ++){
            if(teste==3)
                continue;

            System.out.println(teste);

        }

    }
}