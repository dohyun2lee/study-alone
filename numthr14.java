import java.util.*;

public class numthr14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);
	}

}
 
class Person {
	String name;
	int age;
	
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		Person p = (Person)obj;
		return this.name.equals(p.name) && this.age==p.age;
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String toString() {
		return name + ":" +age;
		}
}




