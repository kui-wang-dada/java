package T1;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class 线程 extends JFrame {
	MyPanel mp=null;
	public static void main(String[] args){
		线程 t=new 线程();
	}
	public 线程(){
		mp=new MyPanel();
		this.add(mp);
		this.add(mp);
		this.addKeyListener(mp);
		this.setSize(400,300);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
class MyPanel extends JPanel implements KeyListener,Runnable{
	Zfx zf=null;
	public MyPanel(){
		zf=new Zfx(100,100);
	}
	public void paint(Graphics g){
		g.fillRect(0, 0, 400, 300);
		g.setColor(Color.red);
		g.fill3DRect(zf.x,zf.y, 20, 20, false);
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true){
			try{
				Thread.sleep(100);
			}
			catch(Exception e){}
			this.repaint();
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自动生成的方法存根
		if(e.getKeyCode()==KeyEvent.VK_J){
			this.zf.run();
		}
		this.repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自动生成的方法存根
		
	}
}
class Zfx implements Runnable{
	int x;
	int y;
	public void setX(int x){
		this.x=x;
	}
	public int getX(){
		return x;
	}
	public void setY(int y){
		this.y=y;
	}
	public int getY(){
		return y;
	}
	public Zfx(int x,int y){
		this.x=x;
		this.y=y;
	}

	public void run(){
		while(true){
			try{
				Thread.sleep(50);
			}
			catch(Exception e){}
			x-=10;

		}
	}
}