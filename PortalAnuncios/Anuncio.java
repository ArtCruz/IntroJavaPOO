
public class Anuncio {
    private String produto;
    private double valorVenda;
    private String cidade;
    private String estado;

    public boolean setProduto(String produto) {
        if (!produto.isEmpty()){
            this.produto = produto;
            return true;
        }else{
            return false;
        }
    }

    public boolean setValorVenda(double valorVenda) {
        if (valorVenda >= 0){
            this.valorVenda = valorVenda;
            return true;
        }else{
            return false;
        }
    }

    public boolean setCidade(String cidade) {
        if (!cidade.isEmpty()){
            this.cidade = cidade;
            return true;
        }else{
            return false;
        }
    }

    public boolean setEstado(String estado) {
        if (!estado.isEmpty()){
            this.estado = estado;
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return "Produto: "+this.produto+", "+
        "Valor: "+this.valorVenda+", "+
        "Estado: "+this.estado+", "+
        "Cidade: "+this.cidade;
    }
}
