import java.awt.event.*;
import java.awt.*;
class ItemEventDemo extends Frame implements ItemListener
{
    List l;
    Choice c;
    Checkbox c1,c2,c3,c4;
    CheckboxGroup cbg;
    TextArea ta;
    ItemEventDemo()
    {
        setSize(300,300);
        setVisible(true);
        setLayout(new FlowLayout());
        c=new Choice();
        c.add("cs");
        c.add("dsa");
        c.add("pts");
        c.add("java");c.addItemListener(this);

        l=new List();
        l.add("cs");
        l.add("dsa");
        l.add("pts");
        l.add("java");l.addItemListener(this);

        Panel rb=new Panel();
        cbg=new CheckboxGroup();
        c1=new Checkbox("male",cbg,false);c1.addItemListener(this);
        c2=new Checkbox("female",cbg,false);c2.addItemListener(this);
        rb.add(c1);rb.add(c2);

        c3=new Checkbox("Music");c3.addItemListener(this);
        c4=new Checkbox("Dance");c4.addItemListener(this);
        Panel cb=new Panel();
        cb.add(c3);cb.add(c4);

        ta=new TextArea(5,10);

        add(l);add(c);add(rb);add(cb);add(ta);
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==l)
        {
            ta.append("\n"+l.getSelectedItem());
        }
        else if(e.getSource()==c)
        {
            ta.append("\n"+c.getSelectedItem());
        }
        else if(e.getSource()==c1)
        {
            ta.append("\nyou are male");
        }
        else if(e.getSource()==c3)
        {
           setBackground(Color.YELLOW);
        }
        
    }
    
    public static void main (String args[])
    {
        ItemEventDemo ed=new ItemEventDemo();
    }
}