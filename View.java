import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class View extends JFrame
{
Container c;
JButton btnBack;

TextArea txtScene;
View()
{
c=getContentPane();
c.setLayout(new FlowLayout());





txtScene=new TextArea(10,25);

btnBack=new JButton("      Back      ");


c.add(txtScene);


c.add(btnBack);


P2 p=new P2();
String data=p.viewEmployee();
txtScene.setText(data);


ActionListener a1= (ae)  ->  {
MainFrame g=new MainFrame();
dispose();

};


btnBack.addActionListener(a1);


setTitle("View");
setSize(300,300);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);

}

}
