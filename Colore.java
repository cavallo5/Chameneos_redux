package chameneos;

public class Colore
{
	public int internalColour;
	
	private static final int intblu = 0 ;
	private static final int introsso = 1 ;
	private static final int intgiallo = 2; 
	public static final Colore BLU = new Colore(intblu ); 
	public static final Colore ROSSO = new Colore(introsso );
	public static final Colore GIALLO = new Colore(intgiallo); 
	
	private Colore( int value ) 
	{
		internalColour = value %3 ;
	}
	
	public Colore ComplementaryColour(Colore C) {
		if ( internalColour == C. internalColour )
		{ 
			return new Colore(internalColour ); 
		}
		else return new Colore( 3 - internalColour - C.internalColour ); 
	}
	
	public String toString (){
		if ( internalColour == intblu )
		{
			return "BLU";
		}
		else if ( internalColour == introsso ) 
		{
			return "ROSSO"; 
		}
		else //intgiallo
		{
			return "GIALLO"; 
		}
	}
}
