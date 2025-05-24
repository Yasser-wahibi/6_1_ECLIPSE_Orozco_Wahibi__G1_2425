package Tralala;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nickname;

    private String contraseña;

    private String correo;

    private String biografia;

    private String metodoPago;

    private int puntos;

    public List<Usuario> usuario = new ArrayList<Usuario> ();

    public List<Pagos> pagos = new ArrayList<Pagos> ();

    public List<Cancion> cancion = new ArrayList<Cancion> ();

    public List<Cancion> permamente = new ArrayList<Cancion> ();

    public List<Cancion> favorita = new ArrayList<Cancion> ();

    public void verPuntos() {
    }

    public void reproducirRecomendacion() {
    }

    public void cangearPuntos() {
    }

    public void restarPuntos() {
    }

    public void verificarPuntos() {
    }

}
