import java.util.*;
public class Rili {
	public static void main(String[] args){
		System.out.println("请输入年份");
		Scanner in=new Scanner(System.in);
		int year=in.nextInt();
		System.out.println("请输入月份");
		int month=in.nextInt();
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		int sum=0;
		for(int i=1990;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		for(int j=1;j<month;j++){
			if(j==2){
				if(year%4==0&&year%100!=0||year%400==0){
					sum+=29;
				}else{
					sum+=28;
				}
			}else if(j==4||j==6||j==9||j==11){
				sum+=30;
			}else{
				sum+=31;
			}
		}
		sum+=1;
		int day=0;
		if(month==2){
			if(year%4==0&&year%100!=0||year%400==0){
				day=29;
			}else{
				day=28;
			}
		}else if(month==4||month==6||month==9||month==11){
			day=30;
		}else{
			day=31;
		}
		int weekday=sum%7;
		for(int b=1;b<=weekday;b++){
			System.out.print("\t");
		}
		for(int a=1;a<=day;a++){
			if(sum%7==6){
				System.out.print(a+"\n");
			}else{
				System.out.print(a+"\t");
			}
			sum+=1;
		}
	}
}
