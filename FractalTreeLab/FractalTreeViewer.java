import java.awt.*; 
import javax.swing.*; 

public class FractalTreeViewer 
{
    //sets frame width and height 
    private final int FRAME_WIDTH=1200; 
    private final int FRAME_HEIGHT=800; 

    private FractalTreeComponent component;
    //sets a variable to a FractalTreeComponent object
    private JFrame frame;
    //sets a varibale to a JFrame object
    
    public FractalTreeViewer() 
    {
        //creates new JFrame object
        frame= new JFrame(); 
        
        component= new FractalTreeComponent(15);
        //creates new FractalTreeComponent and iterates through everything 15 times
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT); 
        //set frame size
        frame.add(component);
        //adds component to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        //close the frame
        frame.setVisible(true);
        //sets frame to be visible 
        
    }
    public static void main (String[] args)
    {
        //creates new FractalTreeViewer object
        FractalTreeViewer viewer= new FractalTreeViewer();
    }
}