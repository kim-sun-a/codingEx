import java.util.Scanner;
public class Main4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		int a,b; 
		a = sc.nextInt();
		

		for(int i=1; i<=a;i++) {
			b = sc.nextInt();
			for(int j=0; j<b;j++) {
				System.out.print("=");
			}
			System.out.println();
		}
		
	}
}