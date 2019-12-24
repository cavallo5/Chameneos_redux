package chameneos;

public class Chameneos extends Thread{
	private Mall mall;
	private IdChameneos id;
	private Colour myColour, otherColour;
	private int numeriviaggi;
	public int contatore=0;
	 
	public Chameneos(Mall m ,IdChameneos id , Colour c, int d) 
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
		Message("sto avendo una mutazione dopo aver incontrato un'altra creatura");
		otherColour = mall.Cooperation(id , myColour); 
		myColour = myColour.ComplementaryColour(otherColour);
		Message("ho effettuato la mutazione, torno a casa");
	}
public void run() {
	while(true && contatore<=numeriviaggi) 
	{
		EatingHoneysuckleAndTraining();
		GoingToTheMall();
		Mutating();
		contatore++;
	}
}

}
