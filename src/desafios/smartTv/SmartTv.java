package smartTv;

public class SmartTv {
    boolean ligado = true;
    int canal =1;
    int volume = 25;

    public  void mudarCanal( int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
       // volume = volume + 1;
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public  void ligar(){
        ligado = true;
    }
    public void deligado(){
        ligado = false;
    }
}
