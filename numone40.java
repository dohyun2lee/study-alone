import java.io.*;

public class numone40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1) {
			System.out.println("Usage : java");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		
		for (int i = 0; i <files.length; i++) {
			String fileName = files[i].getName();
			System.out.println( files[i].isDirectory() ? "["+fileName+"]":fileName);
			
		}
	}

}
