package cursojava.classes;

public class Secretario extends Pessoa {
    private String registro;

    private String nivelCargo;

    private String nivelExperiencia;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public String getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(String nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    @Override
    public String toString() {
        return "Secretario{" +
                "registro='" + registro + '\'' +
                ", nivelCargo='" + nivelCargo + '\'' +
                ", nivelExperiencia='" + nivelExperiencia + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                '}';
    }

    @Override
    public double salario() {
        return 1800;
    }
}
