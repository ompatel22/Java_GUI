import java.awt.*;
import java.awt.event.*;

class Demogbc extends Frame
{
    Demogbc()
    {
        setSize(600,600);
        setVisible(true);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();

        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("4");
        Button b5=new Button("5");
        Button b6=new Button("6");
        Label l1=new Label("hello",Label.CENTER);

        gbc.insets=new Insets(0,0,10,10);
        //gbc.weightx=0.05;
        //gbc.weighty=0.05;
        //gbc.ipady=20;
        //gbc.ipadx=20;

        gbc.gridx=0;gbc.gridy=0;add(b1,gbc);
        gbc.gridx=1;gbc.gridy=0;add(b2,gbc);
        gbc.gridx=2;gbc.gridy=0;add(b3,gbc);
        gbc.gridx=0;gbc.gridy=1;add(b4,gbc);
        gbc.gridx=1;gbc.gridy=1;gbc.gridwidth=2;/*gbc.fill=GridBagConstraints.HORIZONTAL;*/add(b5,gbc);
        gbc.gridx=0;gbc.gridy=2;gbc.gridwidth=0;/*gbc.fill=GridBagConstraints.NONE;*/add(b6,gbc);//MOST MOST MOST IMP.
        gbc.gridx=1;gbc.gridy=2;add(l1,gbc);
    }   
    public static void main(String args[])
    {
        Demogbc d=new Demogbc();
    } 

}