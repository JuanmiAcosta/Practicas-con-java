package modelo;

import java.util.ArrayList;

public class Usuario {
    static private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    private String nombre;
    
    private ArrayList<Contenido> contenido = new ArrayList<Contenido>();
    
    public Usuario(){
        this.nombre="Sus";
        Usuario.usuarios.add(this); 
    }
    
    public Usuario(String n){
        this.nombre=n;
        Usuario.usuarios.add(this);
    }
    
    public Usuario (Usuario other){ //COPIA PROFUNDA
        this.nombre=other.getNombre();
        
        for (Contenido con_iter : contenido){
            Contenido nuevo = con_iter.copia();
            this.contenido.add(nuevo);
        }
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String n){
        this.nombre=n;
    }
    
    public ArrayList<Contenido> getLikes(){
        return contenido;
    }
    
    public void addLike(Contenido like){
        contenido.add(like);
    }
    
    static public Usuario usuarioMasActivo(){
        Usuario user_a_devolver = new Usuario();
        for (Usuario user_iter : usuarios){
            if (user_iter.getLikes().size() > user_a_devolver.getLikes().size()){
                user_a_devolver=user_iter;
            }
        }
        return user_a_devolver;
    }
    
    public Contenido contenidoMasPesado(){
        Contenido copia = null;
        int peso = -1;
        ArrayList<Contenido> likes = this.getLikes();
        for (Contenido cont_iter : likes){
            int peso_act = cont_iter.getPeso();
            if ( peso_act > peso ){
                 copia = cont_iter;          
            }
        }
        return copia;
    }
    
    
}
