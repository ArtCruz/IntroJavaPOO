public class Deputado
{
    private int matricula;
    private String nome;
    private int partido;
    private String estado;
   
    public Deputado(int matricula, String nome, String estado, int partido){
         this.matricula=matricula;
         this.nome=nome;
         this.estado=estado;
         this.partido=partido;
    }
    public boolean setPartido(int partido){
        if(partido<100 && partido>=10){
            this.partido=partido;
            return true;
        }else{
            return true;
        }    
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    public int getPartido(){
        return this.partido;
    }
    public String getNome(){
        return this.nome;
    }
    public String getEstado(){
        return this.estado;
    }
    
    public String toString(){
        return "Matrícula "+this.matricula+", "+
        "Partido "+this.partido+", "+
        "Nome "+this.nome+", "+
        "Estado "+this.estado;
    }
}
