
public class numone29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new Object() {
			int max(int a, int b) {
				return a > b ? a:b;
			}
		};
		
		int value = obj.max(3,5);
	}

}
