public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("O volume da TV e: "+smartTv.volume);

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Qual o canal? "  + smartTv.canal);
        System.out.println("Qual o volume atual da TV? " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("TV ligaada? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("TV esta desligada? "+ smartTv.ligada);


    }
}

