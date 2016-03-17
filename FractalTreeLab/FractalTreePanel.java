
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class FractalTreePanel extends JPanel
{ 
    private final int HEIGHT= 1200
    private final int WIDTH=800;
    private final int ANGLE=  Math.PI/4;
    private final double Detail=.50 
    private int currentOrder=;
    
   
    public FractalTree(int currOrder)
    {
        currOrder= currentOrder; 
        setBackground(Color.BLACK); 
        setPreferredSize(new Dimensions(WIDTH,HEIGHT)); 
        
    }

    public static void drawFractal(Graphics2D g2, int x1, int y1,int x2, int y2, double newAngle)
    {
        if(recurs==branches)
        {
            int lengthB= (int)Math.round(Math.pow(size,recurs-1)); 
            //generates a number in which it will be raised to the power of 2 to n-1, which will allow the branch to be halved each time 
            //terminating factor 
        }
        
        int x1 = (int) Math.round(x - (2 * lengthB * Math.sin(angle)));
        int y1 = (int) Math.round(y - (2 * lengthB * Math.cos(angle)));
        
        int x1= (x+x1) /2; 
        int y1=(y+y1)/2; 
        
        int x2=(x1+x)/2; 
        int y2=(y2+y)/2; 
        
        int x3=(x2+x)/2; 
        int y3= (y2+y)/2; 
        
        int x4=(x3+x)/2;
        int y4=(y3+y)/2; 
        
        
        
    }
    
    public void paintComponent(Graphics2D g2) 
    {
        super.paintComponent(g2); 
    }

}
