public class SmartTv {
    static boolean ligada = false;
    static int canal = 1;
    static int volume = 25;


    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        // volume = volume + 1
        System.out.println("Aumentando o volume para:" + volume);
    }

    public void diminuirVolume() {
        volume--; 
        // volume = volume - 1 
        System.out.println("Diminuindo o volume para:" + volume);
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }  
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}