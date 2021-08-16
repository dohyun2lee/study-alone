import java.util.*;

public class numone50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0, m = 0;
		int i = 0, j = 0;
		int k = 0;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		for(i=0; i<n; i++) {
			for(j=0; j<m; j++) {
					System.out.print(++k+" ");
			}
			System.out.println();
		}
	}

}
