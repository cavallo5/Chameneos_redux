package chameneos_redux;


/**
 * Initiator 
 * @author Vincenzo
 */

import chameneos_redux.Chameneos;

public class Initiator {
/**
 * Possibili colori di ogni chameneos usati per creare gli chameneos
*/
static Colore [] Colori = {Colore.GIALLO,Colore.BLU,Colore.ROSSO};
/**
 * Numero chameneos
 */
static int c=6; //numero charmeneos
/**
 * Numero viaggi di ogni chameneos
 */
static int numeroviaggi=2; //numero viaggi di ogni charmeneos
/**
 * Array di Chameneos
 */
static Chameneos[] GruppodiChameneos = new Chameneos[c];

public static void main( String args []) 
{
	CentroCommerciale myMall = new CentroCommerciale();
	//Creazione Chameneos
	for( int i =0; i < c;i++)
	{
		GruppodiChameneos[i] = new Chameneos(myMall, new IdChameneos(i), Colori[i%3], numeroviaggi);
	}
	//Avvio Charmeneos
 	for( int i =0; i<c;i++)
 	{
 		GruppodiChameneos[i].start();
	}
}
}

