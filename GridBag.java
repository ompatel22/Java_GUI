import java.awt.*;

class MyFrame3 extends Frame{
    MyFrame3()
    {
       

        Panel panel = new Panel();
        panel.setLayout(new GridBagLayout());

        GridBagConstraints cons = new GridBagConstraints();
        cons.ipadx = 10;
        cons.ipady = 10;
        cons.gridx = 0;
        cons.gridy = 0;
        panel.add(new Label("Name:"),cons);
        cons.gridx = 1;
        panel.add(new TextField(20),cons);

        Panel spacer = new Panel();
        cons.gridy = 1;
        cons.gridx = 0;
        cons.gridwidth = 2;
        //cons.weighty = 1;
        panel.add(spacer , cons);
                
        
        cons.gridx = 0;
        cons.gridy = 2;
        cons.ipadx = 10;
        cons.ipady = 10;
        panel.add(new Label("Email ID:"),cons);
        cons.gridx = 1;
        panel.add(new TextField(20),cons);

        cons.gridx = 0;
        cons.gridy = 9;
        cons.gridwidth = 2;
        cons.ipadx = 10;
        cons.ipady = 10;
        Button b = new Button("Submit");
        panel.add(b,cons);

        add(panel);
        setVisible(true);
      

    }
}
public class GridBag{
    public static void main(String[] args)
    {
        MyFrame f1 = new MyFrame();
    }
}