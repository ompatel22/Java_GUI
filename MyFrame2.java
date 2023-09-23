import java.awt.*;
import java.awt.Graphics.*;
class MyFrame2 extends Frame
{
	MyFrame2()
	{
		setSize(600,600);
		setVisible(true);
		setTitle("Graphics ex");
		setLayout(null);
		setBackground(Color.YELLOW);
	}
	public void paint(Graphics g)
	{
		Font f=new Font("Arial",Font.ITALIC,18);
		g.setFont(f);
		g.setColor(Color.BLUE);
		g.drawString("hello",300,50);
			
		g.setColor(Color.RED);
		g.fillRect(250,250,100,100);

		g.setColor(Color.BLUE);
		g.fillOval(250,250,100,100);

		g.setColor(Color.WHITE);
		g.drawLine(250,250,350,350);

		g.drawLine(350,250,250,350);
		
		g.drawLine(300,250,300,350);

		g.drawLine(250,300,350,300);

		g.fillArc(250,200,100,100,0,180);
		
		g.fillArc(300,250,100,100,270,180);
		
		g.fillArc(200,250,100,100,90,180);
			
		g.fillArc(250,300,100,100,180,180);

	}
	public static void main(String args[])
	{
		MyFrame2 f=new MyFrame2();
	}
}