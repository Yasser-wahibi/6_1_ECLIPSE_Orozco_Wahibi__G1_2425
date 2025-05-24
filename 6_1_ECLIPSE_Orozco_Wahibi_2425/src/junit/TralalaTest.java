package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TralalaTest {

	@BeforeAll
	public ArrayList<Cancion> per(){
		ArrayList<Cancion> permanente= new ArrayList<Cancion>();
		
		Cancion c1 = new Cancion("Despacito");
		Cancion c2 = new Cancion("Minero");
		Cancion c3 = new Cancion("Take Over");
		Cancion c4 = new Cancion("Macarena");
		
		permanente.add(c1);
		permanente.add(c2);
		permanente.add(c3);
		permanente.add(c4);
		
		

		
		return permanente;
	};
	
	@BeforeAll
	public ArrayList<Cancion> fav(){
		ArrayList<Cancion> favoritas= new ArrayList<Cancion>();
		
		Cancion c5 = new Cancion("Despacito2 REMIX ft.Jose");
		Cancion c6 = new Cancion("Minero2 REMIX ft.Yasser,Jose");
		Cancion c7 = new Cancion("Take Over2 REMIX ft.Yasser");
		Cancion c8 = new Cancion("Macarena2 REMIX ft.DJTotote");
		
		favoritas.add(c5);
		favoritas.add(c6);
		favoritas.add(c7);
		favoritas.add(c8);
		

		return favoritas;
	};
	
	
	
	
	@Test
	void testCanjearCanciones() {

		
		

		
		
		
		Usuario usu=new Usuario(per(), fav(), 80);
		
		
		
	}

}
