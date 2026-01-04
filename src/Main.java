import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as vitorias");
        int vitorias = sc.nextInt();
        System.out.println("Digite as derrotas");
        int derrotas = sc.nextInt();

        String resultado = calcularRank(vitorias, derrotas);
        System.out.println(resultado);

        sc.close();
    }

    public static String calcularRank(int saldoVitoria, int saldoDerrota) {
        int saldo = saldoVitoria - saldoDerrota;
        String nivel = " ";
        if (saldo < 10) {
            nivel = "Ferro";
        } else if (saldo >= 11 && saldo <= 20) {
            nivel = "Bronze";
        } else if (saldo >= 21 && saldo <= 50) {
            nivel = "Prata";
        } else if (saldo >= 51 && saldo <= 80) {
            nivel = "Ouro";
        } else if (saldo >= 81 && saldo <= 90) {
            nivel = "Diamante";
        } else if (saldo >= 91 && saldo <= 100) {
            nivel = "Lendario";
        } else {
            nivel = "Imortal";
        }
        return "O Herói tem saldo de " + saldo + " e está no nível " + nivel;
    }
}