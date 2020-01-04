package chameneos_redux;

public class Chameneos extends Thread{
	/**
	 * Centro commerciale 
	 */
	private CentroCommerciale centrocommerciale;
	/**
	 * IdChameneos per identificare gli chameneos
	 */
	private IdChameneos id;
	/**
	  * Variabili d'appoggio
	 */
	private Colore coloreA, coloreB;
	/**
	 * Intero che identifica il numero di viaggi che deve effettuare ogni chameneos
	 */
	private int numeroviaggi;
	/**
	 * Contatore dei viaggi dello chameneos 
	 */
	public int contatoreviaggi;
	/**
	 * Variabili per il calcolo dell'elapsed time
	*/
	long start_time, end_time, time_used=0;
	 
	/*
	 *   Costruttore
	 *   @param m CentroCommerciale
	 *   @param id IdChameneos
	 *   @param c Colore
	 *   @param d int
	*/
	public Chameneos(CentroCommerciale m ,IdChameneos id , Colore c, int d) 
	{
		this.centrocommerciale=m;
		this.id=id; 
		this.coloreA=c;
		this.numeroviaggi=d;
	}
	
	/**
	  * Funzione che mi realizza un output leggibile
	  * @param Mess contenuto del messaggio
	 */
	private void Messaggio(String Mess) 
	{
		System.out. println ( "(" + id . toString () + ") Sono " +
		coloreA.toString () + " e " + Mess);
	}
	/**
	  * Funzione che astrae il comportamento di uno chameneos rimasto a casa
	 */
	private void Riposo()
	{
		Messaggio("sono a casa");
	}
	/**
	  * Funzione che astrae il comportamento di uno chameneos che va al centro commerciale
	 */
	private void Vadoalcentrocommerciale() 
	{
		Messaggio("vado nel centro commerciale");
	}
	/**
	  * Funzione che astrae il comportamento di uno chameneos che effettua la mutazione dopo aver incontrato uno chameneos
	 */
	private void Mutazione()
	{
		this.coloreB = centrocommerciale.Cooperazione(id , coloreA); 
		Messaggio("sto avendo una mutazione dopo aver incontrato un'altra creatura di colore "+coloreB);
		this.coloreA = coloreA.Complementare(coloreB);
		Messaggio("torno a casa dopo aver fatto la mutazione");
	}
	
	/**
	  * Esecuzione dello chameneos
	 */
	public void run() {
	contatoreviaggi=0;
    start_time=System.nanoTime(); //tempo in ns
	while(contatoreviaggi<numeroviaggi)  //Ciclo di vita dello chameneos
	{
		Riposo();
		Vadoalcentrocommerciale();
		Mutazione();
		contatoreviaggi++;
	}
    end_time= System.nanoTime(); //tempo finale in ns 
    time_used= (long) ((end_time - start_time)/1000F); //tempo impiegato in 􏱇µs 
    Messaggio("ho impiegato: "+time_used+" ns");
    }
}
