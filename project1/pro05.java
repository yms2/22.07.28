package project1;

public class pro05 {

	public static void main(String[] args) {

		int i;
		int j;
		
		i =2;
		j =1;
		
		while(i<=9) {
			while(j<=9) {
				System.out.println(i + "x" +j+"="+(i*j));
				j++;
			}
			System.out.println();
			i++;
			j=1; //j를 1로 초기화 시켜주는 것.
		}
	}

}
