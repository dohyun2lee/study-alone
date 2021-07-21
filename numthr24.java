class numthr24 {
	public static void main(String args[]) {
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		th1.start(); th2.start();

		delay(3*1000); 
		System.out.print("<<main 종료>>");
	}
	
	static void delay(long millis) {
		try {
			Thread.sleep(millis);
		}catch(InterruptedException e) {}
}

static class Thread1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) System.out.print("-");
		System.out.print("<<th1 종료>>");
	} 
}

static class Thread2 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) System.out.print("|");
		System.out.print("<<th2 종료>>");
	}
}
}

