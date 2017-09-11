package 图形界面;
import java.awt.*;
import javax.swing.*;
public class 流式管理器 extends JFrame{
	JButton[] an={null,null,null,null,null,null,null,null,null};
	public static void main(String[] args){
		流式管理器 lx=new 流式管理器();
	}
	public 流式管理器(){
		an[0]=new JButton("话梅");
		an[1]=new JButton("果脯");
		an[2]=new JButton("薯片");
		an[3]=new JButton("饼干");
		an[4]=new JButton("巧克力");
		an[5]=new JButton("腰果");
		an[6]=new JButton("锅巴");
		an[7]=new JButton("开心果");
		an[8]=new JButton("西瓜");
		
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
	
		this.setTitle("流式布局Flowlayout");
		this.setSize(380,120);
		this.setLocation(200,200);
		//this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
