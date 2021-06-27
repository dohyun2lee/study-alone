class Tv {
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() {++channel;}
	void ChannelDown() {--channel;}
}

class SmartTv extends Tv {
	boolean caption;
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}


public class numfou4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true;
		stv.displayCaption("Hello, World");
	}

}

