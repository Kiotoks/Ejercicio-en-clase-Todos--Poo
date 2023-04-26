public class Venta{
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
        double total = 0;
        for(int x = 0; x < lista.length; x++){
            if(lista[x].getDesc().equals("Zapatilla") && lista[x].getMarca.equals("Adidas")){
                total = lista[x].getPcio()-(lista[x].getPcio()*30/100);
            }
            else{
                total = lista[x].getPcio();
            }
        }
        return total;
    }
    
    public void emitirFactura(){
        for(int x = 0; x < lista.length; x++){
            System.out.println("El prodcuto es: " + lista[x] + ", precio total: " + calcularTot());
        }
    }
    
}
