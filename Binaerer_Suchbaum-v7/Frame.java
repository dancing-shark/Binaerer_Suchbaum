import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
 
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Frame extends JFrame{
    public ArrayList<Line2D> lines = new ArrayList<Line2D>();
    
    public Frame(){
        super("Binaerer Suchbaum");
        setLocationRelativeTo(null);
        setSize(1200,800);
        getContentPane().setBackground(new Color(157, 192, 255));
        setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        //setUndecorated(true);
        
    }
    
    public void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        for (int i = 0; i < lines.size(); i++) {
            g2d.draw(lines.get(i));
        }
    }
    
    public void addline(int x, int y, int xOld, int yOld){
        lines.add(new Line2D.Double(xOld,yOld,x,y));
    }
 
    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
    }
}
