import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GerenciadorDeViagens {
    private List<Viagem> viagens; // Lista que armazena as viagens planejadas

    // Construtor que inicializa a lista de viagens
    public GerenciadorDeViagens() {
        this.viagens = new ArrayList<>();
    }

    // Método para adicionar uma viagem ao planejamento
    public void adicionarViagem(Viagem viagem) {
        viagens.add(viagem); // Adiciona a viagem à lista
        System.out.println("Viagem adicionada: " + viagem.getDestino()); // Confirma que a viagem foi adicionada
    }

    // Método para remover uma viagem pelo destino usando Predicate
    public void removerViagem(String destino) {
        Predicate<Viagem> condicao = viagem -> viagem.getDestino().equalsIgnoreCase(destino); // Cria um Predicate para encontrar o destino
        boolean removido = viagens.removeIf(condicao); // Remove a viagem que satisfaz o Predicate
        if (removido) {
            System.out.println("Viagem removida: " + destino); // Confirma que a viagem foi removida
        } else {
            System.out.println("Viagem não encontrada: " + destino); // Informa que a viagem não foi encontrada
        }
    }

    // Método para buscar viagens por país usando Predicate
    public List<Viagem> buscarPorPais(String pais) {
        return filtrarViagens(viagem -> viagem.getPais().equalsIgnoreCase(pais)); // Filtra a lista de viagens pelo país
    }

    // Método para buscar viagens dentro de um orçamento específico usando Predicate
    public List<Viagem> buscarPorOrcamento(double maxOrcamento) {
        return filtrarViagens(viagem -> viagem.getOrcamento() <= maxOrcamento); // Filtra a lista de viagens pelo orçamento
    }

    // Método para buscar viagens que ocorrem em um determinado período usando Predicate
    public List<Viagem> buscarPorPeriodo(String dataInicio, String dataFim) {
        return filtrarViagens(viagem -> viagem.getDataInicio().compareTo(dataInicio) >= 0 &&
                viagem.getDataFim().compareTo(dataFim) <= 0); // Filtra a lista de viagens pelo período
    }

    // Método para filtrar viagens com base em um Predicate
    private List<Viagem> filtrarViagens(Predicate<Viagem> criterio) {
        return viagens.stream()
                .filter(criterio) // Aplica o filtro baseado no Predicate
                .collect(Collectors.toList()); // Retorna a lista de viagens que atendem ao critério
    }

    // Método para listar todas as viagens planejadas
    public void listarViagens() {
        if (viagens.isEmpty()) {
            System.out.println("Nenhuma viagem planejada."); // Informa que não há viagens planejadas
        } else {
            viagens.forEach(System.out::println); // Exibe as informações de todas as viagens
        }
    }
}
