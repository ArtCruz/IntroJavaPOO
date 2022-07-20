public class Funcionários
{
   private String nome;
   private float quant_hrs_trab;
   private double sal_hrs;
   private int quant_dep;
   private double sal_bruto;
   private double inss;
   private double ir;
   private double sal_liq;
   
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
    
    public boolean setQuant_hrs_trab(float quant_hrs_trab){
        if(quant_hrs_trab>0 && quant_hrs_trab<=720){
            this.quant_hrs_trab = quant_hrs_trab;
            return true;
        }else{
            return false;
        }
    }
    
    public float getQuant_hrs_trab(){
        return this.quant_hrs_trab;
    }
    
    public boolean setSal_hrs(double sal_hrs){
        if(sal_hrs>0){
            this.sal_hrs = sal_hrs;
            return true;
        }else{
            return false;
        }
    }
    
    public double getSal_hrs(){
        return this.sal_hrs;
    }
    
    public boolean setQuant_dep(int quant_dep){
        if(quant_dep>=0){
            this.quant_dep = quant_dep;
            return true;
        }else{
            return false;
        }
    }
    
    public int getQuant_dep(){
        return this.quant_dep;
    }
    
    public double setSal_bruto(){
        this.sal_bruto = quant_hrs_trab*sal_hrs+(50*quant_dep);
        return this.sal_bruto;
    }
    
    public double setInss(){
        if(sal_bruto<=1000){
            return this.inss = this.sal_bruto*0.085;
        }else{
            return this.inss = this.sal_bruto*0.09;
        }
    }
    
    public double setIr(){
        if(sal_bruto<=500){
            this.ir = this.sal_bruto;
        }
        if(sal_bruto>500 && sal_bruto<=1000){
            this.ir = this.sal_bruto*0.05;
        }
        if(sal_bruto>1000){
            this.ir = this.sal_bruto*0.07;
        }
        return this.ir;
    }
    
    public double setSal_liq(){   
        return this.setSal_bruto()-(this.setIr() + this.setInss());
    }
    
    public String toString(){
        String texto;
        texto = "Nome: "+ this.nome+", ";
        texto = texto+"Dependentes: "+this.quant_dep+", ";
        texto = texto+"Sal. Hora: "+this.sal_hrs+", ";
        texto = texto+"Qtd. Horas Trab.: "+this.quant_hrs_trab+", ";
        texto = texto+"Sal. Bruto: "+this.sal_bruto+", ";
        texto = texto+"INSS: "+this.inss+", ";
        texto = texto+"IR: "+ this.ir+", ";
        texto = texto+"Sal. Liquido: "+this.sal_liq;
        return texto;
    }
}
