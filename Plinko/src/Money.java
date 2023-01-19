
public class Money {
	private int mula;
	private int begin;
	
	public Money(int start)
	{
		mula = start;
		begin=start;
	}
	
	/*public void earthCup() 
	{		
		mula=-10;
		mula=+10;
	}*/
	
	public void plutoCup()
	{
		mula=+10;
	}
	
	public void earthCup()
	{
		mula=-10;
	}
	public void end() {
		System.out.println(mula-begin);
	}
	
}
