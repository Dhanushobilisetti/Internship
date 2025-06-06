import javax.swing.*;
class SwingExample extends JFrame
{
	SwingExample()
	{
		JFrame f=new JFrame();
		JButton b=new JButton("click");
		b.setBounds(130,100,100,40);
		f.add(b);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}
class Main
{
	public static void main(String args[])
	{
		new SwingExample();
	}
}
 	
