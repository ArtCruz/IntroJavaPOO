import java.util.ArrayList;
public class Grupo
{
    private String nomeGrupo;
    private ArrayList<Participante> participantes;
    
    public Grupo(String nomeGrupo){
        this.nomeGrupo = nomeGrupo;
        this.participantes = new ArrayList<Participante>();       
    }
    public void addParticipante(Participante par){
        this.participantes.add(par);
    }
    public void imprimeParticipantes(){
        System.out.printf("Nome do Grupo: %s\n", this.nomeGrupo);
        for(int i=0;i<this.participantes.size();i++){
            Participante par = this.participantes.get(i);
            System.out.printf("Nome: %s, Número: %d\n", par.getNome(),par.getNumero());
        }   
    }    
}
