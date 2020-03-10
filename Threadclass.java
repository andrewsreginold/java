package activity;
import java.awt.Color;

import javax.swing.*;
public class Threadclass extends Thread {

	JTextField jt;
	JLabel jl;
	JFrame jf;
	public void run()
	{
		buildgui();
	}
	
	void display()
	{
	for(int i=60;i>=0;i--)
	{
		try {
			Thread.sleep(1000);
			String s=Integer.toString(i);
			jt.setText("     "+s+"seconds to go..");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	JOptionPane.showMessageDialog(jf, "Times up!11");
	jt.setText("");
	jt.setEnabled(false);
	}
	
	public void buildgui()
	{
		jf=new JFrame("COUNTDOWN TIMER");
		JPanel jp=new JPanel();
		jl=new JLabel("");
		jt=new JTextField(15);
		jt.setEnabled(false);
		jt.setBackground(Color.black);
		jp.setBackground(Color.BLUE);
		jf.add(jp);
		jp.add(jt);
		jp.add(jl);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(300, 100);
		jf.setResizable(false);
		display();
		
	}
	public static void main (String []args)
	{
		Threadclass obj=new Threadclass();
		obj.start();
	}

}

