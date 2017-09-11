package 图形界面;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class 记事本 extends JFrame {
	JMenuBar cd;
	JMenu cd1,cd2,cd3,cd4,cd5;
	JMenuItem cdx2,cdx3,cdx4,cdx5,cdx6,cdx7;
	JMenu ej;JMenuItem ej1,ej2;
	
	JToolBar gjt;
	JButton an1,an2,an3,an4,an5,an6;
	
	JTextArea wby;
	JScrollPane gdt;
	public static void main(String[] args){
		记事本 lx=new 记事本();
	}
	public 记事本(){
		gjt=new JToolBar();
		an1=new JButton(new ImageIcon("image/xj.jpg"));
				an1.setToolTipText("新建");
		an2=new JButton(new ImageIcon("image/dk.jpg"));
				an2.setToolTipText("打开");
		an3=new JButton(new ImageIcon("image/bc.jpg"));
				an3.setToolTipText("保存");
		an4=new JButton(new ImageIcon("image/jq.jpg"));
				an4.setToolTipText("剪切");
		an5=new JButton(new ImageIcon("image/fz.jpg"));
				an5.setToolTipText("复制");
		an6=new JButton(new ImageIcon("image/zt.jpg"));
				an6.setToolTipText("粘贴");
				
		cd=new JMenuBar();
		cd1=new JMenu("文件（F）");
		cd1.setMnemonic('F');
		cd2=new JMenu("编辑（E）");
		cd2.setMnemonic('E');
		cd3=new JMenu("格式（O）");
		cd3.setMnemonic('O');
		cd4=new JMenu("查看（V）");
		cd4.setMnemonic('V');
		cd5=new JMenu("帮助（H）");
		cd5.setMnemonic('H');
		
		ej=new JMenu("新建");
		ej1=new JMenuItem("文件",new ImageIcon("image/xj.jpg"));
		ej2=new JMenuItem("模板");
		
		cdx2=new JMenuItem("打开",new ImageIcon("image/dk.jpg"));
		cdx3=new JMenuItem("保存（S）",new ImageIcon("image/bc.jpg"));
		cdx3.setMnemonic('S');
		cdx4=new JMenuItem("另存为");
		cdx5=new JMenuItem("页面设置");
		cdx6=new JMenuItem("打印");
		cdx7=new JMenuItem("退出");
		
		wby=new JTextArea();
		gdt=new JScrollPane(wby);
		
		gjt.add(an1);gjt.add(an2);gjt.add(an3);gjt.add(an4);gjt.add(an5);gjt.add(an6);
		
		ej.add(ej1);ej.add(ej2);
		
		cd1.add(ej);cd1.add(cdx2);cd1.add(cdx3);cd1.add(cdx4);
		cd1.addSeparator();
		cd1.add(cdx5);cd1.add(cdx6);
		cd1.addSeparator();
		cd1.add(cdx7);
		
		cd.add(cd1);cd.add(cd2);cd.add(cd3);cd.add(cd4);cd.add(cd5);
		
		
		this.setJMenuBar(cd);
		this.add(gjt,BorderLayout.NORTH);
		this.add(gdt);
		
		this.setTitle("记事本");
		this.setSize(570,370);
		this.setLocation(300,280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
