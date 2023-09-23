import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;

class KeyEventExample extends Frame implements KeyListener
{   int keyget=0;
    TextArea ta;
    TextField tf;
   KeyEventExample()
   {
     setSize(700,400);
	 setVisible(true);
	 setLayout(new FlowLayout());
	 ta = new TextArea();
     //tf=new TextField();
     //add(tf);
	 add(ta);
     //tf.addKeyListener(this);
	 ta.addKeyListener(this);
     //addKeyListener(this);
   }
   public void keyTyped(KeyEvent e)
   {
     
   }
   public void keyPressed(KeyEvent e)
   {
	   ta.append("\nEntered Character="+e.getKeyChar()+"\nCode of Entered Character="+e.getKeyCode()+"\n");
   }
   public void keyReleased(KeyEvent e)
   {
   }
   
   public static void main(String args[])
   {
	   KeyEventExample w = new KeyEventExample();
   }


}