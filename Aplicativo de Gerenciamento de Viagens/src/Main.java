import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeViagens gerenciador = new GerenciadorDeViagens(); // Instancia o gerenciador de viagens
        Scanner scanner = new Scanner(System.in); // Scanner para leitura de entrada do usuário
        int opcao;

        do {
            // Exibe o menu de opções
            System.out.println("\nAplicativo de Gerenciamento de Viagens");
            System.out.println("1. Adicionar Viagem");
            System.out.println("2. Remover Viagem");
            System.out.println("3. Buscar por País");
            System.out.println("4. Buscar por Orçamento");
            System.out.println("5. Buscar por Período");
            System.out.println("6. Listar Todas as Viagens");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário
            scanner.nextLine(); // Consome a nova linha

            switch (opcao) {
                case 1:
                    // Adicionar uma nova viagem
                    System.out.print("Digite o destino: ");
                    String destino = scanner.nextLine(); // Lê o destino da viagem
                    System.out.print("Digite o país: ");
                    String pais = scanner.nextLine(); // Lê o país do destino
                    System.out.print("Digite o orçamento: ");
                    double orcamento = scanner.nextDouble(); // Lê o orçamento da viagem
                    scanner.nextLine(); // Consome a nova linha
                    System.out.print("Digite a data de início (AAAA-MM-DD): ");
                    String dataInicio = scanner.nextLine(); // Lê a data de início da viagem
                    System.out.print("Digite a data de fim (AAAA-MM-DD): ");
                    String dataFim = scanner.nextLine(); // Lê a data de término da viagem
                    Viagem novaViagem = new Viagem(destino, pais, orcamento, dataInicio, dataFim); // Cria uma nova instância de viagem
                    gerenciador.adicionarViagem(novaViagem); // Adiciona a viagem ao gerenciador
                    break;

                case 2:
                    // Remover uma viagem
                    System.out.print("Digite o destino da viagem a ser removida: ");
                    String destinoRemover = scanner.nextLine(); // Lê o destino da viagem a ser removida
                    gerenciador.removerViagem(destinoRemover); // Remove a viagem do gerenciador
                    break;

                case 3:
                    // Buscar viagens por país
                    System.out.print("Digite o país: ");
                    String paisBusca = scanner.nextLine(); // Lê o país para a busca
                    List<Viagem> viagensPorPais = gerenciador.buscarPorPais(paisBusca); // Busca viagens pelo país
                    if (viagensPorPais.isEmpty()) {
                        System.out.println("Nenhuma viagem encontrada para o país: " + paisBusca); // Informa que não foram encontradas viagens para o país
                    } else {
                        viagensPorPais.forEach(System.out::println); // Exibe as viagens encontradas
                    }
                    break;

                case 4:
                    // Buscar viagens por orçamento
                    System.out.print("Digite o orçamento máximo: ");
                    double orcamentoBusca = scanner.nextDouble(); // Lê o orçamento máximo para a busca
                    scanner.nextLine(); // Consome a nova linha
                    List<Viagem> viagensPorOrcamento = gerenciador.buscarPorOrcamento(orcamentoBusca); // Busca viagens pelo orçamento
                    if (viagensPorOrcamento.isEmpty()) {
                        System.out.println("Nenhuma viagem encontrada dentro do orçamento: " + orcamentoBusca); // Informa que não foram encontradas viagens dentro do orçamento
                    } else {
                        viagensPorOrcamento.forEach(System.out::println); // Exibe as viagens encontradas
                    }
                    break;

                case 5:
                    // Buscar viagens por período
                    System.out.print("Digite a data de início do período (AAAA-MM-DD): ");
                    String periodoInicio = scanner.nextLine(); // Lê a data de início do período
                    System.out.print("Digite a data de fim do período (AAAA-MM-DD): ");
                    String periodoFim = scanner.nextLine(); // Lê a data de fim do período
                    List<Viagem> viagensPorPeriodo = gerenciador.buscarPorPeriodo(periodoInicio, periodoFim); // Busca viagens pelo período
                    if (viagensPorPeriodo.isEmpty()) {
                        System.out.println("Nenhuma viagem encontrada no período especificado."); // Informa que não foram encontradas viagens no período especificado
                    } else {
                        viagensPorPeriodo.forEach(System.out::println); // Exibe as viagens encontradas
                    }
                    break;

                case 6:
                    // Listar todas as viagens planejadas
                    gerenciador.listarViagens(); // Exibe todas as viagens planejadas
                    break;

                case 7:
                    // Sair do aplicativo
                    System.out.println("Saindo do aplicativo..."); // Informa que o aplicativo está sendo encerrado
                    break;

                default:
                    // Opção inválida
                    System.out.println("Opção inválida. Tente novamente."); // Informa que a opção escolhida é inválida
                    break;
            }
        } while (opcao != 7); // Continua o loop até que o usuário escolha a opção de sair

        scanner.close(); // Fecha o scanner
    }
}
