public class Aluno {
    private final String nome;
    private final double nota;
    private final int matricula;

    public Aluno(String nome, double nota, int matricula) {
        this.nome = nome;
        this.nota = nota;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " | Nota: " + nota + " | Matrícula: " + matricula;
    }
}
