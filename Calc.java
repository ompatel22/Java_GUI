import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
class Calc extends Frame implements ActionListener
{
    int n1,n2;
    TextField t1,t2,t3;
    String str,s1,s2,s3;
    Calc()
    {
        setSize(600,600);
        setVisible(true);
        setBackground(Color.CYAN);
        setTitle("Calc");
        setLayout(new GridBagLayout());
        Panel pan=new Panel();
        //pan.setLayout(new FlowLayout(FlowLayout.LEFT,50,0));

        Label l1=new Label("Number1");
        Label l2=new Label("Number2");
        Label l3=new Label("Result");

        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);
        t3.setEditable(false);

        Button b1=new Button("+");b1.addActionListener(this);pan.add(b1);
        Button b2=new Button("-");b2.addActionListener(this);pan.add(b2);
        Button b3=new Button("x");b3.addActionListener(this);pan.add(b3);
        Button b4=new Button("/");b4.addActionListener(this);pan.add(b4);

        GridBagConstraints gbc=new GridBagConstraints();
        gbc.anchor=GridBagConstraints.FIRST_LINE_START;
        gbc.insets=new Insets(10,0,0,0);
        gbc.gridx=0;gbc.gridy=0;add(l1,gbc);
        gbc.gridx=0;gbc.gridy=1;add(l2,gbc);
        gbc.gridx=0;gbc.gridy=2;gbc.gridwidth=4;add(pan,gbc);
        gbc.gridx=0;gbc.gridy=3;add(l3,gbc);

        gbc.gridx=1;gbc.gridy=0;add(t1,gbc);
        gbc.gridx=1;gbc.gridy=1;add(t2,gbc);
        gbc.gridx=1;gbc.gridy=3;add(t3,gbc);

    }
    public void actionPerformed(ActionEvent e)
    {
        str=e.getActionCommand();
        s1=t1.getText();
        n1=Integer.parseInt(s1);
        s2=t2.getText();
        n2=Integer.parseInt(s2);
        if(str.equals("+"))
        {
            t3.setText(n1+"+"+n2+"="+(n1+n2));
        }
        else if(str.equals("-"))
        {
            t3.setText(n1+"-"+n2+"="+(n1-n2));
        }
        else if(str.equals("x"))
        {
            t3.setText(n1+"*"+n2+"="+(n1*n2));
        }
        else if(str.equals("/"))
        {
            t3.setText(n1+"/"+n2+"="+(n1/n2));
        }
    }
    
    public static void main(String args[])
    {
        Calc c=new Calc();
    }
}