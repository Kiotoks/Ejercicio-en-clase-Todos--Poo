public class Venta {
    private Producto[] lista;
    private String fecha;
    
    public Venta(String f, Producto[] l){
        this.fecha = f;
        this.lista = l;
    }

    public Producto[] getLista() {
        return lista;
    }

    public void setLista(Producto[] l) {
        this.lista = l;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String f) {
        this.fecha = f;
    }
    
    public double calcularTot(){
        double total;
        if(lista.getDesc().equals("Zapatilla") && lista.getMarca.equals("Adidas")){
            total = lista.getPcio()-(lista.getPcio()*30/100);
        }
        else{
            total = lista.getPcio();
        }
        return total;
    }
    
    public void emitirFactura(){
        for(int x = 0; x < lista.length; x++){
            System.out.println("El prodcuto es: " + lista[x] + ", precio total: " + calcularTot());
        }
    }
    
}
