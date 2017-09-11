package ≤Õ“˚œµÕ≥;
import java.awt.*;
import javax.swing.*;
public class Zhujiemian extends JWindow implements Runnable
{
	JProgressBar jpb;
	JLabel jl1;
	int width,height;
	
	public static void main(String[] args)
	{
		Zhujiemian zhujiemian=new Zhujiemian();
		Thread t=new Thread(zhujiemian);
		t.start();
	}
	public Zhujiemian()
	{
		jl1=new JLabel(new ImageIcon("image/index.gif"));
		
		jpb=new JProgressBar();
		jpb.setStringPainted(true);
		jpb.setIndeterminate(false);
		jpb.setBorderPainted(false);
		jpb.setBackground(Color.darkGray);
		
		this.add(jl1,BorderLayout.NORTH);
		this.add(jpb,BorderLayout.SOUTH);
		
		this.setSize(400,263);
		width=Toolkit.getDefaultToolkit().getScreenSize().width;
		height=Toolkit.getDefaultToolkit().getScreenSize().height;
		this.setLocation(width/2-200,height/2-150);
		this.setVisible(true);
	}
	public void run()
	{
		int[] progressValue={0,2,10,18,34,52,71,83,95,97,100};
		for(int i=0;i<progressValue.length;i++)
		{
			try
			{
				Thread.sleep(1000);
			}catch(Exception e){}
			jpb.setValue(progressValue[i]);
		}
		new µ«¬º();
		this.dispose();
	}
}
