public class TesouroDireto extends Investimentos {
    private String resgate;


    public TesouroDireto(String codigo, double valorAportado, int quantidadeComprada, double dividendos, String data, String resgate) {
        super(codigo, valorAportado, quantidadeComprada, dividendos, data);
            this.resgate = resgate;
    }

    public void novoStatus() {
        String statusHerdado = super.Status(); // chama o método herdado da classe mãe
        String novoStatus = statusHerdado + " - " + resgate; // adiciona a nova informação
        System.out.println(novoStatus);
           }

    @Override
    public String toString() {
        return "Acoes{" +
                "nome='" + codigo + '\'' +
                ", valorInvestido=" + valorAportado +
                ", quantidade=" + quantidadeComprada +
                ", dataCompra='" + data + '\'' +
                '}';
    }
}