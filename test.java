import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String[] abc = {"a", "b", "c"};
		
		Scanner sc1 = new Scanner(System.in);
		
		String bs1 = sc1.next();
		char[] key1 = bs1.toCharArray();
		
		//System.out.println(Arrays.asList(abc).indexOf(bs1));
		
		for(int i = 0; i <key1.length; i++) {
			System.out.print(key1[i]);
			System.out.println(Arrays.asList(abc).indexOf(key1[i]));
		}
		
	}

}	
