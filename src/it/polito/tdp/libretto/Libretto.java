package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.*;

public class Libretto {
	
	private List<Voto> listaVoti ; //non definiamo se array o linked vogliamo essere il più generali possibile
	//velocità dal pv delle prestazioni diverse
	
	// è il riferimento che è nullo
	
	public Libretto() {
		this.listaVoti = new ArrayList<Voto>();  //chiunque dall'esterno non deve vedere se io ho usato linked o array
		
		// il riferimento c'è poi l'oggetto potrebbe essere null
	}

	/** interfacce più generali possibili implementazioni più specifiche rispetto al mio ziel **/
	
	
	public void add(int voto, String corso, LocalDate data) {
		
	}
	
	
	//è una soluzione migliore perchè se un domani qualcuno decide di modificare la struttura interna della classe voto il metodo sotto non è
	//da modificare quello sopra si
	
	public void add(Voto voto) {
		listaVoti.add(voto);
	}
	
}
