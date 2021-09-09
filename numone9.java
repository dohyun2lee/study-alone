package numone;

public class numone9 {
	
	String m;
	String m1 = "멤버변수";
	
	public numone9() {
		String m = "지역변수";
		System.out.println(m);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numone9 member = new numone9();
		System.out.println("초기화 하지않은 멤버변수 : " +member.m);
		System.out.println("초기화 한 멤버변수 : "+member.m1);
	
	}

}
