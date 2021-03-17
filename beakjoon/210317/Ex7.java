import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// 7. 최소공약수, 최소공배수 구하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int big=0, small=0;
		int big1=0, small2=0;
		int mok=0, nmg=0;
		int max=0, min=0;
		
		if(a>b) {
			big = a;
			big1 = a;
			small = b;
			small2 = b;
		} else {
			big=b;
			small=a;
			big1=b;
			small2=a;
		}
		
		while(true) {
			mok = big/small;
			nmg = big-mok*small;
			if(nmg == 0) {
				max=small;
				min = a*b/max;
				System.out.println(max+" "+min);
				break;
			} else {
				big = small;
				small=nmg;
			}
		}	
		
		int[] answer = new int[2];
		
		//최대공약수
		answer[0] = gcd(big1,small2);
		//최소공배수
		answer[1] = big1*small2/answer[0];
		System.out.println(answer[0]+" "+answer[1]);
		

	}
	
	public static int gcd(int a, int b) {
		if(a%b==0) {
			return b;
		}
		return gcd(b, a%b);
	}

}
