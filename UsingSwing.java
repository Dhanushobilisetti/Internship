
import javax.awt.*;
import java.awt.event.*;
class child implements ActionListener
{
	
	Frame f;
	Button b;
	TextField tf;
	child()
	{
		f=new Frame();
		f.setSize(400,550);
		f.setVisible(true);
		f.setLayout(null);
		tf=new TextField("hi");
		tf.setBounds(150,500,300,400);
		b=new Button("click");
		b.setBounds(130,150,100,40);
		f.add(b);
		b.addActonListener(this);
		f.add(tf);		
		
		f.setSize(400,550);
		f.setVisible(true);
		//f.windowListener(this);
	
	}
public void actionperformed(ActionEvent e)
{
	tf.setText("hello");
}



public static void main(String args[])
{
	new child();
}
}

	