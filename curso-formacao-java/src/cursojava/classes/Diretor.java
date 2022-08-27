package cursojava.classes;

public class Diretor extends Pessoa {

    private String registroEducacao;

    private Integer tempoDirecao;

    private String titulacao;

    public String getRegistroEducacao() {
        return registroEducacao;
    }

    public void setRegistroEducacao(String registroEducacao) {
        this.registroEducacao = registroEducacao;
    }

    public Integer getTempoDirecao() {
        return tempoDirecao;
    }

    public void setTempoDirecao(Integer tempoDirecao) {
        this.tempoDirecao = tempoDirecao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
