package chameneos_redux;

/**
 * Comportamento del centro commerciale 
 * @author Vincenzo Cavallo, Malamine Liviano D’Arcangelo Koumare
 */

public class CentroCommerciale {
	/**
	 * Colori degli chameneos che si devono incontrare 
	 */
	private Colore ColoreA,ColoreB;
	/**
	 * Semaforo per la mutua esclusione
	 */
	private boolean semaforo_call = true;
	/**
	 * Semaforo per la mutua esclusione
	 */
	private boolean semaforo_wait = false;


	/**
	  * Funzione che realizza la cooperazione tra 2 chameneos
	  * @param x IdChameneos
	  * @param C Colore
	  * @return il colore risultato
	 */
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

