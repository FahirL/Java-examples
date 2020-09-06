package interfaces;

public class Girl implements Children{

	@Override
	public void happy() {
		System.out.println("When is happy: Dance");
		
	}

	@Override
	public void sad() {
		System.out.println("When is sad: Cry");
		
	}

}
