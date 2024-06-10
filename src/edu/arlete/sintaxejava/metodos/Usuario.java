package edu.arlete.sintaxejava.metodos;

public class Usuario {
    public static void main(String[] args) {
        // criando um objeto do tipo SmartTv
        SmartTv smartTv1 = new SmartTv();

        // imprime as caracteristicas da tv
        System.out.println("A TV está ligada? "+ smartTv1.ligada);
        System.out.println("Canal atual: "+ smartTv1.canal);
        System.out.println("Volume atual: "+ smartTv1.volume);

        smartTv1.ligar();
        System.out.println("E agora? A TV está ligada? "+ smartTv1.ligada);

        smartTv1.diminuirVolume();
        smartTv1.diminuirVolume();
        smartTv1.diminuirVolume();

        System.out.println("Volume atual: "+ smartTv1.volume);

        smartTv1.mudarCanal(12);
        System.out.println("Canal atual: "+ smartTv1.canal);

    }
}
