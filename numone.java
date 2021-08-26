import java.util.*;

public class numone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String bs = sc.next();
		char[] key = bs.toCharArray();
		String as = sc.next();
		char[] arr = as.toCharArray();
		
		String alp = "abcdefghijklmnopqrstuvwxyz";
		char[] allp = alp.toCharArray();
		String alp2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] allp2 = alp2.toCharArray();
		
		int i = 0, j = 0, n = 90;
		
		String spa = " ";
		char[] space = spa.toCharArray();
		
		char[] ans = new char[n];
		
		//System.out.println("eydbkmiqugjxlvtzpnwohracsf");
		
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < 26; j++) {
				if(arr[i] == ' ') {
					ans[i] += (char)(' '); 
					continue;
				}
				else if(Character.isUpperCase(arr[i])) {
					if(allp[j]==arr[i]+32)
						ans[i] += key[j]-32;
					continue;
				}
				else 
					if(allp[j]==arr[i])
						ans[i] += key[j];
					continue;
			}
		}
		System.out.print(ans);
		
	
	}

}
