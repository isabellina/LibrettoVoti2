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
	
	
	/**
	 * ritorna true nel caso normale false se non è riuscito ad aggiungere il voto
	 * @param voto
	 */
	
	public boolean add(Voto voto) {
		if(!this.esisteGiaVoto(voto) && !this.votoConflitto(voto)) {
		listaVoti.add(voto);
		return true;
		}
		else 
			return false;
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
	 /**	for(Voto v: listaVoti) {
			if(v.getNomeCorso().equals(nomeEsame)) {  //meglio equals non mi serve un ordinamento naturale
				return v;
			}                            invece di scandirmi tutta la lista ci sono modi più semplici
		}
		return null;  **/
		Voto voto = new Voto(0,nomeEsame,null);  //ho costruito un oggetto voto incompleto ma mi serve solo per la ricerca
	    int pos =	this.listaVoti.indexOf(voto);
	    if(pos==-1) {
	    	return null;
	    }
	    else {
	    	return this.listaVoti.get(pos);    // più o meno stesse riga ma abbiamo utilizzato interfacce senza andare a pescare a mano
	    }
		
	}
	
	
	 // ritorna  true se ha trovato corso e punteggio uguale
	// false se non l'ha trovato o l'ha trovato con un voto diverso
	
	public boolean esisteGiaVoto(Voto v) {   //per vedere se esiste un voto con uguale corso e stesso punteggio
		 
		int pos = this.listaVoti.indexOf(v);
		if(pos == -1) {
			return false;
		}
		else 
			return (v.getPunti()== this.listaVoti.get(pos).getPunti());
		
		/**      Voto trovato = this.cercaEsame(v.getNomeCorso())   ;    
		          if(trovato==null)  {
		        	  return false;
		          }
		          if(trovato.getPunti()==v.getPunti()) {
		        	  return true;
		          }
		          else {
		        	  return false;
		          }  */
	}
	
	
	// mi dice se il voto v e' in conflitto con i voti precedenti
	// se il voto non esiste non c'è conflitto
	// se esiste e ha punteggio diverso c'è conflitto
	// restituisce true se il voto esiste e ha punteggio diverso flase se non esiste ppure se esiste e ha lo stesso punteggio
	
	public boolean votoConflitto(Voto v) {
		int pos = this.listaVoti.indexOf(v);
		if(pos == -1) {
			return false;
		}
		else 
			return (v.getPunti()!= this.listaVoti.get(pos).getPunti());
	}
	
	public String toString() {
		return this.listaVoti.toString();
	}
	
}
