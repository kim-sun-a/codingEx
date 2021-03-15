import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
        c = sc.nextInt();
        
        if(c <=b) {
        	System.out.println("-1");
        } else {
        	System.out.println((a/(c-b))+1);
        }
	}
}
