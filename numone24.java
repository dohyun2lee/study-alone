
public class numone24 implements Runnable {
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new numone24());
		t.setDaemon(true);
		t.start();
		
		for(int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			System.out.println(i);
			
			if(i==4) autoSave = true;
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(2*1000);
			}
			catch(InterruptedException e) {
		}
			if(autoSave) autoSave();
	}
	
}
	public void autoSave() {
		System.out.println("�۾��� ����Ǿ����ϴ�.");
	}
}

