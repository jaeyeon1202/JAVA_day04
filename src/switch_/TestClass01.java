package switch_;

public class TestClass01 {

	public static void main(String[] args) {
		/*
		switch(식)
			case 1:내용; break;
			case 2:내용; break;
			---
			default:내용; break;
		*/
		
		int select =3;
		switch(select) {
		case 1: System.out.println("1"); break;
		case 2: System.out.println("2"); break;
			default: System.out.println("1,2 제외");
		}
		System.out.println("next");

	}

}
