import java.util.Scanner;
public class Main5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		int a; 
		a = sc.nextInt();
		
		//22퍼 세그 납부하고 실 수령액
		int jese = (int) ((float) a * 0.78);
		
		int pil = (int) (a*0.2);
		int pill = (int) (pil * 0.22);
		int pilll = a-pill;
		
		System.out.println(jese + " "+ pilll);
		
	}
}