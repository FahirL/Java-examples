package staticnonstatic;

public class StaticVar {
	
	String name; //instance variables
	String address;
	
	static String city; // class var
	static int i;
	static {
		city="Amsterdam";
		i=0;
	}
	
	StaticVar(String name, String adress) {
		this.name=name;
		this.address=adress;
		i++;
		System.out.println(i);
	}
	public void getAddress()
	{
		System.out.println(address+" "+city);
	}
	public static void getCity()
	{
		System.out.println(city);
	}

	public static void main(String[] args) {
	StaticVar obj= new StaticVar("Bob","London");
	StaticVar obj1= new StaticVar("John","Bern");
	StaticVar obj2= new StaticVar("John", "Bern");
	obj.getAddress();
	obj1.getAddress();
	StaticVar.getCity();
    StaticVar.i=4;
    obj.address="XYZ";
	
	

	}

}
