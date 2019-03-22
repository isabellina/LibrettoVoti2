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
	
	
	
	
}
