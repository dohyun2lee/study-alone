import java.util.*;

public class numtwo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("Usage:java \"EXPRESSION\"");
			System.out.println("Example:java \"((2+3)*1)+3\"");
			System.exit(0);
		}
		
		Stack st = new Stack();
		String expression = args[0];
		
		System.out.println("expression:" + expression);
		
		try {
			for (int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if (ch == '(') {
					st.push(ch + "");
				}
				else if (ch == ')') {
					st.pop();
				}
			}
			
			if (st.isEmpty()) {
				System.out.println("°ýÈ£°¡ ÀÏÄ¡");		
			}
			else {
				System.out.println("°ýÈ£ ºÒÀÏÄ¡");
			}
		}
		catch (EmptyStackException e) {
			System.out.println("°ýÈ£ ºÒÀÏÄ¡");
		}
	}

}
