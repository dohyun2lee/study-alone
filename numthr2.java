import java.util.Scanner;

public class numthr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = ' ';
		System.out.println("����(����)�� �Է��ϼ���.");
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
		
		System.out.println("����� ������" +grade+ "�Դϴ�.");

	}
}
