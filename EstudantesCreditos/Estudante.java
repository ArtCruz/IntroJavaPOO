 public class Estudante
{
   private String nome;
   private int matricula;
   private int creditos;
   
   public Estudante(int matricula){
        this.matricula = matricula;
    }
    
    public boolean setNome(String nome){
        if(!nome.isBlank()){
            this.nome = nome;
            return true;
        }else{
            return false;
        }
   }
   
   public String getNome(){
        return this.nome;
   }
    
   public int getMatricula(){
    return this.matricula;
    }
    
    public boolean adicionarCreditos(int creditos){
        if(creditos>0){
            this.creditos += creditos;
            return true;
        }else{
            return false;
        }
    }
   
    public int getCreditos(){
        return this.creditos;
    }
    
    public String calcularLogin(){
    //TAREFA
    //DICAS:
    /*Verificar metodos substring na classe String, para poder usar no nome.
     *Para os 3 ultimos digitos, dividir o valor da matrícula para obter a 
     *centena, dezena e unidade.
     *Ou, converter para String e utilizar o substring na matricula tbm.
       */
      return "tarefa";
    }
    
    public String toString(){
        String texto;
        texto = "Nome: "+ this.nome+", ";
        texto += "Matrícula: " +this.matricula+", ";
        texto += "Login: " + this.calcularLogin()+": ";
        texto += "Creditos: "+this.creditos;
        return texto;        
    }
}
