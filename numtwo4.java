
public class numtwo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은" +c1.kind+ " "+c1.number+"이고,"+c1.width+","+c1.height+"의 크기를 가졌다.");
		System.out.println("c2은" +c2.kind+ " "+c2.number+"이고,"+c2.width+","+c2.height+"의 크기를 가졌다.");
		System.out.println("c1의 크기를 변경합니다.");
	
		c1.width = 50;
		c1.height= 80;
		
	}

}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
