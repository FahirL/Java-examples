package constructor;

public class ConstructorDemo { 
   //Default
	public ConstructorDemo()
	{ 
		System.out.println("I am in the constructor");
		System.out.println("I am in the constructor lecture 1");
		
	} 
	//Parameterized constructor
	
	public ConstructorDemo (int a, int b)
	{ 
		System.out.println("I am in the parameterized constructor");
		int c=a+b;
		System.out.println(c);
	}
	public ConstructorDemo(String str) { 
		System.out.println(str);
	}
	public void getdata()
	{ 
		System.out.println("I am the method");
	}
	//will not return values
	//name of constructor shold be the class name
	
	public static void main(String[] args) {
		ConstructorDemo cd=new ConstructorDemo();
		ConstructorDemo cds= new ConstructorDemo("hello");
		ConstructorDemo c=new ConstructorDemo(4,5);
		//compiler will call implicit constructor if you have not defined constructor
		//when ever you create an object constructor is called
	}

}