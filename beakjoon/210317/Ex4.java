import java.util.Random;

public class Ex4 {

	public static void main(String[] args) {
		// 4. 로또번호 추첨
		
		//로또 번호 담을 배열 생성
		int[] ball = new int[45];
		
		//배열에 번호 담기
		for(int i=0; i<ball.length; i++) {
			ball[i]=i+1;
		}
		
		int temp=0;
		//랜덤 번호 생성
		int lotto = 0;
		
		for(int i=0; i<777; i++	) {
			lotto = (int) (Math.random() *45);
			temp = ball[0];
			ball[0] = ball[lotto];
			ball[lotto] = temp;
		}
		
		for(int i=0; i<6; i++) {
			System.out.print(ball[i]+" / ");
		}
		
		System.out.println("로또 완료");
		
	}

}
