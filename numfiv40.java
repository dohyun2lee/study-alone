import java.io.*;
import java.util.ArrayList;

public class numfiv40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String fileName = "UserInfo.ser";
			FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			ObjectInputStream in = new ObjectInputStream(bis);
			
			try {
			UserInfo u1 = (UserInfo)in.readObject();
			UserInfo u2 = (UserInfo)in.readObject();
			ArrayList list = (ArrayList)in.readObject();
			
			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
			in.close();
			} catch(ClassNotFoundException ce) {}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
