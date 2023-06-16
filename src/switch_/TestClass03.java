package switch_;

import java.util.Scanner;

public class TestClass03 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		String str1, str2;
		
		System.out.print("1번째 문자열 입력: ");
		str1=input.next();
		System.out.print("2번째 문자열 입력: ");
		str2 = input.next();
		
		switch(str1) {
		case "안녕":System.out.println("그래 안녕"); break;
		case "그래":System.out.println("그래 입력"); break;
		default: System.out.println("그 외의 값");
		}
		System.out.println("next");
	}

}
