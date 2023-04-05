public class FundosInvestimentos extends Investimentos {
    public FundosInvestimentos(String codigo, double valorAportado, int quantidadeComprada, double dividendos, String data) {
        super(codigo, valorAportado, quantidadeComprada, dividendos, data);
    }

    private double comeCotas;

    public void novoStatus() {
        String statusHerdado = super.Status(); // chama o método herdado da classe mãe
        String novoStatus = statusHerdado + " Desconto da Gestora: " + comeCotas; // adiciona a nova informação
        System.out.println(novoStatus);
    }

    @Override
    public String toString() {
        return "FundosInvestimentos{" +
                "comeCotas=" + comeCotas +
                ", codigo='" + codigo + '\'' +
                ", valorAportado=" + valorAportado +
                ", quantidadeComprada=" + quantidadeComprada +
                ", dividendos=" + dividendos +
                ", data='" + data + '\'' +
                '}';
    }
}

