public class numfou22 {
	static long startTime = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread5 t1 = new Thread5();
		t1.start();
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 300; i++) 
			System.out.printf("%s", new String("-"));
		
		System.out.print("소요시간1 : "  +(System.currentTimeMillis()-numfou22.startTime));
		
	}

}

class Thread5 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) 
			System.out.printf("%s", new String("|"));
		
		System.out.print("소요시간2 : "  +(System.currentTimeMillis()-numfou22.startTime));
		
	}
}

