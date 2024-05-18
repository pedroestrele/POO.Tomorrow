package exercicio4;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("----- Menu -----");
            System.out.println("1. Adicionar Médico");
            System.out.println("2. Marcar Consulta");
            System.out.println("3. Listar Consultas");
            System.out.println("4. Listar Médicos");
            System.out.println("5. Notificar Paciente");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            switch (choice) {
                case 1://adicionando medico ao sistema
                    System.out.print("Digite o nome do médico: ");
                    String nomeMedico = scanner.nextLine();
                    new Medico(nomeMedico);
                    System.out.println("Médico adicionado com sucesso!");
                    break;
                case 2://marcando consulta com um medico
                    System.out.print("Digite o nome do médico: ");
                    String nomeMedicoConsulta = scanner.nextLine();
                    Medico medicoConsulta = Medico.findMedico(nomeMedicoConsulta);
                    if (medicoConsulta == null) {//medico não registrado
                        System.out.println("Médico não encontrado.");
                        break;
                    }//marcando consulta
                    System.out.print("Digite o nome do paciente: ");
                    String nomePaciente = scanner.nextLine();
                    System.out.print("Digite o dia da consulta (ex: Segunda): ");
                    String diaConsulta = scanner.nextLine();
                    System.out.print("Digite o horário da consulta (HH:MM): ");
                    String horarioConsulta = scanner.nextLine();
                    LocalTime horario = LocalTime.parse(horarioConsulta);
                    System.out.print("Digite o tipo de consulta (Telemedicina/Presencial): ");
                    String tipoConsulta = scanner.nextLine();
                    //marcando consulta
                    ConsultaMedica.marcarConsulta(medicoConsulta, nomePaciente, horario, diaConsulta, tipoConsulta);
                    System.out.println("Consulta marcada com sucesso!");
                    break;
                case 3://listando consultas marcadas
                    ConsultaMedica.listarConsultas();
                    break;
                case 4://listando medicos
                	Medico.listarMedicos();
                	break;
                case 5://notificando paciente sobre suas consultas
                    System.out.print("Digite o nome do paciente: ");
                    String pacienteNotificar = scanner.nextLine();
                    ConsultaMedica.notificarPaciente(pacienteNotificar);
                    break;
                case 6://saindo do sistema
                    running = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}