import java.awt.*;
import java.awt.event.*;
class CompoDemo extends Frame implements ActionListener
{
    Scrollbar sb1,sb2;
    CheckboxGroup cbg;
    Checkbox cb1,cb2,cb3,cb4;
    Label l1,l2;
    Button b1;
    TextArea ta1,ta2;
    TextField tf;
    List l;
    CompoDemo()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(new GridLayout(5,2));

        tf=new TextField(15);

        ta1=new TextArea("",3,8,TextArea.SCROLLBARS_HORIZONTAL_ONLY);
        ta2=new TextArea(3,8);
        //ta1=new TextArea(8,15);
        l1=new Label();
         /*l2=new Label();
        Panel la=new Panel();
        la.add(l1);la.add(l2);*/

        l=new List(4,true);
        l.add("cs");
        l.add("dsa");
        l.add("pts");
        l.add("java");
        
        b1=new Button("Click here");b1.addActionListener(this);

        cbg=new CheckboxGroup();
        cb1=new Checkbox("Male",cbg,true);
        cb2=new Checkbox("Female",cbg,false);
        Panel rb=new Panel();rb.add(cb1);rb.add(cb2);
      
        cb3=new Checkbox();
        cb3.setLabel("Music");
        cb4=new Checkbox("Dance");
        Panel cb=new Panel();
        cb.add(cb3);cb.add(cb4);

        sb1=new Scrollbar();
        sb2=new Scrollbar(Scrollbar.HORIZONTAL,15,10,0,30);

        add(ta1);
        add(ta2);
        add(b1);
        add(l1);
        add(l);
        add(rb);
        add(cb);
        add(tf);
        add(sb1);
        add(sb2);
    }
    public void actionPerformed(ActionEvent e)
    {
        //ta2.setText(ta1.getText());
        //ta2.append("\nCopied!!");

        //l1.setText(l.getSelectedItems());------> we can not use for multiple selected items.
        //l1.setText(l.getSelectedItem());
        //l1.setAlignment(Label.CENTER);

        //l1.setText((cbg.getSelectedCheckbox().getLabel()));

        /*if(cb3.getState())
        l1.setText(cb3.getLabel());
        if(cb4.getState())
        l2.setText(cb4.getLabel());*/

       // l1.setText(tf.getSelectedText());


    }

    public static void main(String args[])
    {
        CompoDemo cd=new CompoDemo();
    }
}