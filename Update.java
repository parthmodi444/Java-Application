import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Update extends JFrame
{
Container c;
JButton btnSave,btnBack;
JLabel lblRno,lblName,lblM1,lblM2,lblM3;
JTextField txtRno,txtName,txtM1,txtM2,txtM3;
Update()
{
c=getContentPane();
c.setLayout(new FlowLayout());


lblRno=new JLabel("enter the roll no");
txtRno=new JTextField(20);

lblName=new JLabel("enter the name");
txtName=new JTextField(20);



lblM1=new JLabel("enter the sub marks1");
txtM1=new JTextField(20);




lblM2=new JLabel("enter the sub marks2");
txtM2=new JTextField(20);


lblM3=new JLabel("enter the sub marks3");
txtM3=new JTextField(20);


btnSave=new JButton("   Save\r\n ");


btnBack=new JButton("      Back      ");

c.add(lblRno);
c.add(txtRno);

c.add(lblName);
c.add(txtName);

c.add(lblM1);
c.add(txtM1);


c.add(lblM2);
c.add(txtM2);


c.add(lblM3);
c.add(txtM3);


c.add(btnSave);
c.add(btnBack);



ActionListener a1= (ae)  ->  {
MainFrame g=new MainFrame();
dispose();

};


btnBack.addActionListener(a1);



ActionListener a2= (ae)  ->  {
try
{
String r=txtName.getText();
for(int i=0;i<r.length();i++)
{
if(Character.isLetter(r.charAt(i)))
{

}
else
{
throw new ArithmeticException("it should be String");
}
}
if(txtRno.getText().length()<=0)
{

JOptionPane.showMessageDialog(new JDialog(),"rno cannot be empty");
}
else if((Integer.parseInt(txtRno.getText()))<0 || ((txtRno.getText()).isEmpty()))
{
JOptionPane.showMessageDialog(new JDialog(),"rno Cannot less than be zero");
}
else if((txtName.getText().length())<2 || ((txtName.getText()).isEmpty()))
{
JOptionPane.showMessageDialog(new JDialog(),"length of name must be greater than 2");
}
else if(txtM1.getText().length()<=0)
{
JOptionPane.showMessageDialog(new JDialog(),"marks cannot be empty");
}
else if((Double.parseDouble(txtM1.getText()))<0 || (Double.parseDouble(txtM1.getText()))>100 || (txtM1.getText()).isEmpty() )
{
JOptionPane.showMessageDialog(new JDialog(),"marks should be between 0 to 100");

}
else if(txtM2.getText().length()<=0)
{

JOptionPane.showMessageDialog(new JDialog(),"marks cannot be empty");
}
else if((Double.parseDouble(txtM2.getText()))<0 || (Double.parseDouble(txtM2.getText()))>100 ||  (txtM2.getText()).isEmpty())
{
JOptionPane.showMessageDialog(new JDialog(),"marks should be between 0 to 100");

}
else if(txtM3.getText().length()<=0)
{

JOptionPane.showMessageDialog(new JDialog(),"marks cannot be empty");
}
else if((Double.parseDouble(txtM3.getText()))<0 || (Double.parseDouble(txtM3.getText()))>100 || (txtM2.getText()).isEmpty())
{
JOptionPane.showMessageDialog(new JDialog(),"marks should be between 0 to 100");

}
else
{

P2 g=new P2();
g.UpdateEmployee((Integer.parseInt(txtRno.getText())),txtName.getText(),Double.parseDouble(txtM1.getText()),Double.parseDouble(txtM2.getText()),Double.parseDouble(txtM3.getText()));


}

}
catch(NumberFormatException e)
{
JOptionPane.showMessageDialog(new JDialog()," Sorry "+"only integers accepted");
}
catch(ArithmeticException e)
{
JOptionPane.showMessageDialog(new JDialog()," its wrong"+e);
}

};


btnSave.addActionListener(a2);


setTitle("Update");
setSize(300,300);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);

}

}
