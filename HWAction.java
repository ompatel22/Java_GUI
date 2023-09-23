import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.*;

class HWAction extends Frame implements ActionListener
{   //boolean c=false;
    int c=0;
    TextField tf1,tf2;
    Button b;
     HWAction()
	{   setSize(600,500);
	    setVisible(true);
        setLayout(new FlowLayout());
	    
        tf1=new TextField(15);
        tf2=new TextField(15);
        b=new Button("change");
        b.addActionListener(this);
        add(tf1);add(tf2);add(b);
	}
	public void actionPerformed(ActionEvent e)
	{
        c++;
        if(c==1)
        {
            tf2.setText(tf1.getText().toUpperCase());
        }
		if(c==2)
        {
            tf2.setText(tf1.getText().toLowerCase());
            c=0;
        }   
	}
	public static void main(String args[])
	{
		 HWAction d1 = new  HWAction();
	}


}