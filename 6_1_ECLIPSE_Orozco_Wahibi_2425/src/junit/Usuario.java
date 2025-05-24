package junit;

import java.util.ArrayList;

public class Usuario {
	
	
	private ArrayList<Cancion> coleccionPermanente;
	public Usuario(ArrayList<Cancion> coleccionPermanente, ArrayList<Cancion> cacionesFavoritas, int puntos) {
		super();
		this.coleccionPermanente = coleccionPermanente;
		this.cacionesFavoritas = cacionesFavoritas;
		this.puntos = puntos;
	}

	public ArrayList<Cancion> getColeccionPermanente() {
		return coleccionPermanente;
	}

	public void setColeccionPermanente(ArrayList<Cancion> coleccionPermanente) {
		this.coleccionPermanente = coleccionPermanente;
	}

	private ArrayList<Cancion> cacionesFavoritas;
	private int puntos;

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public ArrayList<Cancion> getCancionesFavoritas() {
		return cacionesFavoritas;
	}

	public void setCacionesFavoritas(ArrayList<Cancion> cacionesFavoritas) {
		this.cacionesFavoritas = cacionesFavoritas;
	}
	
	
	
	

}
