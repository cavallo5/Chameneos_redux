package chameneos_redux;

public class Chameneos extends Thread{
	private CentroCommerciale mall;
	private IdChameneos id;
	private Colore coloreA, coloreB;
	private int numeroviaggi;
	public int contatoreviaggi;
	 
	public Chameneos(CentroCommerciale m ,IdChameneos id , Colore c, int d) 
	{
		this.mall=m;
		this.id=id; 
		this.coloreA=c;
		this.numeroviaggi=d;
	}
	private void Messaggio(String Mess) 
	{
		System.out. println ( "(" + id . toString () + ") Sono " +
		coloreA.toString () + " e " + Mess);
	}
	private void Riposo()
	{
		Messaggio("sono a casa");
	}
	private void Vadoalcentrocommerciale() 
	{
		Messaggio("vado nel centro commerciale");
	}
	private void Mutazione()
	{
		this.coloreB = mall.Cooperazione(id , coloreA); 
		Messaggio("sto avendo una mutazione dopo aver incontrato un'altra creatura di colore "+coloreB);
		this.coloreA = coloreA.Complementare(coloreB);
		Messaggio("torno a casa dopo aver fatto la mutazione");
	}
public void run() {
	contatoreviaggi=0;
	while(true && contatoreviaggi<numeroviaggi) 
	{
		Riposo();
		Vadoalcentrocommerciale();
		Mutazione();
		contatoreviaggi++;
	}
}

}
