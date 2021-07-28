import java.util.function.Function;

public class numone31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> f = Integer::parseInt;
		Function<String, Integer> f = Integer::parseInt;
		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		System.out.println(f.apply("100")+200);
	}

}
