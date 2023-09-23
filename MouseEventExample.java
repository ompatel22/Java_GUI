import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.*;

class MouseEventExample extends Frame implements MouseListener,MouseMotionListener
{   //boolean c=false;
    int c=0;
    TextField tf1,tf2;
    Button b;
    MouseEventExample()
	{   setSize(600,500);
	    setVisible(true);
        setLayout(new FlowLayout());
	    addMouseListener(this);
        addMouseMotionListener(this);
        tf1=new TextField(15);
        tf2=new TextField(15);
        b=new Button("change");
        add(tf1);add(tf2);add(b);
	}
	public void mouseClicked(MouseEvent e)
	{
		//setBackground(Color.RED);
		//c=true;
		//repaint();
        c++;
        if(c==1)
        {

        }
			   
	}public void mousePressed(MouseEvent e)
	{
		
	}public void mouseReleased(MouseEvent e)
	{
		
	}public void mouseEntered(MouseEvent e)
	{
        //setBackground(Color.RED);
	}public void mouseExited(MouseEvent e)
	{
		//setBackground(Color.BLUE);
	}
    public void mouseMoved(MouseEvent e)
    {
        //setBackground(Color.WHITE);
    }
    public void mouseDragged(MouseEvent e)
    {
        //setBackground(Color.YELLOW);
    }
	/*public void paint(Graphics g)
	{
		if(c)
		{
		g.drawRect(50,50,100,100); 
		}
        //c=false;---->>>false karvu nahi!!
	}*/
	   
	public static void main(String args[])
	{
		MouseEventExample d1 = new MouseEventExample();
	}


}