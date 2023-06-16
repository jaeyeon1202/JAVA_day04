package for_;

import java.util.Scanner;

public class TestClass05 {

	public static void main(String[] args) {
		// 3~5:봄, 6~8:여름 9~11:가을 12~2:겨울
		//자신의 출생월 입력 -> 계절 출력
		
		int month;
		Scanner input=new Scanner(System.in);
		System.out.print("출생월 입력: ");
		month = input.nextInt();
		
		for(int i=1; i<=12; i++) {
			if(i==month) {
				if(i>=3 && i<=6) {
					System.out.println("봄");
				}else if(i>=6 && i<=8) {
					System.out.println("여름");
				}else if(i>=9 && i<=11) {
					System.out.println("가을");
				}else if(i==12 || i>=1 && i<=2) {
					System.out.println("겨울");
				}
			}
		
		}

	}

}
