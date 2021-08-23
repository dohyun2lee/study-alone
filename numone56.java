import java.util.*;

public class numone56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String as = sc.next();
		char[] arr = as.toCharArray();
		int h = 10, i = 0, j = 0; 
		
		for(i = 1; i < arr.length; i++) {
			if (arr[i]==arr[i-1])
				h += 5;
			else
				h += 10;
		}
		
		System.out.println(h);
		
		
	}

}
