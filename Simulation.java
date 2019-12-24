package chameneos;

import chameneos.Chameneos;

public class Simulation {
	static Colour [] TheColours =
		{
			Colour.YELLOW,
        	Colour.BLUE, 
        	Colour.RED, 
        	//Colour.BLUE,
        	//Colour.YELLOW, 
        	//sColour.BLUE
    	};
static int c=20; //numero charmeneos
static int numeroviaggi=5;
static Chameneos[] TheChameneos = new Chameneos[c];

public static void main( String args []) 
{
	System.out.println(TheColours.length);
	Mall myMall = new Mall();
	for( int i =0; i < c;i++)
	{
		TheChameneos[i] = new Chameneos(myMall, new IdChameneos(i), TheColours[i%3], numeroviaggi);
	}
 	for( int i =0; i<20;i++)
 	{
 		 TheChameneos[i].start();
	}
}
}

