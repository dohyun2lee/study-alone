import java.util.Scanner;

public class numthr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�� �ڸ� ������ �Է��ϼ��� : ");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("�Է³��� : "+input);
		System.out.printf("num=%d%n", num);
		
	}

}
