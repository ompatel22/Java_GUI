import java.awt.*;
class MyFramef extends Frame
{
  MyFramef()
  {
   super("GridBagLayout Demo");
   setSize(600,400);
   setVisible(true);
   GridBagLayout grid = new GridBagLayout();  
   GridBagConstraints gbc = new GridBagConstraints();  
   setLayout(grid);
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridx = 0;  
    gbc.gridy = 0;  
    this.add(new Button("Button One"), gbc);  
    gbc.gridx = 1;  
    gbc.gridy = 0;  
    this.add(new Button("Button two"), gbc);  
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.ipady = 20; //Specifies the internal padding: how much to add to the size of the component
    gbc.gridx = 0;  
    gbc.gridy = 1;  
    this.add(new Button("Button Three"), gbc);  
    gbc.gridx = 1;  
    gbc.gridy = 1;  
    this.add(new Button("Button Four"), gbc);  
    gbc.gridx = 0;  
    gbc.gridy = 2;  
    gbc.gridwidth = 2;  
    this.add(new Button("Button Five"), gbc);  

  }
}
class GridBagLayoutDemof
{
   public static void main(String args[])
   {
     MyFramef f = new MyFramef();
   }
} 