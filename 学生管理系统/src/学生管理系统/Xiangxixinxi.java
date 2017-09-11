package 学生管理系统;
import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.util.*;
public class Xiangxixinxi extends JDialog{
	JLabel xuehao,xingming,xingbie,nianling,jiguan,yuanxi;
	JTextField xh,xm,xb,nl,jg,yx;
	JPanel jp1;
	
	public Xiangxixinxi(Frame mouseAdapter,String mck,boolean bck,Vector neirong){
		super(mouseAdapter,mck,bck);
		xuehao=new JLabel("学号");
		xingming=new JLabel("姓名");
		xingbie=new JLabel("性别");
		nianling=new JLabel("年龄");
		jiguan=new JLabel("籍贯");
		yuanxi=new JLabel("院系");
		
		xh=new JTextField(10);
		xh.setText(neirong.get(0).toString());
		xm=new JTextField(10);
		xm.setText(neirong.get(1).toString());
		xb=new JTextField(10);
		xb.setText(neirong.get(2).toString());
		nl=new JTextField(10);
		nl.setText(neirong.get(3).toString());
		jg=new JTextField(10);
		jg.setText(neirong.get(4).toString());
		yx=new JTextField(10);
		yx.setText(neirong.get(5).toString());
		
		jp1=new JPanel();
		jp1.setLayout(new GridLayout(4,3));
		jp1.add(xuehao);jp1.add(xh);jp1.add(xingming);jp1.add(xm);
		jp1.add(xingbie);jp1.add(xb);jp1.add(nianling);jp1.add(nl);
		jp1.add(jiguan);jp1.add(jg);jp1.add(yuanxi);jp1.add(yx);
		this.add(jp1);
		
		this.setLocation(400,300);
		this.setTitle("详细信息");
		this.setSize(400,300);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
