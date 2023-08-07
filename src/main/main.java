package main;

import controlador.Controlador;
import java.util.ArrayList;
import modelo.Contenido;
import modelo.Foto;
import modelo.Usuario;
import modelo.Video;
import vista.Vista;

public class main {

  //  public static void main(String[] args) {
        /*
        Foto foto1 = new Foto(5,"Carmen", 5,5);
        Video video1 = new Video (5, "Yo en la ducha", 3);
        
        Usuario manolo = new Usuario ("Manolo");
        Usuario paqui = new Usuario ("Paqui");
        Usuario nueva_cuenta_manolo = new Usuario (manolo);
        
        paqui.addLike(video1);
        
        manolo.addLike(video1);
        manolo.addLike(foto1);
        
        System.out.print(nueva_cuenta_manolo.getNombre() + "\n");
        //System.out.print(usuarioMasActivo().getNombre()+"\n"); //DUDA ME DEVUELVE EL ARCHIVO DELÑ CONSTR. POR DEFECTO
        manolo.contenidoMasPesado().visualizar();
        nueva_cuenta_manolo.contenidoMasPesado().visualizar();
       */
    public static void main(String[] args) {
        // a) 
        ArrayList<Contenido> contenidos = new ArrayList<>();
        
        contenidos.add(new Foto(100, "Paisaje",100, 100));
        contenidos.add(new Video(60, 50, "Baile"));
        
        for(Contenido c: contenidos)
            c.visualizar();
        
        // b) 
        ((Foto) contenidos.get(0)).imprimir();
        
        
        // c)
        Usuario usuario1 = new Usuario("usuario1");
        for(Contenido c: contenidos)
            usuario1.addLike(c);
        
        Usuario usuario2 = new Usuario(usuario1);
        
        // d)
//        System.out.println("Contenido mas pesado: " + usuario2.contenidoMasPesado().getPeso());
        

        // e) 
        Controlador controlador = new Controlador(contenidos);
        Vista vista = new Vista(controlador);
        controlador.setVista(vista);

        
    }  
 }
    
