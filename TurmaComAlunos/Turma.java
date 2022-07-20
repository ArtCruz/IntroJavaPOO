Pratoimport java.util.ArrayList;

public class Turma
{
    private String nomeDisciplina;
    private String nomeProfessor;
    private ArrayList<Aluno> alunos;
   
    public Turma(String nomeDisciplina, String nomeProfessor){
        this.nomeDisciplina = nomeDisciplina;
        this.nomeProfessor = nomeProfessor;
        this.alunos = new ArrayList<Aluno>();
    }
    public void addAluno(Aluno alu){
        this.alunos.add(alu);
    }
    public int getQuantidadeAlunos(){
        return this.alunos.size();
    }
    public void imprimeAlunos(){
        System.out.printf("Nome da Disciplina: %s\n", this.nomeDisciplina);
        System.out.printf("Nome do Professor: %s\n", this.nomeProfessor);
        for(int i=0;i<this.alunos.size();i++){
            Aluno alu = this.alunos.get(i);
            System.out.printf("Aluno nome: %s, matricula: %d\n",alu.getNome(),alu.getMatricula());
        }    
    }    
}
