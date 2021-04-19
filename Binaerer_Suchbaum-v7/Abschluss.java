public class Abschluss extends Baumelement {

    public Abschluss() { 

    }

    public int hoeheBerechnen(){
        return 0;
    }

    public Datenknoten sortiertEinfuegen(Datenelement inhaltNeu){
        return new Datenknoten(this, new Abschluss(), inhaltNeu);
    }

    
    public void drawElement(GUI gui, int x, int y, int xOld, int yOld, int positionDeviationX, int layerHeightY){
        gui.addLabel(x, y, xOld, yOld, "A",true);
    }
    
    public boolean istDatenknoten(){
        return false;
    }
    
    public Baumelement elementLöschen(Datenelement suchinhalt){
        return this;
    }
    
    public Datenknoten minimumGeben(Datenknoten dk){
        return dk;
    }
}

