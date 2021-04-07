public class BinaererSuchbaum {
    private Baumelement wurzel;
    
    public BinaererSuchbaum() {
        wurzel = new Abschluss();
        
    }

    public int hoeheBerechnen(){
        return wurzel.hoeheBerechnen();
    }

    public void einfuegen(Datenelement inhaltNeu){
        wurzel = wurzel.sortiertEinfuegen(inhaltNeu);
    }
    
    public void drawElement(GUI gui, int x, int y, int xOld, int yOld, int positionDeviationX, int layerHeightY){
        wurzel.drawElement(gui, x,  y, xOld, yOld, positionDeviationX, layerHeightY);
    }
}

