package inheritance;

public class ChildClass extends ParentClass{

	public void engine()
	{
		System.out.println("new engine");
	}
	public void colour()
	{
		System.out.println(colour);
	}
	public static void main(String[] args) {
	ChildClass cc=new ChildClass();
	cc.colour();
    
	}

}
