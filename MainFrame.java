import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MainFrame extends JFrame
{
Container c;
JButton btnAdd,btnView,btnUpdate,btnDelete,btnCharts;
MainFrame() 
{
try
{
c=getContentPane();
c.setLayout(new FlowLayout());
btnAdd=new JButton("      ADD      ");
btnView=new JButton("      View      ");
btnUpdate=new JButton("      Update      ");
btnDelete=new JButton("      Delete      ");
btnCharts=new JButton("        Charts       ");


c.add(btnAdd);
c.add(btnView);
c.add(btnUpdate);
c.add(btnDelete);
c.add(btnCharts);



ActionListener a1= (ae ) ->
{

AddFrame a=new AddFrame();
dispose();

};


btnAdd.addActionListener(a1);

ActionListener a2= (ae ) ->
{

Update a=new Update();
dispose();

};

btnUpdate.addActionListener(a2);



ActionListener a3= (ae ) ->
{

Delete a=new Delete();
dispose();

};

btnDelete.addActionListener(a3);



ActionListener a4= (ae ) ->
{
View a=new View();
dispose();

};
btnView.addActionListener(a4);




ActionListener a5= (ae ) ->
{
try
{
Charts a=new Charts();	
}
catch(Exception e)
{

}
};
btnCharts.addActionListener(a5);




setTitle("S.M.S");
setSize(300,300);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
catch(Exception e)
{
System.out.println("issue"+e);
}
}

}
