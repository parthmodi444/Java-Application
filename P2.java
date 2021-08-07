import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;
import javax.swing.*;
import java.util.*;
class P2
{
public static void addEmployee(int rno,String name,double m1,double m2,double m3)
{
Configuration cfg=new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sfact=cfg.buildSessionFactory();
Session s=null;
Transaction t=null;

try{
s=sfact.openSession();

t=s.beginTransaction();
Console c=System.console();
Student b=new Student(rno,name,m1,m2,m3);
s.save(b);
t.commit();
JOptionPane.showMessageDialog(new JDialog(),"record inserted");
s.close();
}catch(Exception e)
{
JOptionPane.showMessageDialog(new JDialog(),"issue"+e);
t.rollback();
}

}

public static String  viewEmployee()
{
String data=null;
Configuration cfg=new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sfact=cfg.buildSessionFactory();
Session s=null;


try{
s=sfact.openSession();

List<Student> b=new ArrayList<>();
b=s.createQuery("from Student").list();
for(Student m:b)
{
data=data+"rollno=  "+m.getRno()+" name= "+m.getName()+"marks1=  "+m.getM1()+" marks2=  "+m.getM2()+"marks3= "+m.getM3() +" \n" ;
}
s.close();

}catch(Exception e)
{
JOptionPane.showMessageDialog(new JDialog(),"issue"+e);

}
return data;

}

public static void UpdateEmployee(int rno,String name,double m1,double m2,double m3)
{
Configuration cfg=new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sfact=cfg.buildSessionFactory();
Session s=null;
Transaction t=null;

try{
s=sfact.openSession();

t=s.beginTransaction();
Console c=System.console();
Student b=(Student)s.get(Student.class,rno);
if(b!=null)
{
b.setName(name);
b.setM1(m1);
b.setM2(m2);
b.setM3(m3);

s.save(b);

t.commit();
JOptionPane.showMessageDialog(new JDialog(),"record updated");
s.close();
}
else
{
JOptionPane.showMessageDialog(new JDialog(),"record doesnot exists");
}
}catch(Exception e)
{
JOptionPane.showMessageDialog(new JDialog(),"issue"+e);
t.rollback();
}

}

public static   void deleteEmployee(int rno)
{
Configuration cfg=new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sfact=cfg.buildSessionFactory();
Session s=null;
Transaction t=null;

try{
s=sfact.openSession();

t=s.beginTransaction();
Console c=System.console();
Student b=(Student)s.get(Student.class,rno);
if(b!=null)
{

s.delete(b);
t.commit();
s.close();
JOptionPane.showMessageDialog(new JDialog(),"record deleted");
}
else
{
JOptionPane.showMessageDialog(new JDialog(),"record doesnot exists");
}
}catch(Exception e)
{
JOptionPane.showMessageDialog(new JDialog(),"issue"+e);
t.rollback();
}





}






}