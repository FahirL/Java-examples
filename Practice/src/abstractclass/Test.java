package abstractclass;

public class Test {

	public static void main(String[] args) {
		RegularCustomer rc = new RegularCustomer();
		Strange s = new Strange();
		
		rc.calculateprice(500);
		s.calculateprice(500);
		
		System.out.println("Price product for regular customer is: " + rc.price);
        System.out.println("Price product for strange is: " + s.price);
	}

}
