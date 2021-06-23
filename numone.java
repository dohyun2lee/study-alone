
public class numone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 4, j = 0;
		
		j = i++;
		System.out.println("j=i++; 실행 후, i ="+i+", j = "+j);
		
		i = 4;
		j = 0;
		
		j = ++i;
		System.out.println("j=i++; 실행 후, i ="+i+", j = "+j);
		
		i = 5;
		j = 5;
		System.out.println(i++);
		System.out.println(++j);
		System.out.println("i ="+i+", j ="+j);;
	}

}
