import java.awt.*;
import java.awt.event.*;
import java.util.Random;
class Demoo extends Frame implements ActionListener{
    int arr[];
    Random r;
    TextField t1,t2;
    Demoo()
    {
        r=new Random();
        arr=new int[100];
        for(int i=0;i<100;i++)
        {
            arr[i]=r.nextInt();
        }
        setSize(600,600);
        setVisible(true);
        t1=new TextField(15);t1.addActionListener(this);
        t2=new TextField(15);
        setLayout(new FlowLayout());
        add(t1);add(t2);
    }
    public void actionPerformed(ActionEvent e)
    {
        int n=Integer.parseInt(t1.getText());
        try{
            t2.setText(arr[n]+"");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            t2.setText("exppppppp");
            System.out.println("exp.");
        }
    }
    
    public static void main(String args[])
    {
       

            Demoo d1=new Demoo();
   
             
       System.out.println("end");
    }
}