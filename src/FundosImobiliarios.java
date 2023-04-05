public class FundosImobiliarios extends Investimentos {
    String gestora;
    double taxaGestao;
    double taxaPerformace;

    public FundosImobiliarios(String codigo, double valorAportado, int quantidadeComprada, double dividendos, String data) {
        super(codigo, valorAportado, quantidadeComprada, dividendos, data);
    }

    public void novoStatus() {
        String statusHerdado = super.Status(); // chama o método herdado da classe mãe
        String novoStatus = statusHerdado + " tem a taxa de Administração: " + taxaGestao + "a Taxa de Performace: " + taxaPerformace; // adiciona a nova informação
        System.out.println(novoStatus);
    }

    @Override
    public String toString() {
        return "FundosImobiliarios{" +
                "gestora='" + gestora + '\'' +
                ", taxaGestao=" + taxaGestao +
                ", taxaPerformace=" + taxaPerformace +
                ", codigo='" + codigo + '\'' +
                ", valorAportado=" + valorAportado +
                ", quantidadeComprada=" + quantidadeComprada +
                ", dividendos=" + dividendos +
                ", data='" + data + '\'' +
                '}';
    }
}
