import java.util.*;

public class numone15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new TreeSet();
		
		for(int i = 0; set.size() < 7; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num);
		}
		
		System.out.print(set);
	}

}
