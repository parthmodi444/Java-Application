import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Delete extends JFrame
{
Container c;
JButton btnSave,btnBack;
JLabel lblRno;
JTextField txtRno;
Delete()
{
c=getContentPane();
c.setLayout(new FlowLayout());


lblRno=new JLabel("enter the roll no");
txtRno=new JTextField(20);


btnSave=new JButton("   Save\r\n ");


btnBack=new JButton("      Back      ");

c.add(lblRno);
c.add(txtRno);




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
if(txtRno.getText().length()<=0)
{
JOptionPane.showMessageDialog(new JDialog(),"rno cannot be empty");
}
else if((Integer.parseInt(txtRno.getText()))<0 || ((txtRno.getText()).isEmpty()))
{
JOptionPane.showMessageDialog(new JDialog(),"rno Cannot less than be zero");
}
else{
P2 p=new P2();
p.deleteEmployee(Integer.parseInt(txtRno.getText()));
}
}
catch(NumberFormatException e)
{
JOptionPane.showMessageDialog(new JDialog(),"issue"+"it should  not be string");

}
};


btnSave.addActionListener(a2);









setTitle("Delete");
setSize(300,300);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);

}

}
