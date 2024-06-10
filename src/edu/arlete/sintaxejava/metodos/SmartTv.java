package edu.arlete.sintaxejava.metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    // criando os métodos
    public void ligar(){
        ligada = true;
    }//fimLigar

    public void desligar(){//desliga a tv
        ligada=false;
    }//fimDesligar

    public void aumentarVolume(){//aumenta o volume da tv
        volume++;
    }//fimAumentar

    public void diminuirVolume(){//diminui o volume da tv
        volume--;
    }//fimDiminuir

    public void mudarCanal(int novoCanal){//muda o canal para o canal desejado
       canal = novoCanal;
    }//fimMudarCanal

    public void aumentarCanal(){//aumenta o volume da tv
        canal++;
    }//fimAumentarCanal

    public void diminuirCanal(){//diminui o volume da tv
        canal--;
    }//fimDiminuirCanal
}
