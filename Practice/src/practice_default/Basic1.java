package practice_default;

public class Basic1 {
	
	public void getData()
	{
	   System.out.println("I am Fahir");	
	}
	

	public static void main(String[] args) {
		System.out.println("Test");
	 
		Methods m=new Methods();
        System.out.println(m.ValidateHeader());
        
        Basic1 b=new Basic1();
        b.getData();
	}

}
