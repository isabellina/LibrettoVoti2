package it.polito.tdp.libretto;

import java.time.*;

public class Voto {

	private int voto;
	private String nomeCorso;
	private LocalDate data;  // oggetti date e calender per gestire le date 
	
	
	public Voto(int voto, String nomeCorso, LocalDate data) {
		
		this.voto = voto;
		this.nomeCorso = nomeCorso;
		this.data = data;
	}
	
	public int getVoto() {
		return voto;
	}
	
	
	public void setVoto(int voto) {
		this.voto = voto;
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
		return String.format("Voto [voto=%s, nomeCorso=%s, data=%s]", voto, nomeCorso, data);
	}
	
	
	
	
}
