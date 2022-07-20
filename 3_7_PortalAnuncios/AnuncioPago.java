
public class AnuncioPago extends Anuncio
{
    private int dias;
    private double valorPago;
    
    public boolean setDias(int dias){
        if (dias > 0){
            this.dias = dias;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean setValorPago(double valorPago){
        if (valorPago > 0){
            this.valorPago = valorPago;
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Dias: "+this.dias+", Valor pago: "+this.valorPago;
    }
}
