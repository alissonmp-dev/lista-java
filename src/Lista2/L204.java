package lista2;

public class L204 {
    public static void main(String[] args) {
      
        int numero1 = 1;
        int numero2 = 1;
        String resultado = "";

        if (numero1 > numero2) {
            resultado = "numero1 = " +numero1;
        } else if (numero1 == numero2) {
            resultado = "Os numeros sao iguais";
        } else {
            resultado = "numero2 = " +numero2;
        }
        
        System.out.println(resultado);
    }
}