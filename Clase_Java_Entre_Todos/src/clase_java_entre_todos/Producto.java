/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_3;

/**
 *
 * @author ET36
 */
public class Producto {
    private String color;
    private String desc;
    private double pcio;
    private String marca;

    public Producto(String color, String desc, double pcio, String marca) {
        this.color = color;
        this.desc = desc;
        this.pcio = pcio;
        this.marca = marca;
    }
    public String toString()
    {
        return " DESCRIPCION: "+ this.desc + " MARCA: "+ this.marca+ " PRECIO: "+ this.pcio+ "COLOR: "+ this.color ;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPcio() {
        return pcio;
    }

    public void setPcio(double pcio) {
        this.pcio = pcio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
