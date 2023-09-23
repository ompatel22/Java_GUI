import java.awt.*;    
import java.awt.event.*;  

class Dialog_Example extends Frame implements ActionListener
{ 
    Dialog md;
    TextField t1,t2,t3;
    Label l1,l2,l3;
    Button b1,b2;
  Dialog_Example()
   {
     setSize(700,400);
     setVisible(true);
     setLayout(new FlowLayout());

	  t1 = new TextField();
	  t2 = new TextField();
      t3 = new TextField(20);
	  b1 = new Button("Login");
      b2 = new Button("Open");
      b1.addActionListener(this);
      b2.addActionListener(this);
      l1=new Label("Name:");
      l2=new Label("Password:");
      l3=new Label();

      add(t3);
      add(b2);

      this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });


	  md = new Dialog(this,"Login Dialog",false);
      md.setSize(400,200);
	  //md.setVisible(true);
	  md.setResizable(true);
	  md.setLayout(new GridLayout(3,2,25,25));
        
    
	  md.add(l1);md.add(t1);
	  md.add(l2);md.add(t2);
 	  md.add(l3);md.add(b1);
   }
   public void actionPerformed(ActionEvent e)
   {
        if(e.getSource()==b1)
        {
            md.setVisible(false);
        }
        else if(e.getSource()==b2)
        {
            md.setVisible(true);
        }
   }

public static void main(String args[])
{
   Dialog_Example d = new Dialog_Example();
}
}