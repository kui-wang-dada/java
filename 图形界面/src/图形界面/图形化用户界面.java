package ͼ�ν���;
import java.awt.*;
import javax.swing.*;
public class ͼ�λ��û����� extends JFrame  {
	JButton an1,an2,an3,an4,an5;
	public static void main(String[] args){
	
		ͼ�λ��û����� lx1=new ͼ�λ��û�����();
	}
	public ͼ�λ��û�����(){
		an1=new JButton("����");
		an2=new JButton("����");
		an3=new JButton("�Ϸ�");
		an4=new JButton("����");
		an5=new JButton("�в�");
		
		this.add(an1,BorderLayout.EAST);
		this.add(an2,BorderLayout.WEST);
		this.add(an3,BorderLayout.SOUTH);
		this.add(an4,BorderLayout.NORTH);
		this.add(an5,BorderLayout.CENTER);
		
		this.setTitle("�߽粼��BorderLayout");
		this.setSize(350,260);
		this.setLocation(100,260);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
