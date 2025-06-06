import javax.swing.*;
class Swing
{
	JFrame a;
	Swing(JFrame a)
	{
		JFrame a=new JFrame();
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
		JFrame a=new JFrame();
		Swing s=new Swing(a);
	}
}
		