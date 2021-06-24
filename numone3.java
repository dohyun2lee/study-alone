import java.util.*;

public class numone3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하시오.");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num!=0) {
			sum += num%10;
			System.out.printf("sum=%d num=%d%n", sum, num);
			
			num /= 10;
		}
		System.out.println("각 자리수의 합 : " +sum);
	}

}
