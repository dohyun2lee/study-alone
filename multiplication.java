import java.util.*;

public class multiplication {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int N = 0;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		for (i = 1; i <= N; i++)
		{
		    if (N % i == 0)
		    {
		        System.out.printf("%d ", i);
		    }
		}
	}
}
