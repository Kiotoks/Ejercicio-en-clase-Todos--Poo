

package clase_java_entre_todos;

public class Camperas extends Producto {
    boolean rever;
    boolean imp;
    boolean cap;
    
    public Camperas(boolean rever, boolean imp, boolean cap, String color, String desc, double pcio, String marca){
        super(color, desc, pcio, marca);
        this.rever = rever;
        this.imp = imp;
        this.cap = cap;
    }

    public boolean isRever() {
        return rever;
    }

    public void setRever(boolean rever) {
        this.rever = rever;
    }

    public boolean isImp() {
        return imp;
    }

    public void setImp(boolean imp) {
        this.imp = imp;
    }

    public boolean isCap() {
        return cap;
    }

    public void setCap(boolean cap) {
        this.cap = cap;
    }
   
    
    
   public String toString(){
       String r = "";
       String i = "";
       String c = "";
        if (rever){
            r = "reversible";
        }
        if (imp){
            i = "impermeable";
        }
        if (cap){
            c = "con capucha";
        }
        return super.toString() + r + i + c ; 
   }
    
    
    
}
