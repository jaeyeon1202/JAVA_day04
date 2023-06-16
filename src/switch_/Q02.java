package switch_;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int choice;
		String home=null, work=null;
		
		while(true) {
		System.out.print("우리집등록: ");
		home = input.next();
		System.out.print("회사등록: ");
		work=input.next();
		
		System.out.print("선택: ");
		choice=input.nextInt();
		
		switch(choice) {
			case 1:{
				System.out.printf("우리집 등록: %s", home);	
			}case 2:{
				System.out.printf("회사등록: %s",work);
			}case 3:{
				System.out.printf("우리집: %s\n회사: %s\n",home, work);
			}
		}
		
		
		
		}
		
		
		
		
		
//		while(true) {
//			System.out.print("집: ");
//			home=input.next();
//			System.out.print("회사: ");
//			work=input.next();
//			break;
//		}
//		
//		
//		switch(choice) {
//		case 1:{
//			System.out.printf("우리집 등록: %s", home);	
//		}case 2:{
//			System.out.printf("회사등록: %s",work);
//		}case 3:{
//			System.out.printf("우리집: %s\n회사: %s\n",home, work);
//		}
//	}
		

	}

}
