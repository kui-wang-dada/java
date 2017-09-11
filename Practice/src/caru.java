import java.util.*;
public class caru {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[] arr={2,3,4,7,12,43,124,531,12423,153456};
		System.out.println("请输入您要插入的数值");
		int num=in.nextInt();
		arr[arr.length-1]=num;
		for(int i=arr.length-1;i>0;i--){
			if(arr[i]<arr[i-1]){
				int t=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=t;
			}else{
				break;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
