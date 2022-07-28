package project1;

import java.util.Scanner;
public class pro15 {

	public static void main(String[] args) {
		//두 수 사이의 값
			System.out.println("첫번째 수를 입력하세요");
			Scanner in = new Scanner(System.in);
			
			int num1 = Integer.parseInt(in.nextLine());
			System.out.println("두번째 수를 입력하세요");
			int num2 = Integer.parseInt(in.nextLine());
			
			int i;
			i = num1;
			do {
				System.out.print(i + " ");
				i++;
			}while((i>=num1) && (i <= num2));
		//두수 사이의 홀수의 합을 구하시오 \n은 다음줄로 넘어간다.
			System.out.println();
			i = num1;
			int sum =0;
			
			
			do {
				if(i%2 != 0) {
					
					sum = sum +i;
					
				}
				i++;
			}while((i>=num1) && (i <= num2));
			System.out.println("홀수의 합:" +sum);
			
			//두수 사이의 짝수의 합을 구하시오
			System.out.println();
			i = num1;
			sum =0;
			
			
			do {
				if(i%2 == 0) {
					
					sum = sum +i;
					
				}
				i++;
			}while((i>=num1) && (i <= num2));
			System.out.println("짝수의 합:" +sum);
	}

}
