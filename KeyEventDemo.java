import java.awt.event.*;
import java.awt.*;
class KeyEventDemo extends Frame implements KeyListener
{
    Label l1;
    TextArea ta;
    KeyEventDemo()
    {
        setSize(300,300);
        setVisible(true);
        setLayout(new FlowLayout());
        addKeyListener(this);
        l1=new Label();
        // ta=new TextArea(5,10);
        // add(ta);
        add(l1);

    }
    public void keyTyped(KeyEvent e)
    {
       /* if(e.getKeyChar()=='o' || e.getKeyChar()=='O')--->will work
        {
            setBackground(Color.CYAN);

        }*/
        /*if(e.getKeyCode()==KeyEvent.VK_1)---------->will not work.
        {
            setBackground(Color.CYAN);
        }*/

    }
    public void keyPressed(KeyEvent e)
    {
        /*if(e.getKeyCode()==KeyEvent.VK_O)
        {
            setBackground(Color.CYAN);
        }*/
        
        if(e.getKeyCode()==KeyEvent.VK_A)
        {
            setBackground(Color.RED);
            l1.setText(""+KeyEvent.VK_A);
        }
    }
    public void keyReleased(KeyEvent e)
    {
        if(e.getKeyChar()=='o' || e.getKeyChar()=='O')
        {
            setBackground(Color.CYAN);

        }
        else if(e.getKeyCode()==KeyEvent.VK_2)
        {
            setBackground(Color.BLUE);
        }
    }
    public static void main (String args[])
    {
        KeyEventDemo ed=new KeyEventDemo();
    }
}