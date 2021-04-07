public abstract class Baumelement {
    public abstract int hoeheBerechnen();
    public abstract Datenknoten sortiertEinfuegen(Datenelement InhaltNeu);
    
    public abstract void drawElement(GUI gui, int x, int y, int xOld, int yOld, int positionDeviationX, int layerHeightY);
}


