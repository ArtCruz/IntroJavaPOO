import java.util.ArrayList;

public class Comissao
{
    private String titulo;
    private ArrayList<Deputado>deputados;
    
    public Comissao(String titulo){
        this.titulo=titulo;
        this.deputados = new ArrayList<Deputado>();
    }
    
    public void addDeputado(Deputado umDeputado){
        this.deputados.add(umDeputado);
    }
    public void imprimirDeputados(){
        for(int i=0;i<this.deputados.size();i++){
            Deputado dep = this.deputados.get(i);
            System.out.println(dep.toString());
        }
    }
    public void imprimirDeputados(int partido){
        for(Deputado dep : this.deputados){
            if(dep.getPartido()==partido){
                System.out.println(dep.toString());
            }
        }   
    }
    public void imprimirDeputados(String estado){
        for(Deputado dep : this.deputados){
            if(dep.getEstado().equals(estado)){
                //String não pode usar ==
                System.out.println(dep.toString());
            }
        } 
    }
    public void imprimirQuantidadeDeputadosPorPartido(){
        
    }
}
