public class Main
{
   public static void main(String[] args){
        //criar e instanciar o fun1 e setar seus dados
        Funcionários fun1 = new Funcionários();
        fun1.setNome("Bob");
        fun1.setQuant_dep(2);
        fun1.setSal_hrs(6.15);
        fun1.setQuant_hrs_trab(120);
        fun1.setSal_bruto();
        fun1.setInss();
        fun1.setIr();
        fun1.setSal_liq();
        
        //criar e instanciar o fun2 e setar seus dados
        Funcionários fun2 = new Funcionários();
        fun2.setNome("Bia");
        fun2.setQuant_dep(0);
        fun2.setSal_hrs(12.50);
        fun2.setQuant_hrs_trab(200);
        fun2.setSal_bruto();
        fun2.setInss();
        fun2.setIr();
        fun2.setSal_liq();
        
        //manipulações do fun1
        System.out.println(fun1.setSal_bruto());
        System.out.println(fun1.setInss());
        System.out.println(fun1.setIr());
        System.out.println(fun1.setSal_liq());
        fun1.setSal_hrs(8);
        System.out.println(fun1.setSal_liq());
        System.out.println(fun1.toString());
        
        //manipulações do fun2
        System.out.println(fun2.toString());
        fun2.setQuant_dep(-2);
        fun2.setNome("Bianca");
        System.out.println(fun2.toString());
        fun2.setQuant_dep(1);
        fun2.setSal_hrs(15);
        fun2.setQuant_hrs_trab(750);
        System.out.println(fun2.toString());
    }
}
