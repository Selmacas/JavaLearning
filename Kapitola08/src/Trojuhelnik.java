
public class Trojuhelnik {

	/**
	 * @param args
	 */
	
	int stranaA=0;
	int stranaB=0;
	int stranaC=0;
	
	double obvod()
	{
		return( stranaA + stranaB + stranaC);
	}
	
	boolean jePravouhly()
	{
		if( stranaA > stranaB && stranaA > stranaC)
		{
			return( (stranaA*stranaA)==(stranaB*stranaB + stranaC*stranaC) );
		}
		else if(stranaB > stranaC)
		{
			return( (stranaB*stranaB)==(stranaA*stranaA + stranaC*stranaC) );
		}
		else
		{
			return( (stranaC*stranaC)==(stranaB*stranaB + stranaA*stranaA) );
		}
	}
	
	Trojuhelnik(int a, int b, int c)
	{
		if( a <= (b+c) && b <= (a+c) && c <= (a+b) )
		{
			stranaA = a;
			stranaB = b;
			stranaC = c;
		}
		else
		{
			stranaA = 0;
			stranaB = 0;
			stranaC = 0;
		}		
	}
	
	Trojuhelnik(int jednaStrana)
	{
		stranaA = jednaStrana;
		stranaB = jednaStrana;
		stranaC = jednaStrana;
	}
	
	Trojuhelnik(int jednaStrana, int druhaStrana)
	{
		stranaA = jednaStrana;
		stranaB = druhaStrana;
		stranaC = (2*jednaStrana < druhaStrana) ? druhaStrana : jednaStrana;
	}
	
	String printInfo()
	{
		return( "Strana a = " + stranaA + ", Strana b = " + stranaB + ", Strana c = " + stranaC + ", Obvod = " + obvod() + ", Pravouhly? " + jePravouhly());
	}
	
	public static void main(String[] args) 
	{
		Trojuhelnik t1 = new Trojuhelnik(5,3,4);
		Trojuhelnik t2 = new Trojuhelnik(5);
		Trojuhelnik t3 = new Trojuhelnik(10, 1);
		
		System.out.println(t1.printInfo());
		System.out.println(t2.printInfo());
		System.out.println(t3.printInfo());

	}

}
