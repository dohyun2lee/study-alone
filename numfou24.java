import javax.swing.JOptionPane;

class numfou24 {
	public static void main(String[] args) throws Exception {
		Thread11 th1 = new Thread11();
		th1.start();

		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���."); 
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		th1.interrupt();  
		System.out.println("isInterrupted():"+ th1.isInterrupted()); 
	}
}

class Thread11 extends Thread {
	public void run() {
		int i = 10;

		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0;x<2500000000L;x++); 
		}
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	} 
}