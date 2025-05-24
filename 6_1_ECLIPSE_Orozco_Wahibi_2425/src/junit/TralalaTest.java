package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TralalaTest {


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
	void mensaje100() {

		Usuario usu=new Usuario(per(), fav(), 80);
		Tralala t1 = new Tralala();
		t1.canjearCanciones(usu);
		assertEquals(4, usu.getCancionesFavoritas().size());

	}
	
	
	@Test
	void restaPuntos() {

		Usuario usu=new Usuario(per(), fav(), 120);
		Tralala t1 = new Tralala();
		t1.canjearCanciones(usu);
		//assertTrue(120>usu.getPuntos(), "Se restan puntos." );
		assertEquals(usu.getPuntos(), 20);

	}
	
	
	@Test
	void favoritasVacia() {

		List <Cancion> favor=new ArrayList<Cancion>();
		
		//Usuario usu=new Usuario(per(), favor, 120);
		Tralala t1 = new Tralala();
		//t1.canjearCanciones(usu);
		Cancion resultado = t1.seleccionarCancion(favor);
		
		assertNull(resultado);
		

	}
	
	@Test
	void canjearCancion() {

		ArrayList <Cancion> favor=new ArrayList<Cancion>();
		
		favor.add(new Cancion("A"));
		favor.add(new Cancion("B"));
		favor.add(new Cancion("B"));
		
		Usuario usu=new Usuario(per(), favor, 200);
		Tralala t1 = new Tralala();
		t1.canjearCanciones(usu);
		
		assertEquals(usu.getColeccionPermanente().size(),6);
	}
	
	@Test
	void caminoCompleto() {

		Usuario usu=new Usuario(per(), fav(), 400);
		Tralala t1 = new Tralala();
		t1.canjearCanciones(usu);
		
		assertEquals(0, usu.getCancionesFavoritas().size());
		assertEquals(8, usu.getColeccionPermanente().size());
	}
	
	@Test
	void puntos100() {
		Usuario usu = new Usuario(per(), fav(), 100);
	    Tralala t1 = new Tralala();
	    t1.canjearCanciones(usu);

	    assertEquals(3, usu.getCancionesFavoritas().size());
	    assertEquals(5, usu.getColeccionPermanente().size());
		
	}
	
	@Test
	void permanenteVacio() {
		ArrayList<Cancion> perma=new ArrayList<Cancion>();
		
		Usuario usu = new Usuario(perma, fav(), 100);
	    //Tralala t1 = new Tralala();
	    //t1.canjearCanciones(usu);

	   assertEquals(usu.getColeccionPermanente().size(),0);
		
	}
	

}
