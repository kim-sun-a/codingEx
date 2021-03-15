import java.util.*;
public class Main2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		int cross = 1, prev_count=0;
		
		while(true) {
			//직전 대각선 누적합 + 해당 대각선 개수 이용 범위 판별
	        if(a <= prev_count+cross) {
	        	if(cross %2 ==1) { //대각선의 T가 홀수라면
	        		//홀수면 내려오는 거니까
	        		//분자가 1부터 시작
	        		System.out.println((cross-(a-prev_count-1)) + "/"+ (a-prev_count));
	        		break;
	        	} else {
	             	//대각선의 T가 짝수라면
	            	System.out.println((a-prev_count)+"/"+(cross-(a-prev_count-1)));
	            	break;
	            }
	        } else {
	        	prev_count += cross;
	        	cross++;
	        }
		}
        
		
	}
}