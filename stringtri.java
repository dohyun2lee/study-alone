import java.util.*;

public class stringtri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = 0, j = 0, k = 0, n = 0, a = 65, b = 0;	
		n = sc.nextInt();
		char[][] arr = new char[n][n];
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				arr[i][j] = ' ';
			}
		}
		
		for(k = 0; k < n; k++) {
			for(i = 0; k+i < n; i++) {
				arr[k+i][n-1-i] = (char)(a+b%26);
				b++;
			}
		}
		
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
