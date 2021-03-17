
public class Ex5 {

	public static void main(String[] args) {
		// 5. 피보나치
		// 1,2열 더한게 3행, 2,3행 더한게 4행
		
		//int[] result = new int[7];
		int input=8;
		
		for(int i=1; i<input; i++) {
			System.out.println(fibo(i));
		}

	}
	
	public static int fibo(int n) {
		if(n<=1) {
			return n;
		}
		
		return fibo(n-2) + fibo(n-1);
	}

}
