public class Wort extends Datenelement {
    private String begriff;
    private String bedeutung;
    public Wort(String begriff, String bedeutung) {
        this.begriff = begriff;
        this.bedeutung = bedeutung;
    }
    
    public String begriffGeben() {
        return begriff;
    }
    
    public void datenAusgeben() {
        System.out.println(begriff+", "+ bedeutung);
    }
    
    public String bedeutungGeben(){
        return bedeutung;
    }
    
    public boolean istGleich(Datenelement suchinhalt) {
        return begriff.compareTo(((Wort) suchinhalt).begriffGeben()) == 0;
    }
    
    public boolean istKleiner(Datenelement suchinhalt) {
        return begriff.compareTo(((Wort) suchinhalt).begriffGeben()) < 0;
    }
}