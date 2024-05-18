package exercicio4;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HorariosDisp {
	//assumindo que nesse cenário cada consulta leva 1h
	private Map<String, Set<LocalTime>> horariosDisponiveis;
	
	public HorariosDisp() {
		horariosDisponiveis = new HashMap<>();
		String[] diasDaSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
		for(String dia:diasDaSemana) {
            horariosDisponiveis.put(dia, new HashSet<>());
		}
		//adicionando horarios dos dias uteis
		for(int i = 0;i<5; i++) {
			for(int j=8;j<21;j++) {//adiciona de 8:00 a 20:00
				horariosDisponiveis.get(diasDaSemana[i]).add(LocalTime.of(j, 0));
			}
		}
		//adicionando horarios do final de semana
		for(int i=5;i<7;i++) {
			for(int j=9;j<15;j++) {//adiciona de 9:00 a 14:00
				horariosDisponiveis.get(diasDaSemana[i]).add(LocalTime.of(j, 0));
			}
		}
		
	}
	//metodo para verificar um horario disponivel em certo dia
	public boolean horaDisponivel(String dia, LocalTime horario) {
		return horariosDisponiveis.containsKey(dia)&&horariosDisponiveis.get(dia).contains(horario);
	}
	
	//metodo para remover disponibilidade de um horario marcado
	public void ocuparHora(String dia,LocalTime horario) {
		if (horariosDisponiveis.containsKey(dia)) {
            horariosDisponiveis.get(dia).remove(horario);
        } else {
            System.out.println("Dia inválido.");
        }
	}
	public Map<String, Set<LocalTime>> getHorariosDisponiveis() {
		return horariosDisponiveis;
	}
	
}
