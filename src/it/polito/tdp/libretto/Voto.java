package it.polito.tdp.libretto;

import java.time.*;

public class Voto {

	private int punti;
	private String nomeCorso;
	private LocalDate data;  // oggetti date e calender per gestire le date 
	
	
	public Voto(int punti, String nomeCorso, LocalDate data) {
		
		this.punti = punti;
		this.nomeCorso = nomeCorso;
		this.data = data;
	}
	
	public int getPunti() {
		return punti;
	}
	
	
	public void setPunti(int voto) {
		this.punti = voto;
	}
	
	
	public String getNomeCorso() {
		return nomeCorso;
	}
	
	
	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}
	
	
	public LocalDate getData() {
		return data;
	}
	
	
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return String.format("Voto [punti=%s, nomeCorso=%s, data=%s]", punti, nomeCorso, data);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeCorso == null) ? 0 : nomeCorso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {     //equals della classe voto richiama equals della classe stringa delego il confronto al metodo sottostante
		if (this == obj)
			return true;
		if (obj == null)   //controlli vari per vedere se sono null le varie cose
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		if (nomeCorso == null) {
			if (other.nomeCorso != null)
				return false;
		} else if (!nomeCorso.equals(other.nomeCorso))
			return false;
		return true;
	}
	
	
	
	
}
