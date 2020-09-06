package hashset;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet treest, linkedhashset implements set interface
		//does not accept duplicate values
		//there is no quarantee elements stored in sequential order.. random order
		
		HashSet<String> hs=new HashSet<String> ();
		hs.add("USA");
        hs.add("UK");
        hs.add("Germany");
        hs.add("Germany");
		System.out.println(hs);
		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		hs.size();
		
		Iterator<String> i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
