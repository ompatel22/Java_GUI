import java.awt.*;
import java.awt.Graphics.*;

class MyFrame extends Frame
{
	MyFrame()
	{     
	  super("Frame Title");  
	  setSize(600,400);
	  setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello",50,50);
		g.setColor(Color.RED);
		g.fillRect(250,150,100,100);
		g.setColor(Color.BLUE);
		g.drawOval(250,150,100,100);
		g.setColor(Color.BLACK);
		g.drawLine(300,150,300,250);
		g.drawLine(250,200,350,200);
		g.drawLine(250,200,350,200);
	}
}
class PaintMethodDemo
{
  public static void main(String args[])
  {
    MyFrame f1 = new MyFrame();
	
  }

}