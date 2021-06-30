
class Card {
	String kind;
	int number;
	
	Card() {
		this("Spade", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return "king :" +kind+ ", number :"+number;
	}
}

public class numfou6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card();
		Card c2 = new Card("Heart", 10);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
