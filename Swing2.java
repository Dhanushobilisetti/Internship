import javax.swing.*;
class Swing
{
	
	JFrame f;
	JButton b;
	JTextField tf;
	Swing()
	{
		f=new JFrame();
		tf=new JTextField("hi");
		tf.setBounds(150,500,300,400);
		b=new JButton("click");
		f.add(b);
		b.setBounds(130,150,100,40);
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

	