import java.awt.*;
import java.awt.Graphics.*;
class MyFrame extends Frame
{
  MyFrame()
  {
   super("BorderLayout Demo");
   setSize(600,400);
   setVisible(true);
   setLayout(new BorderLayout());
   Button b1 = new Button("Submit");
   add(b1,BorderLayout.NORTH);
   Button b2 = new Button("Cancel");
   add(b2,BorderLayout.EAST);
  }
}
class BorderLayoutDemo
{
   public static void main(String args[])
   {
     MyFrame f = new MyFrame();
   }
}