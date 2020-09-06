package practice_default;

public class stringclass {

	public static void main(String[] args) {
		
		String a=new String("javatraining");
		
		System.out.println(a.charAt(4)); // t
		System.out.println(a.indexOf("a")); // 1
        System.out.println(a.substring(3, 6)); //atr
        System.out.println(a.substring(5)); //raining
        System.out.println(a.concat("fahir latovic")); //javatrainingfahir latovic
        
        //a.length()
        System.out.println(a.trim()); // javatraining (uklanja prazan prostor)
        System.out.println(a.toUpperCase()); // JAVATRAINING
        System.out.println(a.toLowerCase()); // javatraining
        //split
        String arr[]=a.split("t");
        System.out.println(arr[0]); // java 
        System.out.println(arr[1]); // raining
        System.out.println(a.replace("t", "s")); //javasraining
	}

}
