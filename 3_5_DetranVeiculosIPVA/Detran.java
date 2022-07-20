import java.util.ArrayList;
public class Detran
{
    private String estado;
    private ArrayList<Veiculo> veiculos;
    
    public Detran(){
        veiculos = new ArrayList<Veiculo>();
    }
    public void addVeiculos(Veiculo umVeiculo){
        veiculos.add(umVeiculo);
    }
    public boolean setEstado(String estado){
        if(!estado.isEmpty()){
            this.estado = estado;
            return true;
        }else{
            return false;
        }    
    }
    public String getEstado(){
        return this.estado;
    }
    public String toString(){
        String texto = "Estado: "+ this.estado;
        for(Veiculo veic: this.veiculos){
            texto += veic.toString()+ "\n";   
        }
        return texto;
    }
}
