package exercicio4;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class ConsultaMedica {
	private Medico medico;
	private String paciente;//nome do paciente
	private LocalTime horario;
	private String dia;
	private String tipo;
	//lista com todas as consultas já marcadas
	private static Set<ConsultaMedica> consultas = new HashSet<>();
	
	public ConsultaMedica(Medico medico, String paciente, LocalTime horario, String dia, String tipo) {
		this.horario = horario;
		this.medico = medico;
		this.paciente = paciente;
		this.dia = dia;
		this.tipo = tipo;
		consultas.add(this);
	}
	
	public static void marcarConsulta(Medico medico, String paciente, LocalTime horario,String dia, String tipo){
		//checando a disponibilidade do medico e do paciente para esta consulta
		if(medico.getHorarios().horaDisponivel(dia, horario)
				&&ConsultaMedica.getConsulta(paciente, horario)==null) {
			new ConsultaMedica(medico, paciente, horario, dia, tipo);//criando consulta
		}else {
			System.out.println("horario não disponivel");
		}
		
	}
	//metodo que retorna uma consulta a partir do paciente e do horario
	public static ConsultaMedica getConsulta(String paciente, LocalTime horario) {
		for(ConsultaMedica procurada:consultas) {
			if(procurada.getPaciente().equals(paciente)&&procurada.getHorario()==horario) {
				return procurada;
			}
		}
		return null;
	}
	//metodo para encontrar as consultas de um paciente e imprimir seus compromissos
	 public static void notificarPaciente(String paciente) {
	        boolean consultaEncontrada = false;
	        for (ConsultaMedica consulta : ConsultaMedica.getConsultas()) {
	            if (consulta.getPaciente().equals(paciente)) {
	                System.out.println("Você tem uma consulta marcada para " +
	                        consulta.getDia() + " às " + consulta.getHorario());
	                consultaEncontrada = true;
	            }
	        }
	        if (!consultaEncontrada) {
	            System.out.println("Nenhuma consulta encontrada para o paciente: " + paciente);
	        }
	    }
	// Método para listar todas as consultas
	public static void listarConsultas() {
		for (ConsultaMedica consulta : ConsultaMedica.getConsultas()) {
			System.out.println("Médico: " + consulta.getMedico().getNome() +
					", Paciente: " + consulta.getPaciente() +
					", Dia: " + consulta.getDia() +
					", Horário: " + consulta.getHorario() +
					", Tipo: " + consulta.getTipo());
		}
	}
	    
	//getters
	public Medico getMedico() {
		return medico;
	}

	public String getPaciente() {
		return paciente;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public static Set<ConsultaMedica> getConsultas() {
		return consultas;
	}
	public String getDia() {
		return dia;
	}
	public String getTipo() {
		return tipo;
	}
	
}
