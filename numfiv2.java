
public class numfiv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		
		for(int i =2; i <=9; i++) {
			for(int j =1; j <=9; j++) {
				answer = i * j;
				System.out.printf("%d °ú(¿Í) %dÀÇ °ö : %d%n", i, j, answer);
			}
		}
		
		int answer2 = 0;
		int a = 2;
		int b = 1;
			while(a < 10) {
				while(b < 10) {
					answer2 = a * b;
					System.out.printf("%d °ú(¿Í) %dÀÇ °ö : %d%n", a, b, answer2);
					b++;
				}	
				b = 1;	
				a++;
			}
	}
}

