import java.util.Scanner;
public class Test2 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("--------��ȭ��Ϸ------------");
		System.out.println("���ȭ��1.����   2��ʯͷ   3����");
		int person=in.nextInt();
		int computer=(int)(Math.random()*3)+1;
		String Marks="ȭͷ";
		switch(person){
			case 1:
			Marks="����";
			break;
			case 2:
			Marks="ʯͷ";
			break;
			case 3:
			Marks="��";
			break;
		}
		String Mask2="ȭͷ";
		switch(computer){
		case 1:
			Mask2="����";
			break;
		case 2:
			Mask2="ʯͷ";
			break;
		case 3:
			Mask2="��";
			break;
		}
		if(person==computer){
			System.out.println("ƽ��");
		}else if(person==1&&computer==2||person==2&&computer==3||person==3&&computer==1){
			System.out.println("������ǣ�"+Marks+"���Գ�����:"+Mask2);
			System.out.println("������");
		}else{
			System.out.println("������ǣ�"+Marks+"���Գ�����:"+Mask2);
			System.out.println("��Ӯ��");
		}
	}
}
