import java.awt.*;

class MyFrame4 extends Frame
{
	MyFrame4()
	{
		//creating the frame
		setVisible(true);
		setTitle("Registration Form");
		setSize(700,700);

		//creating & adding the panel inside the frame & setting the layout as GridBag
		Panel reg=new Panel();
		reg.setLayout(new GridBagLayout());
		add(reg);
		
		//creating other panels for radio buttons & checkboxes & setting the layout as flowlayout.(but if we do not set then bydefault->flowleyout)
		Panel pan_for_rb=new Panel();
		pan_for_rb.setLayout(new FlowLayout()); //(not req.)

		//creating all the labels
		Label Name=new Label("Name");
		Label Email=new Label("Email");
		Label Gender=new Label("Gender");
		Label Address=new Label("Address");
		Label Education=new Label("Education");
			
		//creating the fields
		TextField namet=new TextField(20);
		TextField emailt=new TextField(20);
	
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox cb1=new Checkbox("male",cbg,false);
		Checkbox cb2=new Checkbox("female",cbg,false);
		pan_for_rb.add(cb1);
		pan_for_rb.add(cb2);	

		TextArea addr=new TextArea(8,20);
		
		Choice edu=new Choice();
		edu.add("Engineering");
		edu.add("Medical");
		edu.add("Arts");
		edu.add("Commarce");
		
		//creating GBC object.
		GridBagConstraints gbc=new GridBagConstraints();
		
		//Insets(top,left,bottom,right)	 && anchor	
		Insets in=new Insets(10,0,0,0);
		gbc.insets=in;
		gbc.anchor=GridBagConstraints.FIRST_LINE_START;

		//oth column & all the raws
		gbc.gridx=0 ; gbc.gridy=0 ; reg.add(new Label("Registration Form"),gbc);
		gbc.gridx=0 ; gbc.gridy=1 ; reg.add(Name,gbc);
		gbc.gridx=0 ; gbc.gridy=2 ; reg.add(Email,gbc);
		gbc.gridx=0 ; gbc.gridy=3 ; reg.add(Gender,gbc);
		gbc.gridx=0 ; gbc.gridy=4 ; reg.add(Address,gbc);
		gbc.gridx=0 ; gbc.gridy=5 ; reg.add(Education,gbc);
	
		//1th column & all the raws
		gbc.gridx=1 ; gbc.gridy=1 ; reg.add(namet,gbc);
		gbc.gridx=1 ; gbc.gridy=2 ; reg.add(emailt,gbc);
		gbc.gridx=1 ; gbc.gridy=3 ; reg.add(pan_for_rb,gbc);
		gbc.gridx=1 ; gbc.gridy=4 ; reg.add(addr,gbc);
		gbc.gridx=1 ; gbc.gridy=5 ; reg.add(edu,gbc);
	
		//at the end sumbit button in oth column & lats raw with width of 2 & anchor of CENTER.
		Button b=new Button("submit");
		gbc.anchor=GridBagConstraints.CENTER;
		gbc.gridx=0; gbc.gridy=6; gbc.gridwidth=2; reg.add(b,gbc);
		
	}
}
public class Reg
{
	public static void main(String args[])
	{
		MyFrame4 f=new MyFrame4();
	}
}
