public class Sistema
{
   public static void main(String[] args){
        //criar o estudante est1 e setar seus dados
        Estudante est1 = new Estudante(556644);
        est1.setNome("Fernando");
        est1.adicionarCreditos(35);
        
        //criar o estudante est 2 e setar os seus dados
        Estudante est2 = new Estudante(579035);
        est2.setNome("Beth");
        est2.adicionarCreditos(80);
        
        //manipulações do est1
        //Operação 1
        String loginEst1 = est1.calcularLogin();
        System.out.println(loginEst1);
        
        //Operação 2
        System.out.println(est1.toString());
        
        //Operação 3 
        est1.adicionarCreditos(4);
        
        //Operação 4
        System.out.println(est1.toString());
        
        //Operação 5
        est1.setNome("Fernando Santos");
        
        //Operação 6
        System.out.println(est1.calcularLogin());
        
        //Operação 7
        System.out.println(est1.toString());
        
        
        //Manipulações do est2
        //Operação 1
        System.out.println(est2.toString());
        
        //Operação 2 
        est2.adicionarCreditos(-8);
        
        //Operação 3 
        System.out.println(est2.toString());
        
        //Operação 4 
        est2.setNome("Elizabeth");
        
        //Operação 5
        System.out.println(est2.calcularLogin());
        
    }
}
