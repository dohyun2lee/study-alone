import java.io.*;

public class numthr40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("Usage : java Directory");
			System.exit(0);
		}
		
		File dir = new File(args[0]);
		
		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
			System.exit(0);
		}
		
		File[] list = dir.listFiles();
		
		for(int i = 0; i < list.length; i++) {
			String fileName = list[i].getName();
			String newFileName = "0000" + fileName;
			newFileName = newFileName.substring(newFileName.length()-7);
			list[i].renameTo(new File(dir, newFileName));
		}
	}

}