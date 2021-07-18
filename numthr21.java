
public class numthr21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.parentMethod();
	}
}

class Parent {
	void parentMethod() {
	}
}

class Child extends Parent {
	@Override
	@Deprecated
	void parentMethod() {
	}
}
	
