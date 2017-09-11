package 进阶项目;
import java.util.*;
import java.io.*;
public class arraylist方法应用 {
	public static void main(String[] args) throws Exception{
		Spgl shipin=new Spgl();
		BufferedReader sr=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			System.out.println("添加食品请按"+"1");
			System.out.println("查询食品请按"+"2");
			System.out.println("修改食品价格请按"+"3");
			System.out.println("删除食品请按"+"4");
			System.out.println("退出请按"+"0");
		
			String str=sr.readLine();
			if(str.equals("1")){
				System.out.println("请输入食品的编号：");
				String bh=sr.readLine();
				System.out.println("请输入食品的名称：");
				String mc=sr.readLine();
				System.out.println("请输入食品的价格：");
				float jg=Float.parseFloat(sr.readLine());
				
				Sp sp=new Sp(bh,mc,jg);
				shipin.addsp(sp);
			}else if(str.equals("2")){	
				System.out.println("请输入查询的编号：");
				String bh=sr.readLine();
				shipin.spcx(bh);
			}else if(str.equals("3")){	
				System.out.println("请输入要改价的商品编号：");
				String bh=sr.readLine();
				System.out.println("请输入改后的价格：");
				float jg=Float.parseFloat(sr.readLine());
				shipin.spxg(bh,jg);
			}else if(str.equals("4")){
				System.out.println("请输入要删除的商品编号：");
				String bh=sr.readLine();
				shipin.delsp(bh);
			}else if(str.equals("0")){
				System.out.println("谢谢使用");
				System.exit(0);
			}else{
				System.out.println("输入有误");
			}
				
		}	
	}
}
class Spgl{
	private ArrayList aa;
	Spgl(){
		aa=new ArrayList();
	}
	public void addsp(Sp sp){
		aa.add(sp);
		System.out.println("添加视频成功");
	}
	public void spcx(String bh){
		int i;
		for(i=0;i<aa.size();i++){
			Sp sp=(Sp)aa.get(i);
			if(sp.getBianhao().equals(bh)){
				System.out.println("食品的编号是："+bh);
				System.out.println("食品的名称是："+sp.getMingcheng());
				System.out.println("食品的价格是："+sp.getJiage());
				break;
			}
			
		}
		if(i==aa.size()){
			System.out.println("对不起，没有找到该商品");
		}
		
	}
	public void spxg(String bh,float jg){
		int i;
		for(i=0;i<aa.size();i++){
			Sp sp=(Sp)aa.get(i);
			if(sp.getBianhao().equals(bh)){
				sp.setJiage(jg);
				break;
			}
		}
		if(i==aa.size()){
			System.out.println("对不起，没有找到该商品");
		}
	}
	public void delsp(String bh){
		int i;
		
		if(aa.size()==0){
			System.out.println("对不起，没有任何商品");		
		}
		for(i=0;i<aa.size();i++){
			Sp sp=(Sp)aa.get(i);
			if(sp.getBianhao().equals(bh)){
				aa.remove(i);
				break;
			}
		}
		if(i==aa.size()&&aa.size()!=0){
			System.out.println("对不起，没有该商品");
		}
	}
	
	}


class Sp{
	private String bianhao;
	private String mingcheng;
	private float jiage;
	Sp(String bianhao,String mingcheng,float jiage){
		this.bianhao=bianhao;
		this.mingcheng=mingcheng;
		this.jiage=jiage;
	}
	public void setBianhao(String bianhao){
		this.bianhao=bianhao;
	}
	public String getBianhao(){
		return bianhao;
	}
	public void setMingcheng(String mingcheng){
		this.mingcheng=mingcheng;
	}
	public String getMingcheng(){
		return mingcheng;
	}
	public void setJiage(float jiage){
		this.jiage=jiage;
	}
	public float getJiage(){
		return jiage;
	}
}