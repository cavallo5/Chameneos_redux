package chameneos_redux;

public class CentroCommerciale {
	private Colore ColoreA,ColoreB;
	private boolean semaforo_call = true;
	private boolean semaforo_wait = false;


	public synchronized Colore Cooperazione(IdChameneos x ,Colore C)
	{
		Colore risultato ;
		while(semaforo_wait)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e){}
			}
		if(semaforo_call)
		{
			ColoreA = C;
			semaforo_call=false;
			while(!semaforo_call)
			{
				try{
					wait();
					}
				catch(InterruptedException e){}
			}
				
			semaforo_wait = false;
			risultato=ColoreB;
			notifyAll();
		}
		else
		{
			ColoreB = C; 
			risultato = ColoreA; 
			semaforo_call = true ;
			semaforo_wait = true;
		    notifyAll ();
		 }
		return risultato;
	}
}

