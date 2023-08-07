package controlador;

import java.util.ArrayList;
import modelo.Contenido;
import vista.Vista;

public class Controlador {
    private int actual;
    private Vista vista;
    private ArrayList<Contenido> contenido;

    public Controlador(ArrayList<Contenido> contenido) {
        this.actual = 0;
        this.vista = null;
        this.contenido = contenido;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }
    
    public void cambiar(){       
        actual = (actual+1)%2;
    }

    public String getArchivo() {
        return contenido.get(actual).getArchivo();
    }

    public String getTipo() {
        // Reemplazamos el instanceof() ya que da pie a fallos
        return contenido.get(actual).getTipo();
    }
}
