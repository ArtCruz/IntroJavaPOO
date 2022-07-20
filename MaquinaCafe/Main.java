public class Main
{
    public static void main(String[] args){//Arthur Espindola da Cruz
    Maquina maq1 = new Maquina("Ceavi");
    Maquina maq2 = new Maquina("Padaria");
    
    maq1.setPrecoCafe(2);
    maq1.adicPoCafe(250);
    maq2.setPrecoCafe(1.5);
    maq2.adicPoCafe(500);
    
    System.out.println(maq1.toString());
    maq1.preparar(10,30);
    maq1.preparar(10,20);
    System.out.println(maq1.toString());
    maq1.adicPoCafe(250);
    maq1.preparar(10,20);
    System.out.println(maq1.toString());
    
    System.out.println(maq2.toString());
    maq2.preparar(1,2);
    maq2.preparar(5,10);
    System.out.println(maq2.toString());
    maq2.preparar(5,5);
    maq2.preparar(20,30);
    System.out.println(maq2.toString());
    maq2.setPrecoCafe(2.5);
    maq2.preparar(10,20);
    maq2.preparar(10,25);
    System.out.println(maq2.toString());
    }
}
