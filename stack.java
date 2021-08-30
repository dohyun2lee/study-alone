import java.util.*;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int floor = 0;
		
		int[] stack = new int[100];
		
		String task;
		
		sc.nextLine();
		for(int i = 0; i < N; ++i) {
			task = sc.nextLine();
			
			if ('i'==task.toCharArray()[0]) {
				stack[floor++] = Integer.parseInt(task.substring(2));
			}
			else if ("o".equals(task)) {
				if (floor == 0) {
					System.out.println("empty");
				}
				else {
					System.out.println(stack[--floor]);
				}
			}
			else if ("c".equals(task)) {
				System.out.println(floor);
			}
				
		}
	}

}
