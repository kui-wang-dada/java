package ͼ�ν���;
import java.awt.*;
import javax.swing.*;
public class ��ʽ������ extends JFrame{
	JButton[] an={null,null,null,null,null,null,null,null,null};
	public static void main(String[] args){
		��ʽ������ lx=new ��ʽ������();
	}
	public ��ʽ������(){
		an[0]=new JButton("��÷");
		an[1]=new JButton("����");
		an[2]=new JButton("��Ƭ");
		an[3]=new JButton("����");
		an[4]=new JButton("�ɿ���");
		an[5]=new JButton("����");
		an[6]=new JButton("����");
		an[7]=new JButton("���Ĺ�");
		an[8]=new JButton("����");
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.add(an[0]);
		this.add(an[1]);
		this.add(an[2]);
		this.add(an[3]);
		this.add(an[4]);
		this.add(an[5]);
		this.add(an[6]);
		this.add(an[7]);
		this.add(an[8]);
	
		this.setTitle("��ʽ����Flowlayout");
		this.setSize(380,120);
		this.setLocation(200,200);
		//this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
