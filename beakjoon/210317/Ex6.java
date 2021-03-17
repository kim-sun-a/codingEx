
public class Ex6 {

	public static void main(String[] args) {
		// 6. 팩토리얼
		// 2! = 1x2, 3! = 1x2x3
		
		int input = 5;
		int result = 1;
		for(int i=1; i<=input; i++) {
			result *= i;
		}
		
		System.out.println(result);

	}

}
