package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Loop principal do menu
        while (running) {
            // Exibe as opções do menu
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Adicionar turma");
            System.out.println("3. Adicionar disciplina");
            System.out.println("4. Adicionar professor");
            System.out.println("5. Registrar nota");
            System.out.println("6. Listar alunos de uma turma");
            System.out.println("7. Verificar média das notas em uma disciplina");
            System.out.println("8. Listar desempenho dos alunos em uma disciplina");
            System.out.println("9. Listar horários das disciplinas de uma turma");
            System.out.println("10. Sair");
            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();

            // Processa a escolha do usuário
            switch (choice) {
                case 1:
                    // Adicionar aluno
                    System.out.print("Digite o nome do aluno: ");
                    String nomeAluno = scanner.next();
                    System.out.print("Digite a idade do aluno: ");
                    int idadeAluno = scanner.nextInt();
                    System.out.print("Digite o número da turma: ");
                    int numTurmaAluno = scanner.nextInt();
                    Turma turmaAluno = Turma.getTurma(numTurmaAluno);
                    if (turmaAluno != null) {
                        new Aluno(nomeAluno, idadeAluno, turmaAluno);
                        System.out.println("Aluno adicionado com sucesso!");
                    } else {
                        System.out.println("Turma não encontrada.");
                    }
                    break;

                case 2:
                    // Adicionar turma
                    System.out.print("Digite o número da turma: ");
                    int numTurma = scanner.nextInt();
                    new Turma(numTurma);
                    System.out.println("Turma adicionada com sucesso!");
                    break;

                case 3:
                    // Adicionar disciplina
                    System.out.print("Digite o nome da disciplina: ");
                    String nomeDisciplina = scanner.next();
                    System.out.print("Digite o número da turma: ");
                    int numTurmaDisciplina = scanner.nextInt();
                    System.out.print("Digite o horário da disciplina: ");
                    String horarioDisciplina = scanner.next();
                    Turma turmaDisciplina = Turma.getTurma(numTurmaDisciplina);
                    if (turmaDisciplina != null) {
                        new Disciplina(nomeDisciplina, turmaDisciplina, horarioDisciplina);
                        System.out.println("Disciplina adicionada com sucesso!");
                    } else {
                        System.out.println("Turma não encontrada.");
                    }
                    break;

                case 4:
                    // Adicionar professor
                    System.out.print("Digite o nome do professor: ");
                    String nomeProfessor = scanner.next();
                    System.out.print("Digite a carga horária do professor: ");
                    double cargaHoraria = scanner.nextDouble();
                    new Professor(nomeProfessor, cargaHoraria);
                    System.out.println("Professor adicionado com sucesso!");
                    break;

                case 5:
                    // Registrar nota
                    System.out.print("Digite o nome do aluno: ");
                    String nomeAlunoNota = scanner.next();
                    System.out.print("Digite o nome da disciplina: ");
                    String nomeDisciplinaNota = scanner.next();
                    System.out.print("Digite a nota: ");
                    int nota = scanner.nextInt();
                    Aluno alunoNota = Aluno.getAluno(nomeAlunoNota);
                    Disciplina disciplinaNota = null;
                    
                    // Procura a disciplina em todas as turmas
                    for (Turma turma : Turma.getTurmas()) {
                        for (Disciplina disciplina : turma.getDisciplinas()) {
                            if (disciplina.getDisciplina().equals(nomeDisciplinaNota)) {
                                disciplinaNota = disciplina;
                                break;
                            }
                        }
                        if (disciplinaNota != null) {
                            break;
                        }
                    }
                    
                    // Registra a nota se o aluno e a disciplina foram encontrados
                    if (alunoNota != null && disciplinaNota != null) {
                        new Nota(alunoNota, disciplinaNota, nota);
                        System.out.println("Nota registrada com sucesso!");
                    } else {
                        System.out.println("Aluno ou disciplina não encontrados.");
                    }
                    break;

                case 6:
                    // Listar alunos de uma turma
                    System.out.print("Digite o número da turma: ");
                    int numTurmaListar = scanner.nextInt();
                    Turma turmaListar = Turma.getTurma(numTurmaListar);
                    if (turmaListar != null) {
                        System.out.println("Alunos da turma " + numTurmaListar + ":");
                        for (Aluno aluno : turmaListar.getAlunosDaTurma()) {
                            System.out.println(aluno.getNome());
                        }
                    } else {
                        System.out.println("Turma não encontrada.");
                    }
                    break;

                case 7:
                    // Verificar média das notas em uma disciplina
                    System.out.print("Digite o nome da disciplina: ");
                    String nomeDisciplinaMedia = scanner.next();
                    System.out.print("Digite o número da turma: ");
                    int numTurmaMedia = scanner.nextInt();
                    Turma turmaMedia = Turma.getTurma(numTurmaMedia);
                    if (turmaMedia != null) {
                        Disciplina disciplinaMedia = null;
                        for (Disciplina disciplina : turmaMedia.getDisciplinas()) {
                            if (disciplina.getDisciplina().equals(nomeDisciplinaMedia)) {
                                disciplinaMedia = disciplina;
                                break;
                            }
                        }
                        if (disciplinaMedia != null) {
                            double media = turmaMedia.mediaDasNotas(disciplinaMedia);
                            System.out.println("Média das notas na disciplina " + nomeDisciplinaMedia + ": " + media);
                        } else {
                            System.out.println("Disciplina não encontrada.");
                        }
                    } else {
                        System.out.println("Turma não encontrada.");
                    }
                    break;

                case 8:
                    // Listar desempenho dos alunos em uma disciplina
                    System.out.print("Digite o nome da disciplina: ");
                    String nomeDisciplinaDesempenho = scanner.next();
                    System.out.print("Digite o número da turma: ");
                    int numTurmaDesempenho = scanner.nextInt();
                    Turma turmaDesempenho = Turma.getTurma(numTurmaDesempenho);
                    if (turmaDesempenho != null) {
                        Disciplina disciplinaDesempenho = null;
                        for (Disciplina disciplina : turmaDesempenho.getDisciplinas()) {
                            if (disciplina.getDisciplina().equals(nomeDisciplinaDesempenho)) {
                                disciplinaDesempenho = disciplina;
                                break;
                            }
                        }
                        if (disciplinaDesempenho != null) {
                            turmaDesempenho.reprovadosEaprovados(disciplinaDesempenho);
                        } else {
                            System.out.println("Disciplina não encontrada.");
                        }
                    } else {
                        System.out.println("Turma não encontrada.");
                    }
                    break;

                case 9:
                    // Listar horários das disciplinas de uma turma
                    System.out.print("Digite o número da turma: ");
                    int numTurmaHorario = scanner.nextInt();
                    Turma turmaHorario = Turma.getTurma(numTurmaHorario);
                    if (turmaHorario != null) {
                        System.out.println("Horários das disciplinas da turma " + numTurmaHorario + ":");
                        turmaHorario.listHorario();
                    } else {
                        System.out.println("Turma não encontrada.");
                    }
                    break;

                case 10:
                    // Sair do sistema
                    running = false;
                    System.out.println("Saindo do sistema. Até mais!");
                    break;

                default:
                    // Opção inválida
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}