import java.awt.*;
import java.awt.Graphics.*;
class MyFrame extends Frame
{
  MyFrame()
  {
   super("SetBounds Demo");
   setSize(600,400);
   setVisible(true);
   setLayout(null);
   Button b1 = new Button("Submit1");
   b1.setBounds(100,50,70,60);
   Button b2=new Button("s2");
   add(b2);
   b2.setBounds(180,50,70,60);
   add(b1);
  }
}
class SetBoundsDemo
{
   public static void main(String args[])
   {
     MyFrame f = new MyFrame();
   }
}