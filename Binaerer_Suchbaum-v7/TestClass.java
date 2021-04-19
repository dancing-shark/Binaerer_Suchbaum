public class TestClass
{
    Woerterbuch buch;
    public TestClass(){
        buch = new Woerterbuch();
        
        wortEinfuegen("Rocket","space");
        wortEinfuegen("Apfel","Obst");
        
        wortEinfuegen("Ace","Spades");
        wortEinfuegen("Xing","Spades");
        wortEinfuegen("Artist","Details");        
        wortEinfuegen("Sniper","Details");        
        wortEinfuegen("Sledge","Hammer");
        wortEinfuegen("Drone","Amazon");
        wortEinfuegen("Space","Engeneers");
        wortEinfuegen("Beef","Jerky");
        wortEinfuegen("Tesla","Queue");
        
        baumZeichnen();
    }

    public void baumZeichnen(){
        buch.baumZeichnen();
    }

    private void wortEinfuegen(String begriff, String bedeutung){
        buch.wortEinfuegen(begriff, bedeutung);
        //baumZeichnen();
    }

    public void wortEinfuegenUndAusgeben(String begriff, String bedeutung){
        buch.wortEinfuegen(begriff,bedeutung);
        baumZeichnen();
    }
    
    public void löschen(String begriff, String bedeutung){
        buch.elementLöschen(begriff, bedeutung);
    }
}
