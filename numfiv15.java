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
			System.out.println("id와 pw를 입력하시오.");
			System.out.print("id : ");
			String id = s.nextLine().trim();
			
			System.out.print("pw : ");
			String pw = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력바랍니다.");
				continue;
			}
			
			if(!(map.get(id)).equals(pw)) {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
			else {
				System.out.println("일치합니다.");
				break;
			}
		}
	}

}
