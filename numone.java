import java.util.*;

public class numone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = 0, m = 0;
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		if(n<=101&&1<=m&&m<=3) {
			switch(m) {
			case 1 :
				for(int i=1;i<n;i++) {
					for(int j=0;j<i;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			case 2 :
				for(int i=n;i>0;i--) {
					for(int j=i;j>0;j--) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			case 3 :
				for(int i=0;i<n;i++) {
					for(int j=0;j<n-i;j++) {
						System.out.print(" ");
					}
					for(int j=0;j<1+i*2;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			}
		}
		else
			System.out.println("Input Error!");
	}

}
