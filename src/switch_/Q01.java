package switch_;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int day, choice;
		
		System.out.print("날짜 입력: ");
		choice=input.nextInt();
		
		day=choice % 7;
		
		switch(day){
			case 0:System.out.println("일"); break;
			case 1:System.out.println("월"); break;
			case 2:System.out.println("화"); break; 
			case 3:System.out.println("수");  break;
			case 4:System.out.println("목"); break;
			case 5:System.out.println("금"); break;
			case 6:System.out.println("토"); break;
		}

	}

}
