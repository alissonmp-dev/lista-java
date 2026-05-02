    package lista3;

    import java.util.Scanner;

    public class L308 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            final String USUARIO = "1234";
            final String SENHA = "9999";

            System.out.print("DIGITE O USUARIO: ");
            String usuarioDigitado = in.next();

            if (!usuarioDigitado.equalsIgnoreCase(USUARIO)) {
                System.out.println("USUARIO INVALIDO");
                in.close();
                return;
            }

            System.out.print("DIGITE A SENHA: ");
            String senhaDigitada = in.next();

            if (!senhaDigitada.equalsIgnoreCase(SENHA)) {
                System.out.println("SENHA INVALIDA");
                in.close();
                return;            
            } else {
                System.out.println("ACESSO PERMITIDO");
            }

            in.close();
    }
}