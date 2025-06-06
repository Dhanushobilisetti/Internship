import javax.swing.*;
class Swing
{
	
	JFrame f;
	JButton b;
	JTextField tf;
	Swing()
	{
		f=new JFrame();
		b=new JButton("click");
		f.add(b);
		b.setBounds(130,100,100,100);
		f.setSize(400,550);
		f.setVisible(true);
	
	}
}
class Main
{
public static void main(String args[])
{
	Swing s1=new Swing();
}
}

	