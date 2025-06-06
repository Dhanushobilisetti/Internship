import java.awt.*;
import java.awt.event.*;
class AEvent21  extends WindowAdapter implements FocusListener
{ 
Frame f;
TextField t;
AEvent21()
{  
 f=new Frame();
 t=new TextField();
 t.setBounds(60,50,170,20);
 t.addFocusListener(this);
 f.add(t);
 f.setSize(300,300);
 f.setLayout(null);
 f.setVisible(true);
 }
 public void focusGained(FocusEvent fe)
{
t.setForeground(Color.RED);
System.out.println("focus gain");
}
public void focusLost(FocusEvent fe)
{
t.setBackground(Color.GREEN);
 f.setBackground(Color.PINK);
System.out.println("focus lost");
}
public static void main(String args[])
{
new AEvent21();
}
}
