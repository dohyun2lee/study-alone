import java.util.*;

public class numone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String bs = sc.nextLine();
		char[] key = bs.toCharArray();
		//eydbkmiqugjxlvtzpnwohracsf
		String as = sc.nextLine();
		char[] arr = as.toCharArray();
		
		String alp = "abcdefghijklmnopqrstuvwxyz";
		char[] allp = alp.toCharArray();
		
		int i = 0, j = 0;
		int n = arr.length;
		
		char[] ans = new char[n];
		
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < allp.length; j++) {
				if(arr[i]==' ') {
					ans[i] += (char)(32);
				}
				else if(Character.isUpperCase(arr[i])) {
					if(allp[j] == arr[i]+32) {
						ans[i] += key[j]-32;
					}
				}
				else
					if(allp[j] == arr[i]) {
						ans[i] += key[j];
					}
			}
			System.out.print(ans[i]);
		}
	}

}
