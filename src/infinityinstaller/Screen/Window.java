package infinityinstaller.Screen;

import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *@author Hawk_x6x
 */
public class Window extends JFrame{
    
    public Window(int sx, int sy, String name, boolean resizable, boolean close){
        setTitle(name);
        setSize(sx, sy);
        setVisible(true);
        setResizable(resizable);
        if(close)setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void paint(Graphics g){
        
    }
    
}
