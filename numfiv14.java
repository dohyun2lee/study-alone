import java.util.HashSet;
import java.util.Iterator;

public class numfiv14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet setA   = new HashSet();
		HashSet setB   = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();

		setA.add("1");	 setA.add("2");  setA.add("3");
		setA.add("4");  setA.add("5");
		System.out.println("A = "+setA);

		setB.add("4");	 setB.add("5");  setB.add("6");		
      setB.add("7");  setB.add("8");
		System.out.println("B = "+setB);

		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp))
				setKyo.add(tmp);
		}
		// = setA.retainAll(setB);

		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))
				setCha.add(tmp);
		}
		// = setA.removeAll(setB);
		
		it = setA.iterator();
		while(it.hasNext())
			setHab.add(it.next());

		it = setB.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		// = setA.addAll(setB);

		System.out.println("A �� B = " + setKyo);  
		System.out.println("A U B = " + setHab);  
		System.out.println("A - B = " + setCha); 
	}

}
