package apiarraylist;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("john");
		a.add("morel");
		System.out.println(a);
		a.add(0, "student");
		System.out.println(a);
		/*a.remove(1);
		a.remove("morel");
		System.out.println(a); */
		System.out.println(a.get(2));
		//testing
		System.out.println(a.contains("john"));
		System.out.println(a.indexOf("john"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}

}
