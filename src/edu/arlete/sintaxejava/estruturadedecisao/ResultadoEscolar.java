package edu.arlete.sintaxejava.estruturadedecisao;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7)
            System.out.println("Aprovado");

        else
            System.out.println("Reprovado");

        /*
         variavel resultado = verifica se a nota é >= 7 se true (aprovado), senão : verifica a segunda condiçaõ
         se nota é maior ou igual 5 e menor q 7, se true, imprime recuperação, senão : reprovado
         */
        System.out.println("#############");
        System.out.println("ESTRUTURA TERNARIO");

        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

        System.out.println("#############");
        System.out.println("ESTRUTURA SWITCH CASE");

        String sigla = "M";
        switch (sigla){
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Médio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:{
                System.out.println("Valor indefinido.");
            }
        }

        System.out.println("#############");
        System.out.println("ESTRUTURA IF");

        if (sigla == "P"){
            System.out.println("Pequeno");
        } else if (sigla=="M") {
            System.out.println("Médio");
        } else if (sigla == "G") {
            System.out.println("Grande");
        }else {
            System.out.println("Valor indefinido.");
        }
    }
}
