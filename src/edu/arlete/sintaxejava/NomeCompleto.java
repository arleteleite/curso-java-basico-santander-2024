package edu.arlete.sintaxejava;

public class NomeCompleto {
    public static void main(String[] args) {
        //declarando as variaves
        String primeiroNome = "Arlete";
        String segundoNome = "Leite";

        // declarando a variavel nomeCompleto e inicializando com o metodo nomeCompleto com a passagem dos parametros
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        //exibindo na tela a variavel nomeCompelto
        System.out.println(nomeCompleto);

    }
    // criando o metodo que constroi o nome completo
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do médoto nomeCompleto: ".concat(primeiroNome).concat(" ").concat(segundoNome);
    }
}
