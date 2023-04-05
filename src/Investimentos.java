public class Investimentos {
    public Investimentos(String codigo, double valorAportado, int quantidadeComprada, double dividendos, String data) {
        this.codigo = codigo;
        this.valorAportado = valorAportado;
        this.quantidadeComprada = quantidadeComprada;
        this.dividendos = dividendos;
        this.data = data;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getValorAportado() {
        return valorAportado;
    }

    public void setValorAportado(double valorAportado) {
        this.valorAportado = valorAportado;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getDividendos() {
        return dividendos;
    }

    public void setDividendos(double dividendos) {
        this.dividendos = dividendos;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    String codigo;
    double valorAportado;
    int quantidadeComprada;
    double dividendos;
    String data;

    public String Status () {
        String Status = codigo + " teve o valor aportado de  "+ valorAportado +" que gerou a quantia de "+ quantidadeComprada + " com um total de "+ dividendos;
        return Status;

    }
}
