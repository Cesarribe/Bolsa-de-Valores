import java.util.ArrayList;
import java.util.Scanner;

public class Acoes extends Investimentos {
    private ArrayList<Investimentos> acoes;
    private double crescimentoAnualizado;


    public Acoes(String codigo, double valorAportado, int quantidadeComprada, double dividendos, String data) {
        super(codigo, valorAportado, quantidadeComprada, dividendos, data);
    }

    public double getCrescimentoAnualizado() {
        return crescimentoAnualizado;
    }

    public void setCrescimentoAnualizado(double crescimentoAnualizado) {
        this.crescimentoAnualizado = crescimentoAnualizado;
    }

    public void novoStatus() {
        String statusHerdado = super.Status(); // chama o método herdado da classe mãe
        String novoStatus = statusHerdado + " - " + crescimentoAnualizado; // adiciona a nova informação
        System.out.println(novoStatus);

    }

    @Override
    public String toString() {
        return "Acoes{" +
                ", crescimentoAnualizado=" + crescimentoAnualizado +
                ", codigo='" + codigo + '\'' +
                ", valorAportado=" + valorAportado +
                ", quantidadeComprada=" + quantidadeComprada +
                ", dividendos=" + dividendos +
                ", data='" + data + '\'' +
                '}';
    }
}

