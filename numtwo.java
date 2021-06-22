
public class numtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 8;
		int y = 6;
		System.out.println("x = " +x);
		System.out.println("y = " +y);
		
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("x = " +x);
		System.out.println("y = " +y);
		
		int z = 7;
		int tmp2 = x;
		int tmp3 = y;
		x = z;
		y = tmp2;
		z = tmp3;
		System.out.println("x = " +x);
		System.out.println("y = " +y);
		System.out.println("z = " +z);
	}

}
