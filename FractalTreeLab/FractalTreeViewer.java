import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FractalTreeViewer
{
    private final int WIDTH=400; 
    private final int HEIGHT=500; 
    
    private FractalTreePanel tree;
    private JPanel panel; 
    private JLabel title; 
    private JFrame frame; 
    public static void main(String[] args) 
    {
        FractalTreeViewer viewer= new FractalTreeViewer(); 
    }
    public FractalTreeViewer()
    {
        this.panel= new JPanel(); 
        panel.setBackground(Color.BLACK); 
    
        
        panel.add(title); 
        
        frame= new JFrame(); 
        frame.setTitle("The Fractal Tree"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(WIDTH,HEIGHT; 
        frame.add(panel); 
        frame.setVisible(true);
        
        
        
        
    }
  
}
