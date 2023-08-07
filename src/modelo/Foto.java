package modelo;

public class Foto extends Contenido {
    
    public int alto;
    public int ancho;
    
    public Foto (int p, String a, int alto, int ancho){
        super(p,a);
        this.alto=alto;
        this.ancho=ancho;
    }
    
    public void imprimir(){
         System.out.print("Imprimiendo  la foto " + this.getArchivo() + "\n");

    }
    
    @Override
    public void visualizar() {
        System.out.print("El peso de la foto " + this.getArchivo() + " es " + this.getPeso() + ", ademas sus dimensiones son " + this.getAlto() + " x " + this.getAncho() + "\n");
    }

    private int getAlto() {
        return this.alto;
    }

    private int getAncho() {
        return this.ancho;
    }

    @Override
    public Contenido copia() {
        Foto copia = new Foto (this.getPeso(), this.getArchivo(), this.getAlto(), this.getAncho());
        
        for (Usuario usu_iter : this.getLikes()){
            copia.addUsuario(usu_iter);
        }
        return copia;
    }

    @Override
    public String getTipo() {
        return "Foto";
    }
    
}
