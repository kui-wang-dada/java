package 餐饮系统;
import javax.imageio.*;

import zidingyi.MyFont;

import javax.swing.*;
import javax.swing.BorderFactory.*;

import moxing.Moxing;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class 登录 extends JDialog //implements ActionListener
{
	JLabel jl1,jl2,jl3;
	JTextField jname;
	JPasswordField jpasswd;
	JButton jlog,jcancle;
	Font f1;
	
	public static void main(String[] args)
	{
		登录 login=new 登录();
	}
	public 登录()
	{
		jl1=new JLabel("请输入用户名：");
		jl1.setBounds(60,190,150,30);
		jl1.setFont(MyFont.f0);
		this.add(jl1);
		
		jl2=new JLabel("(或员工号)");
		jl2.setForeground(Color.red);
		jl2.setFont(MyFont.f1);
		jl2.setBounds(100,210,100,30);
		this.add(jl2);
		
		jl3=new JLabel("请输入密码：");
		jl3.setBounds(60,240,150,30);
		jl3.setFont(MyFont.f0);
		this.add(jl3);
		
		jname=new JTextField(20);
		jname.setFocusable(true);
		jname.setBounds(180,190,120,30);
		jname.setFont(f1);
		this.add(jname);
		jname.setBorder(BorderFactory.createLoweredBevelBorder());
		
		jpasswd=new JPasswordField();
		jpasswd.setFocusable(true);
		jpasswd.setBounds(180,240,120,30);
		this.add(jpasswd);
		jpasswd.setBorder(BorderFactory.createLoweredBevelBorder());
		
		jlog=new JButton("确定");
		
		//jlog.addActionListener(this);
		jlog.setBounds(105,300,75,30);
		jlog.setFont(f1);
		
		jlog.setForeground (Color.blue);
		this.add(jlog);
		
		jcancle=new JButton("取消");
		//jcancle.addActionListener(this);
		jcancle.setBounds(215,300,75,30);
		jcancle.setFont(f1);
		jcancle.setForeground(Color.blue);
		this.add(jcancle);
		this.setLayout(null);
		BackImage bi=new BackImage();
		bi.setBounds(0,0,360,360);
		this.add(bi);
		this.setUndecorated(true);
		this.setSize(360,360);
		int width=getToolkit().getDefaultToolkit().getScreenSize().width;
		int height=getToolkit().getDefaultToolkit().getScreenSize().height;
		this.setLocation(width/2-200,height/2-200);
		this.setVisible(true);

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jlog)
		{
			String userName=this.jname.getText().trim();
			String passwd=new String(this.jpasswd.getPassword());
			Moxing um=new Moxing();
			String zhiwei=um.checkUser(userName,passwd);
			if(zhiwei.equals("经理")||zhiwei.equals("管理员")||zhiwei.equals("主管"))
			{
				new Caozuo();
				this.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(this,"用户名或密码错误");
			}
					
		}
		else if(e.getSource()==jcancle)
		{
			this.dispose();
		}
	}
	

	
	
}
class BackImage extends JPanel
{
	Image im;
	public BackImage()
	{
		try
		{
			im=ImageIO.read(new File("image/login.gif"));
		}catch(Exception e2){}
	}
	public void paint(Graphics g)
	{
		g.drawImage(im, 0, 0, 360, 360, this);
	}
}
