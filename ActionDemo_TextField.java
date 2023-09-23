import java.awt.*;
import java.awt.event.*;

class ActionDemo_TextField extends Frame implements ActionListener
{  TextArea ta;
   TextField tf;
    
    ActionDemo_TextField()
	{  
	  setSize(600,600);
	  setVisible(true);
	  setLayout(new FlowLayout());
	  ta = new TextArea("chat karo",20,60);
	  ta.setEditable(false);
	  tf = new TextField(60);
	  
	  add(ta);
	  add(tf);
	  
	  
	 tf.addActionListener(this);
	    
	}
	public void actionPerformed(ActionEvent e)
	{   
	     ta.append("\n"+tf.getText());
		 tf.setText("");
		 
	 
	}
	public static void main(String args[])
	{
		ActionDemo_TextField d1 = new ActionDemo_TextField();
	}


}