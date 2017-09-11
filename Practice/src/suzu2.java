import java.util.*;
/**
学生管理系统
@author 王逵
@version 1.0
*/
public class suzu2 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入有几名学生");
		int renshu=in.nextInt();
		System.out.println("请输入有几门课程");
		int coursenum=in.nextInt();
		/**
		传入数组
		@param people 传入一个int数组
		*/
		String[] people=new String[renshu];
		String[] course=new String[coursenum];
		for(int j=0;j<coursenum;j++){
				System.out.println("请输入"+(j+1)+"门课程");
				course[j]=in.next();
		}
		int[] sum=new int[renshu];
		int[] avg=new int[renshu];
		int[][] number=new int[renshu][coursenum];
		for(int i=0;i<renshu;i++){
			System.out.println("请输入第"+(i+1)+"名学生姓名");
			people[i]=in.next();
			for(int j=0;j<coursenum;j++){
			System.out.println("请输入"+people[i]+course[j]+"的成绩");
			number[i][j]=in.nextInt();
			sum[i]+=number[i][j];
			}
			avg[i]=sum[i]/coursenum;
		}
		String[] all=new String[renshu];
		System.out.print("学生"+"\t");
		for(int i=0;i<coursenum;i++){
			System.out.print(course[i]+"\t");
		}
		System.out.print("总分"+"\t"+"平均分"+"\t"+"名次");
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