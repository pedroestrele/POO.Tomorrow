package exercicio3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("----- Menu -----");
            System.out.println("1. Adicionar Filme");
            System.out.println("2. Adicionar Crítica");
            System.out.println("3. Recomendar Filmes por Gênero");
            System.out.println("4. Recomendar Filmes por Gênero e Diretor");
            System.out.println("5. Calcular Média das Avaliações de um Filme");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            switch (choice) {
                case 1:
                	//adicionando um filme
                    System.out.print("Digite o título do filme: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o diretor do filme: ");
                    String diretor = scanner.nextLine();
                    //criando o filme a partir das informações inseridas
                    Filme filme = new Filme(titulo, diretor);
                    System.out.print("Digite o gênero do filme: ");
                    //setando um genero para o filme criado
                    String genero = scanner.nextLine();
                    filme.setGenero(genero);
                    System.out.print("Digite a classificação indicativa do filme: ");
                    //adicionando a classificação indicativa
                    String classIndicativa = scanner.nextLine();
                    filme.setClassIndicativa(classIndicativa);
                    System.out.println("Filme adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o título do filme: ");
                    titulo = scanner.nextLine();
                    //encontrando filme a partir do titulo
                    filme = Filme.findFilme(titulo);
                    //se o filme procurado existir/estiver registrado prossiga
                    if (filme != null) {
                    	//criando critica
                        System.out.print("Digite a avaliação (0-10): ");
                        int avaliacao = scanner.nextInt();
                        scanner.nextLine(); // Consome a nova linha
                        System.out.print("Digite o comentário: ");
                        String comentario = scanner.nextLine();
                        new Critica(avaliacao, comentario, filme);
                        System.out.println("Crítica adicionada com sucesso!");
                    } else {//filme não encontrado
                        System.out.println("Filme não encontrado!");
                    }
                    break;
                case 3://procurando filmes a partir de um genero
                    System.out.print("Digite o gênero: ");
                    genero = scanner.nextLine();
                    Filme.recomendar(genero);
                    break;
                case 4://procurando filmes a partir de um genero e um diretor
                    System.out.print("Digite o gênero: ");
                    genero = scanner.nextLine();
                    System.out.print("Digite o diretor: ");
                    diretor = scanner.nextLine();
                    Filme.recomendar(genero, diretor);
                    break;
                case 5://encontrando media de avaliações de um filme
                    System.out.print("Digite o título do filme: ");
                    titulo = scanner.nextLine();
                    filme = Filme.findFilme(titulo);
                    if (filme != null) {//calculando media
                        double media = filme.avaliacaoMedia();
                        //formatando para duas casas decimais
                        media = (int) media*100;
                        media = media/100;
                        System.out.println("A média das avaliações do filme " + titulo + " é: " + media);
                    } else {//filme não encontrado
                        System.out.println("Filme não encontrado!");
                    }
                    break;
                case 6:
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

  