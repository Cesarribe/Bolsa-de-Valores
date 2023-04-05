public class CBD extends Investimentos {
    String resgate;
    double impostoDeRenda;

    public CBD(String codigo, double valorAportado, int quantidadeComprada, double dividendos, String data) {
        super(codigo, valorAportado, quantidadeComprada, dividendos, data);
    }

    public void novoStatus() {
        String statusHerdado = super.Status(); // chama o método herdado da classe mãe
        String novoStatus = statusHerdado + "Tem a data resgate de: " + resgate + "Com o desconto de IR de: " + impostoDeRenda; // adiciona a nova informação
        System.out.println(novoStatus);
    }

    @Override
    public String toString() {
        return "CBD{" +
                "resgate='" + resgate + '\'' +
                ", impostoDeRenda=" + impostoDeRenda +
                ", codigo='" + codigo + '\'' +
                ", valorAportado=" + valorAportado +
                ", quantidadeComprada=" + quantidadeComprada +
                ", dividendos=" + dividendos +
                ", data='" + data + '\'' +
                '}';
    }
}
