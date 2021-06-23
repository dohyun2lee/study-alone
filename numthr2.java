import java.util.Scanner;

public class numthr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = ' ';
		System.out.println("점수(정수)를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if (score >= 75) {
			grade = 'A';
		}
		else if (score >= 55) {
			grade = 'B';
		}
		else if (score >= 35) {
			grade = 'C';
	}
		else {
			grade = 'F';
		}
		
		System.out.println("당신의 학점은" +grade+ "입니다.");

	}
}
