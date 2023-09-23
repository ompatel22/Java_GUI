import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
class DrawRectangle extends Frame implements ActionListener
{
    //boolean b=false;
    String str;
    int c;
    DrawRectangle()
    {
        setSize(600,600);
        setVisible(true);
        setBackground(Color.CYAN);
        setTitle("DrawRectangle");
        setLayout(new FlowLayout());

        Button b1=new Button("DrawRectangle");b1.addActionListener(this);add(b1);
        Button b2=new Button("DrawOval");b2.addActionListener(this);add(b2);
        Button b3=new Button("Erase");b3.addActionListener(this);add(b3);
    }
    public void actionPerformed(ActionEvent e)
    {
        str=e.getActionCommand();
        if(str.equals("DrawRectangle"))
        {   
            c=1;
            repaint();
        }
        else if(str.equals("DrawOval"))
        {   
            c=2;
            repaint();
        }
        else if(str.equals("Erase"))
        {
            c=3;
            repaint();
        }
    }
    public void paint(Graphics g)
    {
        if(c==1)
        {
            g.drawRect(200,250,200,100);
        }
        else if(c==2)
        {
            g.drawOval(200,250,200,100);
        }
        else if(c==3)
        {
           // g.drawString("",0,0);
           //we have to draw nothing.
        }
        c=0;
    }
    public static void main(String args[])
    {
        DrawRectangle d=new DrawRectangle();
    }
}