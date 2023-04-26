
package com.mycompany.remera;

public class Remera extends Producto {
    
    private char talle;
    private String manga;
    private String cuello;
    private String detalle;
    
    
    public Remera(char talle, String manga, String cuello, String detalle, String color, String desc, double precio, String marca) {
        super(color, desc, marca, precio);
        this.talle = talle;
        this.manga = manga;
        this.cuello = cuello;
        this.detalle = detalle;
    }
    
    @Override
    public String toString() {
        
        return super.toString() +
                "{" + "talle" + talle + ", manga" + 
                manga + ", cuello" + cuello + 
                ", detalle=" + detalle + '}';
    }

    public char getTalle() {
        return talle;
    }

    public void setTalle(char talle) {
        this.talle = talle;
    }

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
  public  
}
