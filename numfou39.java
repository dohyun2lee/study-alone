import java.io.*;

public class numfou39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("c:\\jdk1.8\\work\\ch15\\Ex15_15.java");
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");

		System.out.println("��θ� ������ �����̸� - " + f.getName());
		System.out.println("Ȯ���ڸ� ������ �����̸� - "+ fileName.substring(0,pos));
		System.out.println("Ȯ���� - " + fileName.substring(pos+1));

		System.out.println("��θ� ������ �����̸� - " + f.getPath());
		System.out.println("������ ������             - " + f.getAbsolutePath());
		try {
			System.out.println("������ ���԰��             - " + f.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("������ ���� �ִ� ���丮 - " + f.getParent());
		System.out.println();
		System.out.println("File.pathSeparator - " + File.pathSeparator);
		System.out.println("File.pathSeparatorChar - " + File.pathSeparatorChar);
		System.out.println("File.separator - " + File.separator);
		System.out.println("File.separatorChar - " + File.separatorChar);
		System.out.println();
		System.out.println("user.dir="+System.getProperty("user.dir"));
		System.out.println("sun.boot.class.path=" + System.getProperty("sun.boot.class.path"));
	}

}
