import java.util.*;

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//이동할 횟수
		int a = sc.nextInt();
		sc.nextLine(); // 버퍼 비우기
		String[] plans = sc.nextLine().split(" ");
		int x = 1, y = 1; //맨 처음 시작점
		
		int[] dx = {0,0,-1,1};
		int[] dy = {-1,1,0,0};
		char[] type = {'L','R','U','D'};
		
		//이동 계획을 하나씩 확인
		for(int i=0; i<plans.length; i++) {
			char plan = plans[i].charAt(0);
			//이동후 좌표
			int nx = -1, ny =-1;
			for(int j=0; j<4; j++) {
				if(plan == type[j]) {
					nx = x+dx[j];
					ny = y+dy[j];
				}
			}
			
			//공간을 벗어나는 경우 무시
			if(nx<1 || ny<1 || nx>a || ny>a) continue;
			
			//이동
			x=nx;
			y=ny;
		}
		System.out.println(x+" "+y);
	}
}
