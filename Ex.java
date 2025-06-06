import java.awt.*;
import java.awt.event.*;
class AEvent1 implements AdapterListener
{
  Frame f1;
  Button b;
  TextField t1;
  AEvent1()
  {
    f1 =new Frame();
    b  =new Button("click");
    t1 =new TextField("Hero...");
    t1.setBounds(200,180,140,120);
    b.addActionListener(this);
    f1.addWindowListener(
				{
					public void WindowClosing(windowEvent we)
					{
						System.exit(0);
					}
				}
			)
    b.setBounds(200,180,140,120);
    f1.add(b);f1.add(t1);
    f1.setSize(400,500);
    f1.setVisible(true); 
  }
public void actionPerformed(ActionEvent e)
 {
   t1.setText("Welcome");
 }
public void windowActivated(WindowEvent we){System.out.println("Activated");}
public void windowClosed(WindowEvent we){System.out.println("Closed");}
public void windowClosing(WindowEvent we)
{
 System.exit(0);
}
public void windowDeactivated(WindowEvent we){System.out.println("Deactivated");}
public void windowDeiconified(WindowEvent we){System.out.println("Deiconified")}
public void windowIconified(WindowEvent we){System.out.println("Iconified");}
public void windowOpened(WindowEvent we){System.out.println("Opened");}
public static void main(String args[])
  {
    
    new AEvent1();
    
  }
}
