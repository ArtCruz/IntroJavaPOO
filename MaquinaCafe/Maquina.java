public class Maquina
{//Arthur Espindola da Cruz
    private String local;
    private double precoCafe;
    private int quantPo;
    private double valorArrecadado;
    private int quantFeitos;
   
    public Maquina(String local){//Arthur Espindola da Cruz
        this.local = local;
    }
    
    public boolean setPrecoCafe(double precoCafe){//Arthur Espindola da Cruz
        if(precoCafe>0){
            this.precoCafe=precoCafe;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean adicPoCafe(int maisGramas){//Arthur Espindola da Cruz
        if(maisGramas>0){
            this.quantPo= this.quantPo+maisGramas;
            return true;
        }else{
            return false;
        }
    }
    
    public double preparar(int quantCafeDesej, double valorPago){//Arthur Espindola da Cruz
        double valorPedido=precoCafe*quantCafeDesej;
        if(valorPedido<=valorPago && quantCafeDesej*20<=quantPo){
            this.quantPo= this.quantPo-(quantCafeDesej*20);
            this.valorArrecadado = this.valorArrecadado+(quantCafeDesej*precoCafe);
            this.quantFeitos= this.quantFeitos+quantCafeDesej;
            return valorPago-valorPedido;
        }else{
            return valorPago; 
        }
    }
    
    public String toString(){//Arthur Espindola da Cruz
        return "Localização: "+this.local+", Preço do café: "+this.precoCafe+", Pó disponível: "+this.quantPo+", Valor arrecadado: "+this.valorArrecadado+
        ", Cafés Preparados: "+this.quantFeitos;
    }    
}
