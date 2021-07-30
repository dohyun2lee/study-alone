import java.io.*;
import java.util.stream.*;

public class numone33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File[] fileArr = {new File("Ex.java"), new File("Ex.bak"), 
				new File("Ex2.java"), new File("Ex"), new File("Ex.txt")
				};
		
		Stream<File> fileStream = Stream.of(fileArr);
		
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println);
		
		fileStream = Stream.of(fileArr);
		
		fileStream.map(File::getName)
		  .filter(s -> s.indexOf('.')!=-1) 
		  .peek(s->System.out.printf("filename=%s%n",s))
		  .map(s -> s.substring(s.indexOf('.')+1)) 
		  .map(String::toUpperCase)     
		  .distinct()                  
		  .forEach(System.out::print);  

	System.out.println();
	}

}
