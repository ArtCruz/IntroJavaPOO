public class Veiculos
{
    private String modelo;
    private double potencia;
    private double quant_comb_tanq;
    private int hodometro;
    private int dist_viagem;
    
    public Veiculos(String modelo, int hodometro){
        this.modelo = modelo; 
        this.hodometro = hodometro;
    }
    
    public boolean setPotencia(double potencia){
        if(potencia>=1 && potencia<= 2){
            this.potencia = potencia;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean setComb(float quant_comb_tanq){
        if(quant_comb_tanq>50 || quant_comb_tanq<0){
            return false;
        }else{
            this.quant_comb_tanq = quant_comb_tanq;
            return true;
        }
    }
    
    public boolean Abastecer(float quant_comb_tanq){
        if(this.quant_comb_tanq+quant_comb_tanq>50 || quant_comb_tanq<0){
            return false;
        }else{
            this.quant_comb_tanq = this.quant_comb_tanq + quant_comb_tanq;
            return true;
        }    
    }
    
    public boolean Viajar(int dist_viagem){
        if(dist_viagem>(15/this.potencia)*quant_comb_tanq || dist_viagem<0){
            return false;
        }else{
            //dist_viagem/(15/this.potencia);
            this.hodometro = this.hodometro + dist_viagem;
            this.quant_comb_tanq = this.quant_comb_tanq - dist_viagem/(15/this.potencia);
            return true;
        }
    }
    
    public String toString(){
        String texto;
        texto = "Veículo: "+this.modelo+", ";
        texto = texto+"Potencia: "+this.potencia+", ";
        texto = texto+"Hodômetro: "+this.hodometro+", ";
        texto = texto+"Combustivel no tanque: "+this.quant_comb_tanq;
        return texto;
    }
}    