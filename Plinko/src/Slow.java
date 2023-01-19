

public class Slow {
	
	//number generator (1-3) for the three possible cups
	// left cup (25%) middle cup (50%) right cup (25%)
	//number generator (1-2) for left or right 
	//number generator (1-1) for going only left
	//number generator (2-2) for going only right
	//map out every single path that the ball could go and run
	//bets of only $10 every game
	//random number generator (0-1) if 0 then it goes immediately to the middle cup
	
	private Money money;
	public Slow() {
		money= new Money(10);
	}
	
	public Slow(int mun)
	{
		money= new Money(mun);
	}
	
	public void run() {
		
		for(int w=0; w<=5; w++)
		{
			int test1 =(int)(Math.random()*4);
			
			if(test1==0)
			{
				System.out.println("Pluto Cup:: YOU MADE $10");
				money.plutoCup();
				//balance=
			}
				
			if(test1==1 || test1==2)
				{
					System.out.println("Sun Cup:: YOU BROKE EVEN ");
					//balance=
				}
				
			if(test1==3)
				{
					System.out.println("Earth Cup:: YOU LOST $10");
					money.earthCup();
					//balance=
				}
		}
		money.end();
		}	
	}
	
	

