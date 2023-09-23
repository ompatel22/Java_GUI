import java.awt.*;
class MyFrame extends Frame
{
	MyFrame()
	{
		setSize(600,600);
		setVisible(true);
		setTitle("frame example");
		setBackground(Color.YELLOW);
	
		
		Button b=new Button("Submit");
		Label l=new Label("Roll No:");
		TextField t=new TextField("write");
		TextArea a=new TextArea("lakho bc !!");
		
		add(b);
		add(l);
		add(t);
		add(a);
		//int x,int y,int w,int h
		b.setBounds(150,150,50,20);
		l.setBounds(100,130,50,20);
		t.setBounds(100,150,50,20); 
		a.setBounds(100,170,100,50);
	}
	public static void main(String args[])
	{
		MyFrame f=new MyFrame();
	}
}
