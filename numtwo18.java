import java.util.*;

class Student {
	String name = " ";
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}


public class numtwo18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Student> map = new HashMap<>(); 

		map.put("ÀÚ¹Ù¿Õ", new Student("ÀÚ¹Ù¿Õ", 1, 1, 100, 100, 100));
		//Student s = map.get("ÀÚ¹Ù¿Õ");
		
		System.out.println(s.name);
		}
	}


