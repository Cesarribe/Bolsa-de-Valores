import java.util.Scanner;

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

    public float getTotalInvestido() {
        return totalInvestido;
    }

    public void setTotalInvestido(float totalInvestido) {
        this.totalInvestido = totalInvestido;
    }

    float totalInvestido;

    public String Status() {
        String Status = codigo + " teve o valor aportado de  " + valorAportado + " que gerou a quantia de " + quantidadeComprada + " com um total de " + dividendos;
        return Status;

    }

    public class CalculoPorcentagem {
         {
            Scanner sc = new Scanner(System.in);
            double x = (totalInvestido); // Definindo X como 100%

            System.out.print("Digite o valor a ser adicionado: ");
            double valor = sc.nextDouble();
            double porcentagem = (valor / x) * 100.0; // Calculando a porcentagem referente ao valor
            x += valor; // Adicionando o valor à variável X
            System.out.println("Porcentagem referente ao valor adicionado: " + porcentagem + "%");

            sc.close();
        }
        public void totalInvestido (float valorAlterado){
             totalInvestido += valorAlterado;


        }
    }
}
