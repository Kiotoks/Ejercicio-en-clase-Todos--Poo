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
    
}
