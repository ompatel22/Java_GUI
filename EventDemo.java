import java.awt.event.*;
import java.awt.*;
class EventDemo extends Frame implements ActionListener
{
    List l;
    TextField tf;
    TextArea ta;
    EventDemo()
    {
        setSize(300,300);
        setVisible(true);
        setLayout(new FlowLayout());
        tf=new TextField(10);
        ta=new TextArea(5,10);
        l=new List();
        l.add("cs");
        l.add("dsa");
        l.add("pts");
        l.add("java");
        l.addActionListener(this);
        tf.addActionListener(this);
        //ta.addActionListener(this);------>>> MOST MOST MOST IMP
        add(tf);
        add(ta);
        add(l);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==tf)
        {
            ta.append("\n"+tf.getText());
            tf.setText("");
        }
        else if(e.getSource()==l)
        {
            tf.setText(l.getSelectedItem());
            l.remove(l.getSelectedItem()); 
        }
    }
    public static void main (String args[])
    {
        EventDemo ed=new EventDemo();
    }
}