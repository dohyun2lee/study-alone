
public class numtwo29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunction f = new MyFunction() {
			public int max(int a, int b) {
				return a > b ? a:b;
			}
		};
		
		int value = f.max(3,5);
		System.out.println("value : "+value);
	}

}

@FunctionalInterface
interface MyFunction {
	int max(int a, int b);
}