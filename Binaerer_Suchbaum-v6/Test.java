import java.util.Random;

public class Test{
    Woerterbuch buch;
    
    public Test(int anzahl){
        buch = new Woerterbuch();
        
        Random wuerfel = new Random();
        int augenZahl;

        for (int i=0; i<anzahl; i++){
            augenZahl = wuerfel.nextInt(10);
            buch.wortEinfuegen(""+augenZahl, "Test");
        }
        baumZeichnen();
    }
    
    public void baumZeichnen(){
        buch.baumZeichnen();
    }
    
    public void wortEinfuegen(String begriff, String bedeutung){
        buch.wortEinfuegen(begriff, bedeutung);
    }
}
