package chameneos;

public class Chameneos extends Thread{
	private Mall mall;
	private IdChameneos id;
	private Colore myColour, otherColour;
	private int numeriviaggi;
	public int contatore;
	 
	public Chameneos(Mall m ,IdChameneos id , Colore c, int d) 
	{
		this.mall=m;
		this.id=id; 
		this.myColour=c;
		this.numeriviaggi=d;
	}
	private void Message(String Mess) 
	{
		System.out. println ( "(" + id . toString () + ") Sono " +
		myColour.toString () + " e " + Mess);
	}
	private void EatingHoneysuckleAndTraining()
	{
		Message("sono a casa");
	}
	private void GoingToTheMall() 
	{
		Message("vado nel centro commerciale");
	}
	private void Mutating()
	{
		this.otherColour = mall.Cooperation(id , myColour); 
		Message("sto avendo una mutazione dopo aver incontrato un'altra creatura di colore "+otherColour);
		this.myColour = myColour.ComplementaryColour(otherColour);
		Message("torno a casa dopo aver fatto la mutazione");
	}
public void run() {
	contatore=0;
	while(true && contatore<numeriviaggi) 
	{
		EatingHoneysuckleAndTraining();
		GoingToTheMall();
		Mutating();
		contatore++;
	}
}

}
