import java.awt.*;
import java.awt.event.*;
class HWmenu extends Frame implements ActionListener
{
    MenuBar mb;
    Menu file;
    MenuItem mi1,mi2,mi3;
    Label l;
    HWmenu()
    {
        setSize(600,600);
        setVisible(true);
        setLayout(new FlowLayout());

        mb=new MenuBar();
        setMenuBar(mb);

        file=new Menu("File");
        mb.add(file);

        mi1=new MenuItem("New");mi1.addActionListener(this);
        mi2=new MenuItem("Open");mi2.addActionListener(this);
        mi3=new MenuItem("Exit");mi3.addActionListener(this);

        file.add(mi1);
        file.add(mi2);
        file.add(mi3);

        l=new Label();
        add(l);

        //window closing property.
        this.addWindowListener(new WindowAdapter()
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
        if(e.getSource()==mi1)
        {
            //System.out.println("hello");
            //this.add(new Label("New File is Created!!"));----------->will also work!!!
            l.setText("New File is Created!!");
        }
        else if(e.getSource()==mi2)
        {
            l.setText("New File is Opened!!");
        }
        else if(e.getSource()==mi3)
        {
            System.exit(0);
        }
    }
    public static void main(String args[])
    {
        HWmenu hwm=new HWmenu();
    }
}