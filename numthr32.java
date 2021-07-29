import java.util.Random;
import java.util.stream.IntStream;

public class numthr32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream intStream = new Random().ints(10, 5, 10);
		//intStream.limit(10);
		intStream.forEach(System.out::println);
	}
}

