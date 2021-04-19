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

        if(naechsterRechts instanceof Abschluss && naechsterLinks instanceof Abschluss){
            deviationRight = deviationLeft = positionDeviationX;
        }else if(naechsterRechts instanceof Abschluss){
            deviationRight = 0;
            positionDeviationX *= 2;
        }else if(naechsterLinks instanceof Abschluss){
            deviationLeft = 0;
            positionDeviationX *= 2;
        }

        gui.addLabel(x, y, xOld, yOld, inhalt.begriffGeben(),false);
        naechsterLinks.drawElement(gui, x-deviationRight, y+layerHeightY, x, y, positionDeviationX/2, layerHeightY);
        naechsterRechts.drawElement(gui, x+deviationLeft, y+layerHeightY, x, y, positionDeviationX/2, layerHeightY);

    }
    
    public Datenelement inhaltGeben(){
        return inhalt;
    }

    public boolean istDatenknoten(){
        return true;
    }
    
    public void naechsterLinksSetzen(Baumelement naechsterLinks){
        this.naechsterLinks = naechsterLinks;
    }
    
    public void naechsterRechtsSetzen(Baumelement naechsterRechts){
        this.naechsterRechts = naechsterRechts;
    }

    public Baumelement elementLöschen(Datenelement suchinhalt){
        if(inhalt.istGleich(suchinhalt)){
            if(naechsterLinks instanceof Abschluss && naechsterRechts instanceof Abschluss){
                return naechsterLinks;
            }else if(naechsterLinks instanceof Datenknoten && naechsterRechts instanceof Abschluss){
                return naechsterLinks;
            }else if(naechsterRechts instanceof Abschluss && naechsterLinks instanceof Datenknoten){
                return naechsterRechts;
            }else{
                Datenknoten dk = naechsterRechts.minimumGeben(this);
                elementLöschen(dk.inhaltGeben());
                dk.naechsterLinksSetzen(naechsterLinks);
                dk.naechsterRechtsSetzen(naechsterRechts);
                return dk;
            }
        }else if(inhalt.istKleiner(suchinhalt)){
            naechsterRechts = naechsterRechts.elementLöschen(suchinhalt);
        }else{
            naechsterLinks = naechsterLinks.elementLöschen(suchinhalt);
        }
        
        return this;
    }

    public Datenknoten minimumGeben(Datenknoten dk){
        return naechsterLinks.minimumGeben(this);
    }
}

