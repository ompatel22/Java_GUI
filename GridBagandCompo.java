import java.awt.*;
class GridBagandCompo extends Frame 
{
    Label l1,l2,l3;
    TextArea ta1,ta2;
    TextField tf1;
    Canvas c;
    Button b1,b2;
    GridBagandCompo()
    {
        setSize(400,400);
        setVisible(true);
        setLayout(new GridBagLayout());

        l1=new Label("Study of GBL",Label.CENTER);
        l2=new Label();
        l3=new Label();

        ta1=new TextArea(10,10);
        ta2=new TextArea(10,10);

        tf1=new TextField(10);

        c=new Canvas();
        c.setBackground(Color.BLUE);

        b1=new Button("cancel");
        b2=new Button("ok");

        GridBagConstraints gbc=new GridBagConstraints();
        gbc.fill=GridBagConstraints.BOTH;
        gbc.gridx=0;gbc.gridy=0;gbc.gridwidth=4;;add(l1,gbc);
        gbc.gridx=0;gbc.gridy=1;gbc.gridwidth=1;gbc.gridheight=2;add(ta1,gbc);
        gbc.gridx=1;gbc.gridy=1;gbc.gridwidth=2;gbc.gridheight=2;add(c,gbc);
        gbc.gridx=3;gbc.gridy=1;gbc.gridwidth=1;gbc.gridheight=1;add(ta2,gbc);
        gbc.gridx=3;gbc.gridy=2;add(tf1,gbc);
        gbc.gridx=0;gbc.gridy=3;add(l2,gbc);
        gbc.gridx=1;gbc.gridy=3;add(b1,gbc);
        gbc.gridx=2;gbc.gridy=3;add(b2,gbc);
        gbc.gridx=3;gbc.gridy=3;add(l3,gbc);

    }
    public static void main(String args[])
    {
        GridBagandCompo ex=new GridBagandCompo();
    }
}