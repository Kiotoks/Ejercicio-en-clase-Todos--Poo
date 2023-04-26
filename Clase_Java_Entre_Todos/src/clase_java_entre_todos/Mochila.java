package mochaila;

/*Fausto Pastor & Alejandro Bacca*/
public class Mochila extends Producto{
   private boolean matera;
   private boolean notebook;
   private  int tamaño; 

    public Mochila(boolean material, boolean notebook, int tamaño) {
        super(color, desc, precio, marca);
        this.matera = matera;
        this.notebook = notebook;
        this.tamaño = tamaño;
    }

    public boolean isMaterial() {
        return matera;
    }

    public void setMaterial(boolean material) {
        this.matera = material;
    }

    public boolean isNotebook() {
        return notebook;
    }

    public void setNotebook(boolean notebook) {
        this.notebook = notebook;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
   
   @Override
    public String toString(){
        String n = "";
        String m = "";
        if(this.notebook){
            n = "porta notebook";
        }
        if(this.matera){
            m = "es matera";
        }
        
        return super.toString()+ "matera: " + m + "notebbok: " + n + "tamaño: " + tamaño;
    }
}
