package superkeyword;

public class ChildDemo extends ParentDemo {
    String name="Academy";
    
    public ChildDemo()
    {
    	super();
    	System.out.println("child class constructor");
    }
    public void getStringdata()
    {
    	System.out.println(name);
    	System.out.println(super.name);
    }
    public void getData() {
    	super.getData();
    	System.out.println("I am child class");
    }
	public static void main(String[] args) {
	 ChildDemo cd= new ChildDemo();
	 cd.getStringdata();
	 cd.getData();
	}

}
