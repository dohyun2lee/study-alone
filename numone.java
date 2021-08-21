import java.util.*;

public class numone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = 0, i = 0, j = 0, a = 0, b = 0;
		n = sc.nextInt();
		int[] arr = new int[n];
		arr[i] = sc.nextInt();

		if(arr[i] <= 1000000) {
				for(j=2;j<arr[i];j++) {
					if(arr[i]%j==0&&j!=arr[i]) {
						if(a%j!=0&&j!=a&&a<=j&&b%j!=0&&j!=b&&b<=j&&a!=b) {
							if(Math.abs(arr[i]-a)>Math.abs(arr[i]-b)) {
								System.out.print(b);
							}
							else if(Math.abs(arr[i]-a)<Math.abs(arr[i]-b)) {
								System.out.print(a);
							}
							else {
								if(a>b)
									System.out.print(b + a);
								else
									System.out.print(a + b);
							}
						}
					}
					else
						System.out.println(arr[i]+" ");
			}
		}
	}
}


