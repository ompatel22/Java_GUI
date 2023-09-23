import java.awt.*;    
import java.awt.event.*;    
  
class AdapterExample extends Frame {  
   // Frame f;    
    AdapterExample() { 
    //f = new Frame();	
  /*  f.addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                f.dispose();    
            }    
        });  */

        addMouseListener( new MouseAdapter()
        {
            public void mousePressed(MouseEvent e)
            {
		        setBackground(Color.RED);
            }
            public 	void mouseReleased(MouseEvent e)
            {
                setBackground(Color.BLACK);
            }
        }); 	
        setSize (400, 400);    
        setVisible (true);    
    }    
  
public static void main(String[] args) {    
   AdapterExample d1 =  new AdapterExample();    
}    
}    