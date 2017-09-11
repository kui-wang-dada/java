package 学生管理系统;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
import javax.swing.table.*;


public class xsglxt  extends JFrame implements ActionListener,MouseListener{
	JPanel mb1,mb2;
	JLabel bq1;
	JTextField wbk1;
	JButton an1,an2,an3,an4;
	JTable bg1;
	JScrollPane gd1;
	Xsxx xsxx2;
	
	Vector ziduan,jilu;
	PreparedStatement ps=null;
	Connection ct=null;
	ResultSet rs=null;
	public static void main(String[] args){
		
		try{
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		xsglxt xs=new xsglxt();
	}
	public xsglxt(){
		mb1=new JPanel();
		bq1=new JLabel("请输入姓名");
		wbk1=new JTextField(10);
		an1=new JButton("查询");
		an1.addActionListener(this);
		an1.setActionCommand("chaxun");
		mb1.add(bq1);mb1.add(wbk1);mb1.add(an1);
		
		mb2=new JPanel();
		an2=new JButton("添加");
		an2.addActionListener(this);
		an2.setActionCommand("tianjia");
		an3=new JButton("修改");
		an3.addActionListener(this);
		an3.setActionCommand("xiugai");
		an4=new JButton("删除");
		an4.addActionListener(this);
		an4.setActionCommand("shanchu");
		mb2.add(an2);mb2.add(an3);mb2.add(an4);
		
		ziduan=new Vector();
		ziduan.add("学号");
		ziduan.add("姓名");
		ziduan.add("性别");
		ziduan.add("年龄");
		ziduan.add("籍贯");
		ziduan.add("院系");
		
		jilu=new Vector();
		
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			ct=DriverManager.getConnection("jdbc:odbc:sql server","sa","395487");
			ps=ct.prepareStatement("select * from xsxx");
			rs=ps.executeQuery();
			while(rs.next()){
				Vector hang=new Vector();
				hang.add(rs.getString(1));
				hang.add(rs.getString(2));
				hang.add(rs.getString(3));
				hang.add(rs.getInt(4));
				hang.add(rs.getString(5));
				hang.add(rs.getString(6));
				jilu.add(hang);

			}
		}catch(Exception e){}
		finally{
			try{
				if(ps!=null){
					ps.close();
				}
				if(ct!=null){
					ct.close();
				}
				if(rs!=null){
					rs.close();
				}
			}catch(Exception e2){}
		}
		
		xsxx2=new Xsxx();
		bg1=new JTable(jilu,ziduan);
		bg1.addMouseListener(this);
		gd1=new JScrollPane(bg1);
		
		this.add(gd1);
		this.add(mb1,"North");
		this.add(mb2,"South");
		
		this.setTitle("学生管理系统");
		this.setSize(500,400);
		this.setLocation(201,181);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void mouseClicked(MouseEvent e){
		if(e.getClickCount()==2){
			int id=bg1.getSelectedRow();
			Vector neirong=(Vector) this.jilu.get(id);
			new Xiangxixinxi(this,"详细信息",true,neirong);
		}
	}
	
		public void actionPerformed(ActionEvent e)
		{
			if(e.getActionCommand().equals("chaxun"))
			{
				String xingming=this.wbk1.getText().trim();
				String sql="select * from xsxx where xingming='"+xingming+"'";
				xsxx2=new Xsxx(sql);
				bg1.setModel((TableModel) xsxx2);
			}else if(e.getActionCommand().equals("tianjia"))
			{
				new Tianjia(this,"添加学生信息",true);
				xsxx2=new Xsxx();
				bg1.setModel(xsxx2);
			}else if(e.getActionCommand().equals("xiugai"))
			{
				int ii=this.bg1.getSelectedRow();
				if(ii==-1)
				{
					JOptionPane.showMessageDialog(this,"请选中要修改的行");
					return;
				}
				new Xiugai(this,"修改学生信息",true,xsxx2,ii);
				
				xsxx2=new Xsxx();
				bg1.setModel(xsxx2);
			}else if(e.getActionCommand().equals("shanchu"))
			{
				int ii=this.bg1.getSelectedRow();
				if(ii==-1)
				{
					JOptionPane.showMessageDialog(this,"请选中要删除的行");
					return;
				}
				String st=(String)xsxx2.getValueAt(ii, 0);
				PreparedStatement ps=null;
				Connection ct=null;
				ResultSet rs=null;
				
				try
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					ct=DriverManager.getConnection("jdbc:odbc:sql server","sa","395487");
					ps=ct.prepareStatement("delete from xsxx where xuehao=?");
					ps.setString(1, st);
					ps.executeUpdate();
				}catch(Exception e2){}
				finally
				{
					try
					{
						if(rs!=null)
						{
							rs.close();
						}
						if(ps!=null)
						{
							ps.close();
						}
						if(ct!=null)
						{
							ct.close();
						}
					}catch(Exception e3){}
				}
				xsxx2=new Xsxx();
				bg1.setModel(xsxx2);
			}
		}
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO 自动生成的方法存根
			
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO 自动生成的方法存根
			
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO 自动生成的方法存根
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO 自动生成的方法存根
			
		}
		
}
