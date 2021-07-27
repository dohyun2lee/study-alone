class numtwo24 {
	public static void main(String args[]) {
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		th1.start(); th2.start();

		try {
			th1.sleep(2000);	
		} catch(InterruptedException e) {}

		System.out.print("<<main ����>>");
	} 
}

class Thread1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) System.out.print("-");
		System.out.print("<<th1 ����>>");
	} 
}

class Thread2 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) System.out.print("|");
		System.out.print("<<th2 ����>>");
	} 
}