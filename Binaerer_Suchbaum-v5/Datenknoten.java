public class Datenknoten extends Baumelement {
    private Baumelement naechsterLinks;
    private Baumelement naechsterRechts;
    private Datenelement inhalt;


    public Datenknoten(Baumelement nL, Baumelement nR, Datenelement inhalt) {
        naechsterLinks = nL;
        naechsterRechts = nR;
        this.inhalt = inhalt;
    }

    public int hoeheBerechnen(){
        int rechteZahl = naechsterRechts.hoeheBerechnen();
        int linkeZahl = naechsterLinks.hoeheBerechnen();
        if(rechteZahl > linkeZahl){
            return rechteZahl + 1;
        }
        return linkeZahl +1;

    }
    

    public Datenknoten sortiertEinfuegen(Datenelement inhaltNeu){
        if(inhalt.istKleiner(inhaltNeu)){
            naechsterRechts = naechsterRechts.sortiertEinfuegen(inhaltNeu);
        } else{
            naechsterLinks = naechsterLinks.sortiertEinfuegen(inhaltNeu);
        }
        return this;
    }
    
    public void drawElement(GUI gui, int x, int y, int xOld, int yOld, int positionDeviationX, int layerHeightY){
        
        
        gui.addLabel(x, y, xOld, yOld, inhalt.begriffGeben(), inhalt.bedeutungGeben());
        naechsterLinks.drawElement(gui, x-positionDeviationX, y+layerHeightY, x, y, positionDeviationX/2, layerHeightY);
        naechsterRechts.drawElement(gui, x+positionDeviationX, y+layerHeightY, x, y, positionDeviationX/2, layerHeightY);
        
    }

}

