import java.util.*;

public class numone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String as = sc.next();
		char[] arr = as.toCharArray();
		int i = 0, j = 0;
		
		System.out.println("eydbkmiqugjxlvtzpnwohracsf");
		System.out.print(arr[i]);
//		
//		for() {
//			if(Character.isUpperCase(arr[i])==true) {
//				arr[i] = (char)(j+65);
//			}
//			else
//				arr[i] = (char)(j+97);
//			System.out.println(arr[i]);
//		}
		for(i = 0, j = 0; i < arr.length&& j < 26; i++, j++) {
			if(arr[i] == ' ') {
				//System.out.print(arr[i]);
				continue;
			}
			else if(65<=arr[i]&&arr[i]< 97) {
				arr[i] = (char)(j+65); 
				//System.out.print(arr[i]);
				continue;
			}
			else {
				arr[i] = (char)(j+97);
				//System.out.print(arr[i]);	
				continue;
			}
		}
		System.out.println(arr[i]);
		
	}

}
