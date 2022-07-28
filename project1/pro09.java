package project1;

import java.util.Scanner;

public class pro09 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		label:while(true) {//무한 label은 while문 앞에만 사용해야 한다.
			System.out.println("명령문을 입력하세요:");
			String input = in.nextLine();
			switch(input) {
			case "1count":
				for(int i =1;i<=100;i++) {
					System.out.print(i+" ");
				}
				System.out.println();
				break;
			case "exit":
				System.out.println("프로그램 종료");
				break label;
				//반복되는 와중에 exit를 치면 프로그램이 종료됨(label)을 사용해서 스위치문이기 때문에
			case "2count":
				int sum = 0;
				for(int i=0;i<=300;i++) {
					sum = sum +i;
				}
				System.out.println("0에서 부터 300까지의 합:"+sum);
				break;
			case "3count":
				continue;//continue를 만나면 밑으로 내려가지 않고 위로 올라간다.
			}
			int sum = 0;
			for(int i = 0; i<=100;i++) {
				if(i%2==0) {
					sum = sum +i;
				}
			}
			System.out.println("0에서 부터 100까지 짝수합:"+sum);
		}
		
	}

}
