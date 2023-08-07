package modelo;

import java.util.ArrayList;

public abstract class Contenido {
    int peso;
    private String archivo;
    
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    
    public Contenido(int p){
        this.archivo="erroneo";
        this.peso=p;
    }
    
    public Contenido(int p, String a){
        this.peso=p;
        this.archivo=a;
    }
    
    public int getPeso(){
        return this.peso;
    }
    
    public ArrayList<Usuario> getLikes(){
        return usuarios;
    }
    
    public String getArchivo(){
        return this.archivo;
    }
    
    public void setPeso(int longitud){
        this.peso=longitud;
    }
    
    public void setArchivo(){
        
    }
    
    public int numeroLikes(){
        return usuarios.size();
    }
    
    public void addUsuario(Usuario user){
        usuarios.add(user);
    }
    
    public abstract void visualizar();
    
    public abstract Contenido copia();
    
    public abstract String getTipo();
}
