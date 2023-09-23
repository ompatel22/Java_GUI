import java.awt.*;
import java.awt.event.*;
class CardSample extends Frame implements ActionListener
{
    CardLayout c;
    String str;
    CardSample()
    {
        setSize(600,600);
        setVisible(true);
        setTitle("CardLayout Demo");
        setBackground(Color.CYAN);
        c=new CardLayout();
        setLayout(c);
        Panel p1=new Panel();
        Panel p2=new Panel();
        //Frame p1=new Frame();
        //Frame p2=new Frame();

        //p1.setLayout(new FlowLayout());
        Label l1=new Label("Enter Your Name:");p1.add(l1);
        TextField tf=new TextField(20);p1.add(tf);
        Button b1=new Button("Submit");p1.add(b1);b1.addActionListener(this);
        
        //p2.setLayout(new FlowLayout());
        Button b2=new Button("Submit");p2.add(b2);
        Button b3=new Button("Cancel");p2.add(b3);b3.addActionListener(this);

        this.add(p1,"p1");
        this.add(p2,"p2");

        c.show(this,"p1");
    }
    public void actionPerformed(ActionEvent e)
    {
        str=e.getActionCommand();//use with object of ActionEvent.
        if(str.equals("Submit"))
        c.show(this,"p2");
        else if(str.equals("Cancel"))
        c.show(this,"p1");
    }
    public static void main(String args[])
    {
        CardSample c1=new CardSample();
    }
}