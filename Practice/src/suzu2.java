import java.util.*;
/**
ѧ������ϵͳ
@author ����
@version 1.0
*/
public class suzu2 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("�������м���ѧ��");
		int renshu=in.nextInt();
		System.out.println("�������м��ſγ�");
		int coursenum=in.nextInt();
		/**
		��������
		@param people ����һ��int����
		*/
		String[] people=new String[renshu];
		String[] course=new String[coursenum];
		for(int j=0;j<coursenum;j++){
				System.out.println("������"+(j+1)+"�ſγ�");
				course[j]=in.next();
		}
		int[] sum=new int[renshu];
		int[] avg=new int[renshu];
		int[][] number=new int[renshu][coursenum];
		for(int i=0;i<renshu;i++){
			System.out.println("�������"+(i+1)+"��ѧ������");
			people[i]=in.next();
			for(int j=0;j<coursenum;j++){
			System.out.println("������"+people[i]+course[j]+"�ĳɼ�");
			number[i][j]=in.nextInt();
			sum[i]+=number[i][j];
			}
			avg[i]=sum[i]/coursenum;
		}
		String[] all=new String[renshu];
		System.out.print("ѧ��"+"\t");
		for(int i=0;i<coursenum;i++){
			System.out.print(course[i]+"\t");
		}
		System.out.print("�ܷ�"+"\t"+"ƽ����"+"\t"+"����");
		System.out.println();
		for(int i=0;i<renshu;i++){
			all[i]=people[i]+"\t";
			for(int j=0;j<coursenum;j++){
				all[i]=all[i]+number[i][j]+"\t";
			}
			all[i]=all[i]+sum[i]+"\t"+avg[i]+"\t";
		}
		for(int i=0;i<sum.length-1;i++){
			for(int j=0;j<sum.length-1;j++){
				if(sum[j]<sum[j+1]){
					int T=sum[j];
					sum[j]=sum[j+1];
					sum[j+1]=T;
					String t=all[j];
					all[j]=all[j+1];
					all[j+1]=t;
				}
			}
		}
		for(int i=0;i<renshu;i++){
			System.out.println(all[i]+(i+1));
		}
	}
}