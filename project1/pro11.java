package project1;

import java.util.Scanner;

public class pro11 {

	public static void main(String[] args) {
		
		while(true) {
			Scanner in = new Scanner(System.in); 
			System.out.println("점수를 입력하세요");
			int score = in.nextInt();
			if(score<0 || score>100) {
				System.out.println("정할 수 없는 점수입니다.");
				break;
				//가장  가까운 반복이 멈춘다.ㄴ
			}else if(score>= 80) {
				System.out.println("축하합니다. 합격입니다.");
			}else if(score>=60) {
				System.out.println("합격입니다.");
			}else if(score>=40) {
				System.out.println("노력하세요.");
			}else {
				System.out.println("다시 도전");
				
			}
			
		}
		
	}

}
