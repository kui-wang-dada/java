import java.util.Scanner;
public class suzu1 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[] arr=new int[5];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			System.out.println("�������"+(i+1)+"�ųɼ�");
			arr[i]=in.nextInt();
			sum+=arr[i];
		}
		System.out.println("���ѧ����ƽ���ɼ��ǣ�"+sum/5);
	}
}
