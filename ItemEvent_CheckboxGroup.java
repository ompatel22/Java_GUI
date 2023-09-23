import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;

class ItemEvent_CheckboxGroup extends Frame implements ItemListener
{   
    CheckboxGroup cbg;
	Checkbox c1,c2,c3;
	int rs=0;
   ItemEvent_CheckboxGroup()
   {
     setSize(700,400);
	 setVisible(true);
	 setLayout(new FlowLayout());
	 
	 cbg = new CheckboxGroup();
	 c1 = new Checkbox("Rectangle",false);
	 c2 = new Checkbox("Circle");
	 
	 add(c1);
	 add(c2);
	 
	 c1.addItemListener(this);
	 c2.addItemListener(this);
	 
   }
   public void itemStateChanged(ItemEvent e)
   {
	 if(e.getSource()==c1)
	 {
		 rs=1; repaint();
	 }
	 if(e.getSource()==c2)
	 {
		 rs=2;repaint();
	 }
	  
		
   }
   public void paint(Graphics g)
   {
	   if(rs==1)
	   {
		   g.drawRect(50,50,50,50);
	       rs=0;
       }
	   if(rs==2)
	   {
		   g.drawOval(50,50,50,50);
	       rs=0;
       }
   }
   
   public static void main(String args[])
   {
	   ItemEvent_CheckboxGroup w = new ItemEvent_CheckboxGroup();
   }


}