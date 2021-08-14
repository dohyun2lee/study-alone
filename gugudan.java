import java.util.*;

public class gugudan {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int s = 0, e = 0;
		int i = 0, j = 0;
		
		Scanner sc = new Scanner(System.in);
		
		s = sc.nextInt();
		e = sc.nextInt();
		
		if ((2<=s && s<=9)&&(2<=e && e<=9)) {
			if(s<=e) {
				for(j=s;j<e+1;j++) {
					for(i=1;i<10;i++) 
						System.out.printf("%d * %d = %d%n", j, i, j*i);
				}
			}
			else {
				for(j=s;j>e-1;j--) {
					for(i=1;i<10;i++) 
						System.out.printf("%d * %d = %d%n", j, i, i*j);
				}
			}
		}
		else
			System.out.println("Input Error!!");
	}

}
