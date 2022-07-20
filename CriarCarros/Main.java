public class Main
{
   public static void main(String[]args){
   //criar e instanciar o veiculo1 e setar seus dados  
   Veiculos veiculos1 = new Veiculos("Fusca",150000);
   veiculos1.setPotencia(1.0);
   veiculos1.setComb(30);
   
   //manipulações do veiculos1
   veiculos1.Viajar(100);
   veiculos1.Viajar(150);
   veiculos1.Viajar(300);
   veiculos1.Abastecer(50);
   System.out.println(veiculos1.toString());
   veiculos1.Abastecer(30);
   veiculos1.Viajar(300);
   veiculos1.Viajar(45);
   System.out.println(veiculos1.toString());
   
   //criar e instanciar o veiculo2 e setar seus dados  
   Veiculos veiculos2 = new Veiculos("Gol",75000);
   veiculos2.setPotencia(1.6);
   veiculos2.setComb(10);
   
   //manipulações do veiculos2
   veiculos2.Viajar(50);
   veiculos2.setPotencia(2.0);
   veiculos2.Viajar(50);
   System.out.println(veiculos2.toString());
   veiculos2.Viajar(15);
   veiculos2.Abastecer(45);
   veiculos2.Viajar(100);
   System.out.println(veiculos2.toString());
   }    
}
