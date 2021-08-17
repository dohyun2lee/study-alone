import java.util.Scanner;

public class multiplication2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 0, c = 0;
		int d = 0, e = 0, f = 0, g = 0;
		int n = 0, m = 0;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		a = m/100;
		b = m%100/10;
		c = m%100%10;
		
		d = n*c;
		e = n*b;
		f = n*a;
		g= d+(10*e)+(f*100);
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}

}
