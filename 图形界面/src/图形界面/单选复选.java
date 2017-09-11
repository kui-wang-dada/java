package 图形界面;
import java.awt.*;
import javax.swing.*;
public class 单选复选  extends JFrame {
	JPanel mb1,mb2,mb3;
	JButton an1,an2;
	JLabel bq1,bq2;
	JCheckBox fxk1,fxk2,fxk3;
	JRadioButton dx1,dx2;
	ButtonGroup dxz;
	public static void main(String[] args){
		单选复选 lx3=new 单选复选();
	}
	public 单选复选(){
		an1=new JButton("注册");
		an2=new JButton("取消");
		
		mb1=new JPanel();
		mb2=new JPanel();
		mb3=new JPanel();
		
		bq1=new JLabel("特长");
		bq2=new JLabel("性别");
		
		fxk1=new JCheckBox("音乐");
		fxk2=new JCheckBox("美术");
		fxk3=new JCheckBox("体育");
		
		dx1=new JRadioButton("男");
		dx2=new JRadioButton("女");
		
		dxz=new ButtonGroup();
		dxz.add(dx1);  dxz.add(dx2);
		
		this.setLayout(new GridLayout(3,1));
		
		mb1.add(bq1);   mb1.add(fxk1);  mb1.add(fxk2);mb1.add(fxk3);
		mb2.add(bq2);   mb2.add(dx1);   mb2.add(dx2);
		mb3.add(an1);   mb3.add(an2);
		
		this.add(mb1);
		this.add(mb2);
		this.add(mb3);
		
		this.setTitle("单选复选");
		this.setSize(230,150);
		this.setLocation(500,500);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
