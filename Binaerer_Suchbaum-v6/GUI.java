import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;
import javax.swing.border.LineBorder;

public class GUI{ // Achtung: Nicht verändern
    private BinaererSuchbaum suchbaum;
    private JLabel label;
    private Frame frame;
    
    
    public GUI(BinaererSuchbaum suchbaum){
        this.suchbaum=suchbaum;
    }
    
    public void addFrame(){
        frame = new Frame();
    }
    
    
    public void addLabel(int x, int y, int xOld, int yOld, String begriff, String bedeutung,boolean abschluss){
        label = new JLabel("<html>"+begriff+"<br/>"+bedeutung+"</html>",JLabel.CENTER);
        if (abschluss){
            label.setBounds(x+30, y, 25,25);
            label.setBorder(new LineBorder(Color.RED,2));
        } else {
            int lenge = (begriff.length()>bedeutung.length()) ? begriff.length()*9 : bedeutung.length()*9;

            label.setBounds(x+((100-lenge)/2)-5, y, lenge,32);
            label.setBorder(new LineBorder(Color.GREEN,2));
        }
        
        frame.add(label);
        frame.addline(x+50, y+30, xOld+50, yOld+65);
    }

    
    public void baumZeichnen(){ //Wird in Woerterbuch ausgeführt, Baum soll gezeichnet werden
        addFrame();
        
        suchbaum.drawElement(this, frame.getSize().width/2, 20, frame.getSize().width/2,30,300, frame.getSize().height/(suchbaum.hoeheBerechnen()+4));
        //                   gui, x                       ,y  , xOld                 ,yOld, positionDeviationX, layerHeightY,
        
        frame.lines.remove(0);
        frame.setVisible(true);
    }
    
}
