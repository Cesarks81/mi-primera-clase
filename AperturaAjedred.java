public class AperturaAjedred{
    
    public String nombreApertura;
    public int movimientosDeLibro;
    public boolean esVigente;
    
    public AperturaAjedred(String nombre, int movimiento, boolean vigencia){
    nombreApertura = nombre;
    movimientosDeLibro = movimiento;
    esVigente = true;
    }

    public String getNombre (){ return nombreApertura;}
    public int getMovimiento (){ return movimientosDeLibro;}
    public boolean getVigencia (){ return esVigente;}
    
    public void setNombre(String nombre){
        nombreApertura = nombre;
    }
    public void setMovimientos(int movimiento){
        movimientosDeLibro = movimiento/2+movimientosDeLibro;
    }
    public void setVigencia(){
        if(esVigente == true)
            {esVigente = false;
        }
        else {esVigente = true;}
    }
    public void imprimirEstado(){
        System.out.println("Nombre:" + nombreApertura + "| Movimientos:" + movimientosDeLibro + " | Vigencia: " + esVigente);
    }
    public String obtenerEstado(){
        return "Nombre:" + nombreApertura + "| Movimientos:" + movimientosDeLibro + " | Vigencia: " + esVigente;
    }

}