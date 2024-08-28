public class Viagem {
    private String destino; // Destino da viagem
    private String pais; // País do destino
    private double orcamento; // Orçamento previsto para a viagem
    private String dataInicio; // Data de início da viagem
    private String dataFim; // Data de término da viagem

    // Construtor para inicializar os atributos da viagem
    public Viagem(String destino, String pais, double orcamento, String dataInicio, String dataFim) {
        this.destino = destino;
        this.pais = pais;
        this.orcamento = orcamento;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    // Getters para acessar os atributos da viagem
    public String getDestino() {
        return destino;
    }

    public String getPais() {
        return pais;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    // Método toString para exibir as informações da viagem
    @Override
    public String toString() {
        return "Destino: " + destino + ", País: " + pais + ", Orçamento: " + orcamento +
                ", Data de Início: " + dataInicio + ", Data de Fim: " + dataFim;
    }
}
