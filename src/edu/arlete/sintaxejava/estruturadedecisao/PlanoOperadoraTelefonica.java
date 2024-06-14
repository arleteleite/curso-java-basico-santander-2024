package edu.arlete.sintaxejava.estruturadedecisao;

public class PlanoOperadoraTelefonica {
    public static void main(String[] args) {
        String plano = "M"; //M / T

        if (plano == "B") {
            System.out.println("100 minutos de ligação");
        } else if (plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Intagram grátis");
        } else if (plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Intagram grátis");
            System.out.println("5Gb Youtube");
        }

        //agora o mesmo código mais usando o switch/case
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("Agora usando o switch/case");
        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e Intagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
