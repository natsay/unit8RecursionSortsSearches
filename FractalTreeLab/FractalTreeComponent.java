import java.awt.*; 
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Stroke; 
import java.awt.BasicStroke; 

public class FractalTreeComponent extends JPanel
{
    //instance varibles for panel width  and height
    private final int WIDTH=1200; 
    private final int HEIGHT=950;
    //instance variable angle measurents
    private final double ANGLE=Math.PI/6; 
    //instance variable for how much each length should be decreased by
    private final double smallerSize= .80; 
    //instance varible for order
    private int curr_order; 
    /**
     * Constructor for objects of class FractalTreePanel
     */
    public FractalTreeComponent(int currentOrder)
    {
        curr_order= currentOrder; 
        //sets background to black
        setBackground(Color.BLACK);
        //sets panel size
        setPreferredSize(new Dimension(WIDTH,HEIGHT));

    }
   
    public void drawFractal(int order,int x1,int y1, int x2, int y2,double nAngle,Graphics g2)
    {
        //instance varibles for corrdinates 
        double deltaX, deltaY, xP, yP, xN, yN;

        if(order==1)
        {
            //of the order reaches 1, then will draw a line connecting the points
            g2.drawLine(x1,y1,x2,y2);
            
        }
       
        else 
        {
            //subtracts the first two corrdinates from each other to get a new point
            deltaX=x2-x1; 
            deltaY=y2-y1; 
            //draws line again
            g2.drawLine(x1,y1,x2,y2);
            //recordes the length between the deltaX and deltaY then mutiples it by the decrementing size
            double len=(Math.sqrt(deltaX*deltaX+deltaY*deltaY))*smallerSize; 
            //adds and newAngle to the original angle 
            double nAngle_pos= nAngle+ ANGLE; 
            double nAngle_neg= nAngle-ANGLE; 
            //finds the next length 
            xP=x2-Math.sin(nAngle_pos)*len; 
            yP=y2-Math.cos(nAngle_pos)*len; 
            //finds the next length
            xN=x2-Math.sin(nAngle_neg)*len;
            yN=y2-Math.cos(nAngle_neg)*len; 
            //calls drawFractal 
            drawFractal(order-1,x2,y2,(int)xP,(int)yP,nAngle_pos,g2);
            drawFractal(order-1,x2,y2,(int)xN,(int)yN,nAngle_neg,g2);

        }
    }

    public void paintComponent(Graphics g2)
    {
        //paints the panel
        super.paintComponent(g2);
        g2.setColor(Color.BLUE);
        drawFractal(curr_order,WIDTH/2,HEIGHT,WIDTH/2,HEIGHT-200,0,g2);
    }

    public void getOrder(int order)
    {
        //keeps track of order
        curr_order= order;
    }
}
