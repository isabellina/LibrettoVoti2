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
	
	
	// ci sono diversi metodi per stampare i voti uguali a 25 ma conviene farlo con una lista perchè poi dovremo creare un'interfaccia grafica
	
	public List<Voto> cercaVoti(int punti){
		List<Voto> result = new ArrayList<Voto>();
		for(Voto v : listaVoti) {
			if(v.getPunti()==punti) {
				result.add(v);        //non sono nuovi oggetti sto riusando oggetti che già ho, copio solo il riferimento all'indirizzo di memoria
			}
		}
		return result;
		
	}
	
	public Voto cercaEsame(String nomeEsame) {
		for(Voto v: listaVoti) {
			if(v.getNomeCorso().equals(nomeEsame)) {  //meglio equals non mi serve un ordinamento naturale
				return v;
			}
		}
		return null;
	}
	
}
