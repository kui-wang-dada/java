package 图形界面;
import java.awt.*;
import javax.swing.*;
public class JPane布局 extends JFrame{
	JButton[] an={null,null,null,null,null,null,null,null,null};
	JPanel[] mb={null,null,null,null};
	public static void main(String[] args){
		JPane布局 lx=new JPane布局();
	}
	public JPane布局(){
		an[0]=new JButton("话梅");
		an[1]=new JButton("果脯");
		an[2]=new JButton("薯片");
		an[3]=new JButton("饼干");
		an[4]=new JButton("巧克力");
		an[5]=new JButton("腰果");
		an[6]=new JButton("锅巴");
		an[7]=new JButton("开心果");
		an[8]=new JButton("西瓜");
		
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
		
	
		this.setTitle("JPanel布局");
		this.setSize(380,320);
		this.setLocation(200,200);
		//this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}