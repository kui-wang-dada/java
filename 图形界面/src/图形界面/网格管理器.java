package ͼ�ν���;
import java.awt.*;
import javax.swing.*;
public class ��������� extends JFrame{
	JButton an[]={null,null,null,null,null,null,null,null,null};
	int s=9;
	public static void main(String[] args){
		��������� lx1=new ���������();
	}
	public ���������(){
		an[0]=new JButton("��÷");
		an[1]=new JButton("����");
		an[2]=new JButton("��Ƭ");
		an[3]=new JButton("����");
		an[4]=new JButton("�ɿ���");
		an[5]=new JButton("����");
		an[6]=new JButton("����");
		an[7]=new JButton("���Ĺ�");
		an[8]=new JButton("����");
		
		this.setLayout(new GridLayout(3,3,15,15));
		for(int i=0;i<s;i++){
			this.add(an[i]);
		}
	
	
		this.setTitle("���񲼾�Gridlayout");
		this.setSize(380,320);
		this.setLocation(200,200);
		//this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}