import java.awt.*;

class MyFrame3 extends Frame{
    MyFrame3()
    {
	setSize(600,600);
 	setVisible(true);
   	setLayout(new GridBagLayout());
        GridBagConstraints cons = new GridBagConstraints();
	
	cons.ipadx = 10;
        cons.ipady = 10;
        cons.gridx = 0;
        cons.gridy = 0;
	cons.gridwidth=1;
	cons.gridheight=2;
     	add(new Label("Name:"),cons);
	
        cons.gridx = 1;
	cons.gridwidth=3;
	cons.gridheight=2;
     	add(new TextField(20),cons);

     	cons.ipadx = 10;
        cons.ipady = 10;
        cons.gridx = 0;
        cons.gridy = 2;
	cons.gridwidth=1;
	cons.gridheight=2;
        add(new Label("Email ID:"),cons);

        cons.gridx = 1;
	cons.gridwidth=3;
	cons.gridheight=2;
        add(new TextField(20),cons);
	
	cons.ipadx = 10;
        cons.ipady = 10;
        cons.gridx = 0;
        cons.gridy = 4;
        cons.gridwidth = 1;
	cons.gridheight=2;
        Button b = new Button("Submit");
        add(b,cons);

      
       
    }
}
public class GridBag2{
    public static void main(String[] args)
    {
        MyFrame3 f1 = new MyFrame3();
    }
}