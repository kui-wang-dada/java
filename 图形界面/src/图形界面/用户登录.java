package ͼ�ν���;
import java.awt.*;

import javax.swing.*;
public class �û���¼ extends JFrame {
	JButton an1,an2,an3,an4;
	JPanel mb1,mb2,mb3,mb4;
	JTabbedPane xxk;
	JLabel bq1,bq2,bq3,bq4,bq5;
	JTextField wbk;
	JPasswordField mmk;
	JCheckBox fxk1,fxk2;
	public static void main(String[] args){
		�û���¼ lx1=new �û���¼();
	}
	public �û���¼(){
		an1=new JButton("��¼");
		an2=new JButton("ȡ��");
		an3=new JButton("��");
		an4=new JButton("�������");
		mb1=new JPanel();
		mb2=new JPanel();
		mb3=new JPanel();
		mb4=new JPanel();
		
		bq1=new JLabel("QQ����",JLabel.CENTER);
		bq2=new JLabel("QQ����",JLabel.CENTER);
		bq3=new JLabel("��������",JLabel.CENTER);
		bq3.setFont(new Font("����",Font.PLAIN,16));
		bq3.setForeground(Color.BLUE);
		bq4=new JLabel("<html><a href='www.qq.com'>�������뱣��</a>");
		bq4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bq5=new JLabel("QQ");
		
		wbk=new JTextField();
		mmk=new JPasswordField();
		fxk1=new JCheckBox("�����¼");
		fxk2=new JCheckBox("��ס����");
		
		xxk=new JTabbedPane();
		mb2.setBackground(Color.BLUE);
		mb3.setBackground(Color.GREEN);
		xxk.add("��ͨ�û�",mb1);xxk.add("QQ��Ա",mb2);xxk.add("����Ա",mb3);
		
		mb1.setLayout(new GridLayout(3,3));
		
		mb4.add(an1);mb4.add(an2);mb4.add(an3);
		mb1.add(bq1);mb1.add(wbk);mb1.add(an4);mb1.add(bq2);mb1.add(mmk);
		mb1.add(bq3);mb1.add(fxk1);mb1.add(fxk2);mb1.add(bq4);

		this.add(bq5,BorderLayout.NORTH);
		this.add(xxk,BorderLayout.CENTER);
		this.add(mb4,BorderLayout.SOUTH);
		
		this.setTitle("�û���¼");
		this.setSize(340,270);
		this.setLocation(500,500);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
