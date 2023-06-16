package switch_;

import java.util.Scanner;

public class TestClass04 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		String name;
		
		while(true) {
			System.out.print("이름 입력: ");
			name=input.next();
			System.out.println("입력한이름: "+name);
		}
	}

}
