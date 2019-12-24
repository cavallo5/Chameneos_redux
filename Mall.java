package chameneos;

public class Mall {
	private Colour AColour,BColour;
	private Boolean FirstCall =true;
	private boolean MustWait =false;


	public synchronized Colour Cooperation(IdChameneos x ,Colour C)
	{
		Colour result ;
		while(MustWait)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e){}
			}
		if(FirstCall)
		{
			AColour = C;
			FirstCall=false;
			while(!FirstCall)
			{
				try{
					wait();
					}
				catch(InterruptedException e){}
			}
				
			MustWait = false;
			result=BColour;
			notifyAll();
		}
		else
		{
			BColour = C; 
			result = AColour; 
			FirstCall = true ;
			MustWait = true;
		    notifyAll ();
		 }
		return result;
	}
}

