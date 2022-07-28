package project1;

public class pro04 {

	public static void main(String[] args) {
		
		//1에서부터 100까지의 합
		int i = 0;
		
		i=1;
		int sum = 0; //합을 저장할 곳
		while(i<=100) {
			sum = sum+i;
			i=i+1;
		}
		//i가 1에서부터 50까지의 합은
		i=1;
		sum =0;
		while(i<=50) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
		
		//1~100까지 홀수의 합은
		i =1;
		sum = 0;
		while(i<=100) {
			sum = sum +i;
			i= i+2;
		}
		System.out.println("홀수의합:"+sum); 
		
		i=1;
		sum =0;
		while(i<=100) {
			if(i%2 != 0) {
				sum = sum + i;
			}
			i= i+1;
		}
		System.out.println("홀수의합:"+sum); 
		
		//1~100 짝수의 합은
		i=0;
		sum=0;
		while(i<=100) {
			System.out.print(i+" ");
			sum= sum+i;
			i = i+2;
		}
		System.out.print(sum);
		
		
	}

}
