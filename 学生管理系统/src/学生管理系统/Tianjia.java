package 学生管理系统;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Tianjia extends JDialog implements ActionListener {
	JPanel mb1,mb2,mb3,mb4;
	JLabel bq1,bq2,bq3,bq4,bq5,bq6;
	JTextField wbk1,wbk2,wbk3,wbk4,wbk5,wbk6;
	JButton an1,an2;
	
	public Tianjia(Frame fck,String ckm,Boolean msck)
	{
		super(fck,ckm,msck);
		mb1=new JPanel();
		bq1=new JLabel("     学号     ");
		bq2=new JLabel("     姓名     ");
		bq3=new JLabel("     性别     ");
		bq4=new JLabel("     年龄     ");
		bq5=new JLabel("     籍贯     ");
		bq6=new JLabel("     院系     ");
		mb1.setLayout(new GridLayout(6,1));
		mb1.add(bq1);mb1.add(bq2);mb1.add(bq3);
		mb1.add(bq4);mb1.add(bq5);mb1.add(bq6);
		
		mb2=new JPanel();
		wbk1=new JTextField(5);
		wbk2=new JTextField(5);
		wbk3=new JTextField(5);
		wbk4=new JTextField(5);
		wbk5=new JTextField(5);
		wbk6=new JTextField(5);
		mb2.setLayout(new GridLayout(6,1));
		mb2.add(wbk1);mb2.add(wbk2);mb2.add(wbk3);
		mb2.add(wbk4);mb2.add(wbk5);mb2.add(wbk6);
		
		mb3=new JPanel();
		an1=new JButton("添加");
		an1.addActionListener(this);
		an1.setActionCommand("tianjia2");
		an2=new JButton("取消");
		an2.addActionListener(this);
		an2.setActionCommand("quxiao");
		mb3.add(an1);mb3.add(an2);
		
		mb4=new JPanel();
		this.add(mb1,BorderLayout.WEST);
		this.add(mb2);
		this.add(mb3,BorderLayout.SOUTH);
		this.add(mb4,BorderLayout.EAST);
		
		
		this.setLocation(400,280);
		this.setSize(500,400);
		this.setResizable(false);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("tianjia2"))
		{
			PreparedStatement ps=null;
			Connection ct=null;
			ResultSet rs=null;
			Statement sm=null;
			
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				ct=DriverManager.getConnection("jdbc:odbc:sql server","sa","395487");
				ps=ct.prepareStatement("insert into xsxx values(?,?,?,?,?,?)");
				ps.setString(1, wbk1.getText());
				ps.setString(2, wbk2.getText());
				ps.setString(3, wbk3.getText());
				ps.setString(4, wbk4.getText());
				ps.setString(5, wbk5.getText());
				ps.setString(6, wbk6.getText());
				ps.executeUpdate();
				
				this.dispose();
			}catch(Exception e2){}
			finally
			{
				try
				{
					if(ps!=null)
					{
						ps.close();
					}
					if(ct!=null)
					{
						ct.close();
					}
					if(rs!=null)
					{
						rs.close();
					}
				}catch(Exception e3){}
			}
		}
		else if(e.getActionCommand().equals("quxiao"))
		{
			this.dispose();
		}
	}
}














