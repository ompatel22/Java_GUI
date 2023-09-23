import java.awt.*;
import java.awt.event.*;

class HWDialog extends Frame implements ActionListener
{
    CardLayout c;
    Dialog d;
    Button b1,b2;
    Label l1,l2,l3,l4;
    TextField t1,t2;
    HWDialog()
    {
        c=new CardLayout();
        setSize(600,600);
        setVisible(true);
        setBackground(Color.CYAN);
        setLayout(c);

        Panel p1=new Panel();
        Panel p2=new Panel();

        l1=new Label("USERNAME:");
        l2=new Label("PASSWORD:");
        l3=new Label("Please Login!!");
        l4=new Label();
        b1=new Button("Click Here");
        b2=new Button("Login");
        t1=new TextField();
        t2=new TextField();
        d=new Dialog(this,"Login",false);

        d.setSize(400,200);
        d.setBackground(Color.YELLOW);
        d.setResizable(false);
        d.setLayout(new GridLayout(3,2,25,25));
        d.add(l1);d.add(t1);
        d.add(l2);d.add(t2);
        d.add(l4);d.add(b2);b2.addActionListener(this);

        p1.add(l3);p1.add(b1);b1.addActionListener(this);
        p2.add(new Label("Welcome!!!"));

        add(p1,"p1");
        add(p2,"p2");

        c.show(this,"p1");

        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        }
        );

        d.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        }
        );
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            d.setVisible(true);
        }
        else if(e.getSource()==b2)
        {
            d.setVisible(false);
            c.show(this,"p2");
        }
    }
    public static void main(String args[])
    {
        HWDialog d=new HWDialog();
    }
}