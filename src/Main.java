import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Investimentos> investimentos = new ArrayList<Investimentos>();
        ArrayList<Acoes> acoes = new ArrayList<Acoes>();

        System.out.println("----------- Bem vindo ao seu programa pessoal de controle de Investimentos---------");


        System.out.println("Digite 1 para Cadastrar\n" + "Digite 2 para seus ativos\n" + "Digite 3 para sair ");
        int menu = scanner.nextInt();

        if (menu == 1) {
            System.out.println("Qual investimento voce deseja cadastrar: \n digite 1 para cadastrar ação \n digite 2 para cadastrar Tesouro direto " +
                    "\n Digite 3 para FII`s \n digite 4 para Fundos de Investimentos \n Digite 5 para CBD \n e Para sair digite 6");
            int escolha = scanner.nextInt();

            while (escolha != 6) {

                if (escolha == 1) {
                    System.out.println("cadastrando investimento, qual investimento você aportou?"); // cadastro das variaveis
                    int escolha1 = scanner.nextInt();
                    if (escolha1 == 1) {

                        System.out.print("Digite o nome da ação: \n");
                        String nome = scanner.next();

                        System.out.print("Digite o valor da ação: \n");
                        double valor = scanner.nextDouble();

                        System.out.print("Digite a quantidade de ações: \n");
                        int quantidade = scanner.nextInt();

                        System.out.print("Digite o ultimo Dividend Yeild: \n");
                        double dy = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.print("Digite a data de compra (no formato dd/mm/yyyy): \n");
                        String data = scanner.nextLine();

                        Acoes acao = new Acoes(nome, valor, quantidade, dy, data);
                        acoes.add(acao);

                        System.out.println(acoes.get(0));


                        // criar um hashmap para nomear as açoes
                        break;
                    } else if (escolha1 == 2) {
                        System.out.println("você escolheu investir em FII`s");// criar construtor de FII`s
                    } else if (escolha1 == 3) {
                        System.out.println("você escolheu investir em Tesouro Direto"); // criar construtor de TD
                    } else if (escolha1 == 4) {
                        System.out.println("Você escolheu investir em Fundos de Investimentos"); // Criar construtor de FI
                    } else if (escolha1 == 5) {
                        System.out.println("Você escolheu investir em CBD`s");// Criar construtor de CBD`s
                    }
                }
            }
        }
                else if (menu == 2) {
                    System.out.println("Olhando seus ativos"); // println
                } else {
                    System.out.println("saindo do menu");

                }

        }
    }



