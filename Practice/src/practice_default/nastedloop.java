package practice_default;

public class nastedloop {

	public static void main(String[] args) {
		int k=1;
		for(int i=0; i<4; i++) // (vanjski loop) ovaj ce loop biti ispisan 4 puta
		{
		//	System.out.println(i);
			for(int j=1; j<=4-i;j++) //inner loop
			{	
				System.out.print( k);
				System.out.print("\t");
				k++;
			}
		System.out.println( "");
			/*1
1
2
3
finished
2
1
2
3
finished
3
1
2
3
finished
4
1
2
3
finished
*/
		}
	}

}
