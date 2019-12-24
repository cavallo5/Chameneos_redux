package chameneos;

public class Mall {
	private Colore AColour,BColour;
	private Boolean FirstCall =true;
	private boolean MustWait =false;


	public synchronized Colore Cooperation(IdChameneos x ,Colore C)
	{
		Colore result ;
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

