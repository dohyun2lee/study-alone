
public class numtwo25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread("x");
		MyThread t2 = new MyThread("xx");
		MyThread t3 = new MyThread("xxx");
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(2000);
			t1.suspend();
			Thread.sleep(2000);
			t2.suspend();
			Thread.sleep(3000);
			t1.resume();
			Thread.sleep(3000);
			t1.stop();
			t2.stop();
			Thread.sleep(2000);
			t3.stop();
			
			} catch(InterruptedException e) {
		}

	}
}

class MyThread implements Runnable {
	boolean suspended = false;
	boolean stopped = false;
	
	Thread t ;
	
	MyThread(String name){
		t = new Thread(this, name);
	}
	
	void start() {
		t.start();
	}
	
	void stop() {
		stopped = true;
	}
	
	void suspend() {
		suspended = true;
	}
	
	void resume() {
		suspended = false;
	}
	
	public void run() {
		while(!stopped) {
			if(!suspended)
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
				} catch(InterruptedException e) {
			}
		}		
	}
}

