import java.awt.*;
import java.awt.event.*;

class ItemEvent_Checkbox extends Frame implements ItemListener
{
	Checkbox c1,c2,c3;
	Canvas c;
   ItemEvent_Checkbox()
   {
     setSize(700,400);
	 setVisible(true);
	 setLayout(new FlowLayout());
	 
	 c1 = new Checkbox("Red");
	 c2 = new Checkbox("Green");
	 c3 = new Checkbox("Blue");
	 c = new Canvas();
	 add(c);
	 c.setSize(100,100);
	 c.setVisible(true);
	 c.setBackground(Color.BLACK);
	 
	 add(c1);
	 add(c2);
	 add(c3);
	 
	 
	 c1.addItemListener(this);
	 c2.addItemListener(this);
	 c3.addItemListener(this);
   }
   public void itemStateChanged(ItemEvent e)
   {
	int redvalue = c1.getState()?255:0;
	int greenvalue = c2.getState()?255:0;
	int bluevalue = c3.getState()?255:0; 
    
	Color selectedColor = new Color(redvalue,greenvalue,bluevalue);
	c.setBackground(selectedColor);
	
   }
   public static void main(String args[])
   {
	   ItemEvent_Checkbox w = new ItemEvent_Checkbox();
   }


}