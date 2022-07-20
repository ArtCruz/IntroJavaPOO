/**
 * Classe que representa um Jogo.
 * @author Fernando Santos
 */
public class Jogo extends Item {
    private int quantidadeJogadores;
    private String plataforma;

    public int getQuantidadeJogadores() {
        return quantidadeJogadores;
    }

    public boolean setQuantidadeJogadores(int quantidadeJogadores) {
        if (quantidadeJogadores >=1 ){
            this.quantidadeJogadores = quantidadeJogadores;
            return true;
        }else{
            return false;
        }
    }

    public String getPlataforma() {
        return plataforma;
    }

    public boolean setPlataforma(String plataforma) {
        if (!plataforma.isEmpty()){
            this.plataforma = plataforma;
            return true;
        }else{
            return false;
        }
    }
}
