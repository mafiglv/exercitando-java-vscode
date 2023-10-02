public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume(){
        ///volume=volume + 1;
        volume++;
        System.out.println("O volume está aumentando para: " + volume);
    }

    public void diminuirVolume(){
        ///volume=volume + 1;
        volume--;
        System.out.println("O volume está diminuindo para: " + volume);
    }

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

}
