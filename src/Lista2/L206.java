import java.util.Scanner;

public class L206 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade = 0;
        int ano, mes, dia, totalDias = 0;
        // ano = 365
        // mes = 30
        // calcular qts dias ja viveu
        System.out.print("Digite  sua idade em anos: ");
        ano = in.nextInt();
        System.out.print("Digite os meses: ");
        mes = in.nextInt();
        System.out.print("Digite os dias: ");
        dia = in.nextInt();
        totalDias = ano * 365 + mes * 30 + dia;
        System.out.println(totalDias);
    }
}
