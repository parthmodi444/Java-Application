import javax.swing.*;
import org.jfree.data.category.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import java.io.*;
import java.sql.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;
import java.util.*;

class Charts extends JFrame
{

Charts() throws Exception
{
DefaultCategoryDataset ds=new DefaultCategoryDataset();
try{

String data=null;
Configuration cfg=new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sfact=cfg.buildSessionFactory();
Session s=null;



s=sfact.openSession();

List<Student> b=new ArrayList<>();
b=s.createQuery("from Student").list();
for(Student m:b)
{
	ds.addValue(m.getM1(),m.getName(),"subj1");
	ds.addValue(m.getM2(),m.getName(),"Subj2");
	ds.addValue(m.getM3(),m.getName(),"Subj3");

}

s.close();

}catch(Exception e)
{
JOptionPane.showMessageDialog(new JDialog(),"issue"+e);

}



JFreeChart ch=ChartFactory.createBarChart("result","Prog .lang","score",ds,PlotOrientation.VERTICAL,true,false,false);
ChartPanel cp=new ChartPanel(ch);
setContentPane(cp);
setTitle(" exam result");
setSize(400,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);

}

}
