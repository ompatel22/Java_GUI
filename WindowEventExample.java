import java.awt.*;
import java.awt.event.*;

class WindowEventExample extends Frame implements WindowListener
{
   WindowEventExample()
   {
     setSize(700,400);
	 setVisible(true);
	 addWindowListener(this);
   }
   public void windowOpened(WindowEvent e)
   {
	   setBackground(Color.RED);
	   System.out.println("WindowOpened");
   }
   public void windowClosed(WindowEvent e)
   {
	   System.out.println("WindowClosed");
	   
   }
   public void windowIconified(WindowEvent e)
   {
         setBackground(Color.RED);
	   System.out.println("WindowIconified");
   }
   public void windowDeiconified(WindowEvent e)
   {
	   System.out.println("Windowdeiconified");
   }
   public void windowActivated(WindowEvent e)
   {
	   System.out.println("Windowactivated");
   }
   public void windowDeactivated(WindowEvent e)
   {
	   System.out.println("Windowdeactivated");
   }
   public void windowClosing(WindowEvent e)
   {System.out.println("Windowclosing");
    dispose();
    //System.exit(0);
   }
   public static void main(String args[])
   {
	   WindowEventExample w = new WindowEventExample();
   }


}