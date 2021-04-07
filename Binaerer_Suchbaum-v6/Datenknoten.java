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
        
        int deviationLeft = positionDeviationX;
        int deviationRight = positionDeviationX;

        if(naechsterRechts.istDatenknoten() == false && naechsterLinks.istDatenknoten() == false){
            deviationRight = deviationLeft = positionDeviationX;
        }else if(naechsterRechts.istDatenknoten() == false){
            deviationRight = 0;
            positionDeviationX *= 2;
        }else if(naechsterLinks.istDatenknoten() == false){
            deviationLeft = 0;
            positionDeviationX *= 2;
        }

        gui.addLabel(x, y, xOld, yOld, inhalt.begriffGeben(), inhalt.bedeutungGeben(),false);
        naechsterLinks.drawElement(gui, x-deviationRight, y+layerHeightY, x, y, positionDeviationX/2, layerHeightY);
        naechsterRechts.drawElement(gui, x+deviationLeft, y+layerHeightY, x, y, positionDeviationX/2, layerHeightY);

    }
    
    public boolean istDatenknoten(){
        return true;
    }

}

