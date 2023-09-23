import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;
class LabCanvas extends Frame implements ItemListener
{
    Checkbox c1,c2;
    CheckboxGroup cbg;
    Mycanvas c;
    LabCanvas()
    {
        setSize(600,600);
        setVisible(true);
        setLayout(new FlowLayout());

        cbg=new CheckboxGroup();
        c1=new Checkbox("Rect",cbg,false);c1.addItemListener(this);
        c2=new Checkbox("Oval",cbg,false);c2.addItemListener(this);

        c=new Mycanvas();
        add(c1);
        add(c2);
        add(c);

    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==c1)
        {
            c.setc(1);
            c.repaint();
        }   
        else if(e.getSource()==c2)
        {
            c.setc(2);
            c.repaint();
        }
    }
    public static void main(String args[])
    {
        LabCanvas lc=new LabCanvas();
    }
}
class Mycanvas extends Canvas
{
    int c=0;
    Mycanvas()
    {
        setSize(300,300);
        setVisible(true);
        setBackground(Color.YELLOW);
    }
    public void setc(int c)
    {
        this.c=c;
    }
    public void paint(Graphics g)
    {
        if(c==1)
        {
            g.drawRect(100,100,100,100);
        }
        else if(c==2)
        {
            g.drawOval(100,100,100,100);
        }
    }
}