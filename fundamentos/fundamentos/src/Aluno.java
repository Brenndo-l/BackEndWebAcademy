public class Aluno extends Pessoa {
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", getMatricula()=" + getMatricula() + ", getNome()=" + getNome()
                + "]";
    }
    
    
}
    

