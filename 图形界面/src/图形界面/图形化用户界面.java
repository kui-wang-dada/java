package 图形界面;
import java.awt.*;
import javax.swing.*;
public class 图形化用户界面 extends JFrame  {
	JButton an1,an2,an3,an4,an5;
	public static void main(String[] args){
	
		图形化用户界面 lx1=new 图形化用户界面();
	}
	public 图形化用户界面(){
		an1=new JButton("东方");
		an2=new JButton("西方");
		an3=new JButton("南方");
		an4=new JButton("北方");
		an5=new JButton("中部");
		
		this.add(an1,BorderLayout.EAST);
		this.add(an2,BorderLayout.WEST);
		this.add(an3,BorderLayout.SOUTH);
		this.add(an4,BorderLayout.NORTH);
		this.add(an5,BorderLayout.CENTER);
		
		this.setTitle("边界布局BorderLayout");
		this.setSize(350,260);
		this.setLocation(100,260);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
