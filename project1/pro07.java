package project1;

import java.util.Scanner;

public class pro07 {

	public static void main(String[] args) {
				
		Scanner in = new Scanner(System.in);
		String input = "";
		boolean tag = true;
		
		while(tag) {
			System.out.println("명령문은 입력:");
			input = in.nextLine();
			switch(input) {
			case "exit":
				System.out.println("프로그램 종료");
				tag = false;
				break;
			case "copy":
				System.out.println("프로그램 복사");
				break;
			case "comp":
				System.out.println("프로그램을 비교");
				break;
			case "cat":
				System.out.println("문자열을 출력합니다.");
				break;
			case "dir":
				System.out.println("내용을 출력합니다.");
				break;
			default:
				System.out.println("지정되지 않은 명령어 입니다.");
				break;
			}
			System.out.println("기타 프로그램 설정작업");
		}

	}

}
