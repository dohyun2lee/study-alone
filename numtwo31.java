import java.util.function.Function;

public class numtwo31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, MyClass> f = (i) -> new MyClass(i);
		
		MyClass mc = f.apply(100);
		System.out.println(mc.iv);
		
		System.out.println(f.apply(100).iv);
	}

}

class MyClass {
	int iv;
	
	MyClass(int iv) {
		this.iv = iv;
	}
}