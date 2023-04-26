package clase_java_entre_todos;
/**
 *
 * Jeremias Leiva, Josue Bieber
 */
public class Zapatilla extends Producto{
    int talle;
    String uso;
    
    

    public Zapatilla(String color, String desc, double pcio, String marca, int talle, String uso){
        super(color, desc, pcio, marca);
        this.talle = talle;
        this.uso = uso;

     }

    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
    
    public String toString(){
        String datos = super.toString() +" "+ talle +" "+ uso;
    return datos;
    
   }

}

