package ͼ�ν���;
import java.awt.*;
import javax.swing.*;
public class jframe���� {
	public static void main(String[] args){
		JFrame aa=new JFrame();
		aa.setTitle("�û�����");
		JButton an1=new JButton("һ����ť");
		aa.setSize(350,180);
		aa.setLocation(100,260);
		aa.add(an1);
		aa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton an2=new JButton("������ť");
		aa.setSize(350,180);
		aa.setLocation(200,260);
		aa.add(an2);
		JButton an3=new JButton("һ����ť");
		aa.setSize(350,180);
		aa.setLocation(300,260);
		aa.add(an3);
		JButton an4=new JButton("һ����ť");
		aa.setSize(350,180);
		aa.setLocation(400,260);
		aa.add(an4);
		aa.setVisible(true);
	}
}
