public class Usuario {
    public static void main(String[] args) throws Exception {
    
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? : " + smartTv.canal);
        System.out.println("Volume Atual? : " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> TV ligada? "+ smartTv.ligada);

        smartTv.desligar ();    
        System.out.println("Novo Status -> Tv ligada? "+ smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal agora está no: " + smartTv.canal);
    }
}
