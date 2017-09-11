package Ì¹¿Ë´óÕ½;
import java.util.Vector;

class Baozha{
	int x,y;
	int shengcunqi=9;
	boolean shengming=true;
	public Baozha(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void suqsd(){
		if(shengcunqi>0){
			shengcunqi--;
		}else{
			this.shengming=false;
		}
	}
}
class DiTank3 extends Tank3{
	public DiTank3(int x,int y){
		super(x,y);
	}
}
class MyTank3 extends Tank3{
	Vector<Zidan>aa=new Vector<Zidan>();
	Zidan zd=null;
	public MyTank3(int x,int y){
		super(x,y);
	}
	public void fszd(){
		switch(this.fangxiang){
		case 0:
			zd=new Zidan(x+10,y-10,0);
			aa.add(zd);
			break;
		case 1:
			zd=new Zidan(x-10,y+10,1);
			aa.add(zd);
			break;
		case 2:
			zd=new Zidan(x+10,y+40,2);
			aa.add(zd);
			break;
		case 3:
			zd=new Zidan(x+40,y+10,3);
			aa.add(zd);
			break;
		}
		Thread t=new Thread(zd);
		t.start();
	}
	
	public void xiangshang(){
		y-=sudu;
	}
	public void xiangzuo(){
		x-=sudu;
	}
	public void xiangxia(){
		y+=sudu;
	}
	public void xiangyou(){
		x+=sudu;
	}
	
}
class Zidan implements Runnable{
	int x;int y;
	int fangxiang;int sudu=5;
	boolean shengming=true;
	public Zidan(int x,int y,int fangxiang){
		this.x=x;
		this.y=y;
		this.fangxiang=fangxiang;
	}
	public void run(){
		while(true){
			try{
				Thread.sleep(50);
			}
			catch(Exception e){}
			switch(fangxiang){
			case 0:
				y-=sudu;
				break;
			case 1:
				x-=sudu;
				break;
			case 2:
				y+=sudu;
				break;
			case 3:
				x+=sudu;
				break;
			}
			if(x<0||x>400||y<0||y>300){
				this.shengming=false;
				break;
			}
		}
	}
}

class Tank3{
	int x=0;int y=0;
	int sudu=10;int fangxiang=0;
	boolean shengming=true;
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
	public void setSudu(int sudu){
		this.sudu=sudu;
	}
	public int getSudu(){
		return sudu;
	}
	public void setFangxiang(int fangxiang){
		this.fangxiang=fangxiang;
	}
	public int getFangxiang(){
		return fangxiang;
	}
	public Tank3(int x,int y){
		this.x=x;
		this.y=y;
	}
}
