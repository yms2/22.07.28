package project1;

public class pro14 {

	public static void main(String[] args) {

		int i = 0;
		
		do {
			System.out.print(i+"A");
			int j = 100;
			do {
				System.out.print(j+"B");
				j++;
			}while(j <=200);
			i++;
		}while(i<=100);
		//앞쪽 do가 한번 실행이되고 그밑에 do가 끝이나면 다시 위에 do 한번 실행함.
		
	}

}
