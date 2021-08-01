import java.util.stream.Stream;

public class numone36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> intStream = Stream.iterate(1, n -> n +2);
		intStream.limit(10).forEach(System.out::println);
		
		
		Stream<Integer> oneStream = Stream.generate(()->1);
		oneStream.limit(10).forEach(System.out::println);
		}

}
