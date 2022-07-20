public class Participante
{
    private String nome;
    private int numero;
    public Participante(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }
    public String getNome(){
        return this.nome;
    }
    public int getNumero(){
        return this.numero;
    }
}
