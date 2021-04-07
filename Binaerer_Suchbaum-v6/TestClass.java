public class TestClass
{
    Woerterbuch buch;
    public TestClass(){
        buch = new Woerterbuch();

        wortEinfuegen("Rocket","space");
        wortEinfuegen("Apfel","Obst");
        wortEinfuegen("Ace","Spades");
        wortEinfuegen("Artist","Details");        
        wortEinfuegen("Sniper","Details");        
        wortEinfuegen("Sledge","Hammer");
        wortEinfuegen("Drone","Amazon");
        wortEinfuegen("Space","Engeneers");
        wortEinfuegen("Beef","Jerky");
        wortEinfuegen("Barby","Queue");
        
        
        baumZeichnen();
    }
    public void baumZeichnen(){
        buch.baumZeichnen();
    }

    public void wortEinfuegen(String begriff, String bedeutung){
        buch.wortEinfuegen(begriff, bedeutung);
    }
}
