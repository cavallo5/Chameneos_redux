package chameneos;

import chameneos.Chameneos;

public class Simulation {
	static Colore [] TheColours =
		{
			Colore.GIALLO,
        	Colore.BLU, 
        	Colore.ROSSO, 
        	//Colour.BLUE,
        	//Colour.YELLOW, 
        	//sColour.BLUE
    	};
static int c=6; //numero charmeneos
static int numeroviaggi=4;
static Chameneos[] TheChameneos = new Chameneos[c];

public static void main( String args []) 
{
	Mall myMall = new Mall();
	for( int i =0; i < c;i++)
	{
		TheChameneos[i] = new Chameneos(myMall, new IdChameneos(i), TheColours[i%3], numeroviaggi);
	}
 	for( int i =0; i<c;i++)
 	{
 		 TheChameneos[i].start();
	}
}
}

