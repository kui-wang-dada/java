package ͼ�ν���;
import java.awt.*;
import javax.swing.*;
public class JPane���� extends JFrame{
	JButton[] an={null,null,null,null,null,null,null,null,null};
	JPanel[] mb={null,null,null,null};
	public static void main(String[] args){
		JPane���� lx=new JPane����();
	}
	public JPane����(){
		an[0]=new JButton("��÷");
		an[1]=new JButton("����");
		an[2]=new JButton("��Ƭ");
		an[3]=new JButton("����");
		an[4]=new JButton("�ɿ���");
		an[5]=new JButton("����");
		an[6]=new JButton("����");
		an[7]=new JButton("���Ĺ�");
		an[8]=new JButton("����");
		
		mb[0]=new JPanel();
		mb[1]=new JPanel();
		mb[2]=new JPanel();
		mb[3]=new JPanel();
		
		mb[0].add(an[1]);  mb[0].add(an[2]);
		mb[1].add(an[3]);  mb[1].add(an[4]);
		mb[2].add(an[5]);  mb[2].add(an[6]);
		mb[3].add(an[7]);  mb[3].add(an[8]);
		this.add(mb[0],BorderLayout.EAST);
		this.add(mb[1],BorderLayout.WEST);
		this.add(mb[2],BorderLayout.SOUTH);
		this.add(mb[3],BorderLayout.NORTH);
		this.add(an[0]);
		
	
		this.setTitle("JPanel����");
		this.setSize(380,320);
		this.setLocation(200,200);
		//this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}