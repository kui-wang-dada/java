package ������Ŀ;
import java.util.*;
import java.io.*;
public class arraylist����Ӧ�� {
	public static void main(String[] args) throws Exception{
		Spgl shipin=new Spgl();
		BufferedReader sr=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			System.out.println("���ʳƷ�밴"+"1");
			System.out.println("��ѯʳƷ�밴"+"2");
			System.out.println("�޸�ʳƷ�۸��밴"+"3");
			System.out.println("ɾ��ʳƷ�밴"+"4");
			System.out.println("�˳��밴"+"0");
		
			String str=sr.readLine();
			if(str.equals("1")){
				System.out.println("������ʳƷ�ı�ţ�");
				String bh=sr.readLine();
				System.out.println("������ʳƷ�����ƣ�");
				String mc=sr.readLine();
				System.out.println("������ʳƷ�ļ۸�");
				float jg=Float.parseFloat(sr.readLine());
				
				Sp sp=new Sp(bh,mc,jg);
				shipin.addsp(sp);
			}else if(str.equals("2")){	
				System.out.println("�������ѯ�ı�ţ�");
				String bh=sr.readLine();
				shipin.spcx(bh);
			}else if(str.equals("3")){	
				System.out.println("������Ҫ�ļ۵���Ʒ��ţ�");
				String bh=sr.readLine();
				System.out.println("������ĺ�ļ۸�");
				float jg=Float.parseFloat(sr.readLine());
				shipin.spxg(bh,jg);
			}else if(str.equals("4")){
				System.out.println("������Ҫɾ������Ʒ��ţ�");
				String bh=sr.readLine();
				shipin.delsp(bh);
			}else if(str.equals("0")){
				System.out.println("ллʹ��");
				System.exit(0);
			}else{
				System.out.println("��������");
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
		System.out.println("�����Ƶ�ɹ�");
	}
	public void spcx(String bh){
		int i;
		for(i=0;i<aa.size();i++){
			Sp sp=(Sp)aa.get(i);
			if(sp.getBianhao().equals(bh)){
				System.out.println("ʳƷ�ı���ǣ�"+bh);
				System.out.println("ʳƷ�������ǣ�"+sp.getMingcheng());
				System.out.println("ʳƷ�ļ۸��ǣ�"+sp.getJiage());
				break;
			}
			
		}
		if(i==aa.size()){
			System.out.println("�Բ���û���ҵ�����Ʒ");
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
			System.out.println("�Բ���û���ҵ�����Ʒ");
		}
	}
	public void delsp(String bh){
		int i;
		
		if(aa.size()==0){
			System.out.println("�Բ���û���κ���Ʒ");		
		}
		for(i=0;i<aa.size();i++){
			Sp sp=(Sp)aa.get(i);
			if(sp.getBianhao().equals(bh)){
				aa.remove(i);
				break;
			}
		}
		if(i==aa.size()&&aa.size()!=0){
			System.out.println("�Բ���û�и���Ʒ");
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