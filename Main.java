import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        try{
            System.out.println("digite um numero inteiro");
            int n1 = ler.nextInt();
            System.out.println("digite outro numero inteiro");
            int n2 = ler.nextInt();
            int resultado = (n1+n2);
            System.out.println("a soma dos dois numero é igual a "+ resultado);
        }
        
        catch (Exception erro){
            System.out.println("deve ser digitado apenas numeros inteiros, ocorreu o erro:" + erro);
            }
    }
}