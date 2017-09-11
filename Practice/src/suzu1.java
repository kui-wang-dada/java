import java.util.Scanner;
public class suzu1 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[] arr=new int[5];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入第"+(i+1)+"门成绩");
			arr[i]=in.nextInt();
			sum+=arr[i];
		}
		System.out.println("五个学生的平均成绩是："+sum/5);
	}
}
