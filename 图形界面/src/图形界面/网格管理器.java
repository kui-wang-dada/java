package 图形界面;
import java.awt.*;
import javax.swing.*;
public class 网格管理器 extends JFrame{
	JButton an[]={null,null,null,null,null,null,null,null,null};
	int s=9;
	public static void main(String[] args){
		网格管理器 lx1=new 网格管理器();
	}
	public 网格管理器(){
		an[0]=new JButton("话梅");
		an[1]=new JButton("果脯");
		an[2]=new JButton("薯片");
		an[3]=new JButton("饼干");
		an[4]=new JButton("巧克力");
		an[5]=new JButton("腰果");
		an[6]=new JButton("锅巴");
		an[7]=new JButton("开心果");
		an[8]=new JButton("西瓜");
		
		this.setLayout(new GridLayout(3,3,15,15));
		for(int i=0;i<s;i++){
			this.add(an[i]);
		}
	
	
		this.setTitle("网格布局Gridlayout");
		this.setSize(380,320);
		this.setLocation(200,200);
		//this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}