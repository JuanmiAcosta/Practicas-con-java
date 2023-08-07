package modelo;

public class Video extends Contenido {
    private int duracion;
    
    public Video (int p, int dura, String a){
        super(p,a);
        this.duracion=dura;
    }
    
    @Override
    public void visualizar() {
        System.out.print("El peso del video  " + this.getArchivo() + " es " + this.getPeso() + ", ademas su duracion es de " + this.getDuracion()+ "\n");
    }
    
      @Override
    public int getPeso(){
        return (this.duracion * this.peso);
    }

    private int getDuracion() {
        return this.duracion;
    }

    @Override
    public Contenido copia() {
        Video copia = new Video (this.getPeso(), this.getDuracion(), this.getArchivo());
        
         for(Usuario usu: this.getLikes()){
            copia.addUsuario(usu);
        }
        
        return copia;
    }

    @Override
    public String getTipo() {
        return "Vídeo";
    }
    
}
