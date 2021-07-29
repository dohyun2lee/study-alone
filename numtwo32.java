import java.util.stream.Stream;

public class numtwo32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"a", "b", "c", "d"};
		Stream<String> strStream = Stream.of(new String[]{"a","b","c","d"});
		strStream.forEach(System.out::print);
				
	}

}
