import javax.swing.*;
import java.awt.event.*;
class TextCount extends JFrame implements ActionListener
{
	JTextField t;
	JFrame f;
	JLabel l1,l2;
	JButton b;
	TextCount()
	{
		f = new JFrame();
		t = new JTextField();
		t.setBounds(100,100,70,30);
		l1 = new JLabel();
		l1.setBounds(100,200,150,30);
		l2 = new JLabel();
		l2.setBounds(100,250,150,30);

		b = new JButton("Words Count");
		b.setBounds(100,300,150,30);
		b.addActionListener(this);
		f.add(l1);f.add(l2);
		f.add(b);
		f.add(t);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s =t.getText();
		String c[] = s.split("\\s");
		l1.setText("words count="+c.length);
		l2.setText("characters count="+s.length());
		int vc=0,cc=0,n=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' 				|| s.charAt(i) == 'o' || s.charAt(i) == 'u')
			{vc++;}
			else if(s.charAt(i)== '0' || s.charAt(i)== '1' || s.charAt(i)== '2' 				||s.charAt