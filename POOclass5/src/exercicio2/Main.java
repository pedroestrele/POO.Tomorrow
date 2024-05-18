package exercicio2;

public class Main {
	public static void main(String[] args) {
        // Criação de um estacionamento com 10 vagas e custo por hora de 5.0
        Estacionamento estacionamento = new Estacionamento(10, 5.0);

        // Criação de veículos
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Moto moto1 = new Moto();
        Caminhão caminhao1 = new Caminhão();

        // Estacionando os veículos
        System.out.println("Estacionando veículos:");
        carro1.estacionar(estacionamento);
        carro2.estacionar(estacionamento);
        moto1.estacionar(estacionamento);
        caminhao1.estacionar(estacionamento);

        // Verificar vagas disponíveis após estacionar
        System.out.println("Vagas disponíveis: " + estacionamento.getVagas());

        // Adicionar horas aos veículos
        carro1.addHoras(3);
        carro2.addHoras(2);
        moto1.addHoras(1);
        caminhao1.addHoras(4);

        // Sair do estacionamento e calcular pagamento
        System.out.println("Saindo do estacionamento e calculando pagamentos:");
        carro1.sair();
        carro2.sair();
        moto1.sair();
        caminhao1.sair();

        // Verificar lucro do estacionamento
        System.out.println("Lucro total do estacionamento: " + estacionamento.lucro());

        // Verificar vagas disponíveis após a saída dos veículos
        System.out.println("Vagas disponíveis após saída: " + estacionamento.getVagas());
    }
}
