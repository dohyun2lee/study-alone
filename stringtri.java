import java.util.*;

public class stringtri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = 0, j = 0, k = 0, n = 0;	
		n = sc.nextInt();
		String[] arr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
				"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		//int [][] arr = new int[n][n];
		//int alpha = 0;
		
		//for (i = 1; i <= n; i++) {
		   // for (j = i, k = n; j <= n; j++, k--) {
		        //arr[j][k] = alpha++;
		        //if(alpha > 'Z')
		           // alpha = 'A';
		        
		        //System.out.print(alpha);
		    //}
		//}
		
			for(i = 0; i < n; i++) {
			for(k = n-1, j = 0; k >= 0 && j < n; k--, j++) {
				System.out.print("   ");
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}

	}

}
