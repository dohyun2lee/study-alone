import java.util.*;

public class numthr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0, num = 0;
		Scanner scanner = new Scanner(System.in);
		
		outer:
			while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("���ϴ� �޴��� �����Ͻÿ� (����� 0)");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
		
			if(menu==0) {
				System.out.println("���α׷� ����");
				break;
			}
			else if (!(1<=menu && menu <=3)) {
				System.out.println("�߸� �����ϼ̽��ϴ�(����� 0)");
				continue;
			}
			
			for(;;) {
				System.out.println("����� ���� �Է��Ͻÿ�.(������� 0 ��ü���� 99)");
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
				
				if(num==0)
					break;
				
				if(num==99)
					break outer;
				
				switch(menu) {
				case 1:
					System.out.println("result ="+num*num);
					break;
				case 2:
					System.out.println("result ="+Math.sqrt(num));
					break;
				case 3:
					System.out.println("result ="+Math.log(num));
					break;
				}
			}
			
		}
	}

}
