import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)){
            Retangulo R = new Retangulo();

            System.out.println("digite a altura e largura do Retangulo");
            System.out.printf("altura: ");
            R.altura = sc.nextDouble();
            System.out.printf("largura: ");
            R.largura = sc.nextDouble();
            System.out.println("esse é o valor da area " + R.area());
            System.out.println("esse é o valor do perimetro " + R.perimetro());
            System.out.println("esse é o valor da diagonal " + R.diagonal());
        }
    }
}
