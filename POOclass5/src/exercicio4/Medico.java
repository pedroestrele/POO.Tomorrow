package exercicio4;

import java.util.HashSet;
import java.util.Set;

public class Medico {
	private HorariosDisp horarios;
	private String nome;
	private static Set<Medico> medicos = new HashSet<>();
	
	public Medico(String nome) {
		this.nome = nome;
		this.horarios = new HorariosDisp();
		medicos.add(this);
	}
	//metodo para encontrar um medico no sistema dado seu nome
	public static Medico findMedico(String nome) {
		for(Medico procurado:medicos) {
			if(procurado.nome.equals(nome)) {
				return procurado;
			}
		}
		return null;
	}
	public static void listarMedicos() {
		System.out.println("Médicos disponíveis:");
		for(Medico medico:medicos) {
			System.out.println(medico.nome);
		}
	}

	public HorariosDisp getHorarios() {
		return horarios;
	}

	public String getNome() {
		return nome;
	}

	public static Set<Medico> getMedicos() {
		return medicos;
	}
	
	public static void setMedicos(Set<Medico> medicos) {
		if(medicos.size()==0) {
			Medico.medicos = medicos;
		}
	}
	
	
}
