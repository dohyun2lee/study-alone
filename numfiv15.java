import java.util.*;

public class numfiv15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id�� pw�� �Է��Ͻÿ�.");
			System.out.print("id : ");
			String id = s.nextLine().trim();
			
			System.out.print("pw : ");
			String pw = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է¹ٶ��ϴ�.");
				continue;
			}
			
			if(!(map.get(id)).equals(pw)) {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
			else {
				System.out.println("��ġ�մϴ�.");
				break;
			}
		}
	}

}
