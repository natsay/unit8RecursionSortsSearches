
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class FractalTreePanel extends JPanel
{ 
    private int maxAngle=180; 
    private int startAngle=0; 
    private int pointX=600; 
    private int pointY=600; 
    private int branches=3; 
    private double treeSize=2; 
    private int numRecurs=5; 
    
   
    public FractalTree()
    {
        this.maxAngle= maxAngle; 
        this.startAngle=startAngle; 
        this.pointX=pX; 
        this.pointY=py\Y; 
        this.branches=branches; 
        this.treeSize= size; 
        this.numRecurs=nRecurs; 
        
    }

    public static void drawFractal(Graphics2D g2, int x, int y, int recurs, int angle)
    {
        if(recurs==branches)
        {
            int lengthB= (int)Math.round(Math.pow(size,recurs-1)); 
            //generates a number in which it will be raised to the power of 2 to n-1, which will allow the branch to be halved each time 
            //terminating factor 
        }
        
        int x1 = (int) Math.round(x - (2 * lengthB * Math.sin(angle)));
        int y1 = (int) Math.round(y - (2 * lengthB * Math.cos(angle)));
    }

}
