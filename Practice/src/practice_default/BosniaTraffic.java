package practice_default;
import practice_default.CentralTraffic;

public class BosniaTraffic implements CentralTraffic,ContinentalTraffic,FlyTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a= new BosniaTraffic();
		a.redStop();
        a.FlashYellow();
        a.greenGo();
        
	    BosniaTraffic at=new BosniaTraffic();
	    at.walkonsymbol();
	    ContinentalTraffic ct=new BosniaTraffic();
	    ct.Trainsymbol();
	    
	    FlyTraffic ft=new BosniaTraffic();
	    ft.FlySymbol();

	}


	@Override
	public void greenGo() {
		System.out.println("Green go implementation");
		
	}

	@Override
	public void redStop() {
		System.out.println("Red stop implementation");
		
	}
	public void walkonsymbol() {
		System.out.println("walking");
	}

	@Override
	public void FlashYellow() {
		System.out.println("Flash yellow implementation");
		
	}

	@Override
	public void Trainsymbol() {
		System.out.println("test");
	}


	@Override
	public void FlySymbol() {
		System.out.println("flying");
		
	}

}
