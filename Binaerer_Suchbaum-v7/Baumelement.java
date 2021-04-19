public abstract class Baumelement {
    public abstract int hoeheBerechnen();
    public abstract Datenknoten sortiertEinfuegen(Datenelement InhaltNeu);
    public abstract boolean istDatenknoten();
    public abstract void drawElement(GUI gui, int x, int y, int xOld, int yOld, int positionDeviationX, int layerHeightY);
    public abstract Baumelement elementLöschen(Datenelement suchinhalt);
    public abstract Datenknoten minimumGeben(Datenknoten dk);
}


