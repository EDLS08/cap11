import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Aluno> cadastro = new HashMap<>();

        cadastro.put(201, new Aluno("Lucas Silva", 8.5, 201));
        cadastro.put(202, new Aluno("Mariana Souza", 7.0, 202));
        cadastro.put(203, new Aluno("Carlos Eduardo", 9.2, 203));
        cadastro.put(204, new Aluno("Beatriz Lima", 6.5, 204));
        cadastro.put(205, new Aluno("Gabriel Santos", 5.8, 205));
        cadastro.put(206, new Aluno("Juliana Costa", 10.0, 206));
        cadastro.put(207, new Aluno("Rafael Oliveira", 4.5, 207));
        cadastro.put(208, new Aluno("Larissa Martins", 8.0, 208));
        cadastro.put(209, new Aluno("Matheus Rocha", 7.5, 209));
        cadastro.put(210, new Aluno("Camila Almeida", 9.0, 210));

        TreeMap<Integer, Aluno> ordenadosPorMatricula = new TreeMap<>(cadastro);

        System.out.println("----- ALUNOS POR MATRÍCULA -----");
        for (Map.Entry<Integer, Aluno> entrada : ordenadosPorMatricula.entrySet()) {
            System.out.println(entrada.getValue());
        }

        TreeSet<String> nomes = new TreeSet<>();

        for (Aluno aluno : cadastro.values()) {
            nomes.add(aluno.getNome());
        }

        System.out.println("\n----- NOMES EM ORDEM ALFABÉTICA -----");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        ArrayList<Aluno> rankingPorNota = new ArrayList<>(cadastro.values());
        rankingPorNota.sort(Comparator.comparingDouble(Aluno::getNota).reversed());

        System.out.println("\n----- RANKING POR NOTA -----");
        for (Aluno aluno : rankingPorNota) {
            System.out.println(aluno);
        }

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nDigite a matrícula do aluno: ");

            if (scanner.hasNextInt()) {
                int matricula = scanner.nextInt();
                Aluno alunoEncontrado = cadastro.get(matricula);

                if (alunoEncontrado != null) {
                    System.out.println("\nAluno encontrado!");
                    System.out.println(alunoEncontrado);
                } else {
                    System.out.println("\nAluno não encontrado!");
                }
            } else {
                System.out.println("\nMatrícula inválida. Digite um número inteiro.");
            }
        }
    }
}
