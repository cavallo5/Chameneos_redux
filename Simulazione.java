package chameneos;

import chameneos.Chameneos;

public class Simulazione {
static Colore [] Colori = {Colore.GIALLO,Colore.BLU,Colore.ROSSO};
	
static int c=6; //numero charmeneos
static int numeroviaggi=4; //numero viaggi di ogni charmeneos
static Chameneos[] GruppodiCharmeneos = new Chameneos[c];

public static void main( String args []) 
{
	CentroCommerciale myMall = new CentroCommerciale();
	//Creazione Charmeneos
	for( int i =0; i < c;i++)
	{
		GruppodiCharmeneos[i] = new Chameneos(myMall, new IdChameneos(i), Colori[i%3], numeroviaggi);
	}
	//Avvio Charmeneos
 	for( int i =0; i<c;i++)
 	{
 		GruppodiCharmeneos[i].start();
	}
}
}

