package interfaces;

public class Boy implements Children {

	@Override
	public void happy() {
		System.out.println("When is happy: Play game");
		
	}

	@Override
	public void sad() {
		System.out.println("When is sad: Sleeping");
		
	}

}
