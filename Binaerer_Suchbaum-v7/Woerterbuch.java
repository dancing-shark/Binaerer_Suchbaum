public class Woerterbuch {
    private BinaererSuchbaum suchbaum;
    private GUI gui;// Achtung: Nicht verändern

    public Woerterbuch() {
        suchbaum = new BinaererSuchbaum();
        
        gui = new GUI(suchbaum);// Achtung: Nicht verändern
    }
    
    public int heoheBerechnen(){
        return suchbaum.hoeheBerechnen();
    }
    
    public void wortEinfuegen(String begriff, String bedeutung){
        suchbaum.einfuegen(new Wort(begriff, bedeutung));
        
    }
    
    public void baumZeichnen(){ // Achtung: Nicht verändern
        gui.baumZeichnen();
    }
    
    public void elementLöschen(String begriff, String bedeutung){
        suchbaum.elementLöschen(new Wort(begriff, bedeutung));
    }
}