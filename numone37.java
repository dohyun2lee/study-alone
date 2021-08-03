import java.util.Optional;

public class numone37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[0];
		System.out.println("arr.length="+arr.length);
		
		Optional<String> opt = Optional.empty();
		System.out.println("opt"+opt);
		
		String str = "";
		
		//try {
		//	str = opt.get();
		//} catch (Exception e) {
		//	str = "";
		//}
		
		str = opt.orElseGet(()->new String());
		System.out.println("str="+str);
	}

}
