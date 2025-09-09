import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)){

            Funcionario F = new Funcionario();

            System.out.println("digite seu nome: ");
            F.nome = sc.nextLine();
            System.out.println("digite seu salario bruto: ");
            F.salarioBruto = sc.nextDouble();
            System.out.println("digite o imposto: ");
            F.imposto = sc.nextDouble();
            System.out.println("funcionario: " + F.nome + " " + F.salarioLiquido());
            System.out.println("tem percentual de aumento: ");
            F.aumento = sc.nextDouble();
            System.out.println("salario com aumento: " + F.nome + " " + F.aumentoSalario());
        }
    }
}
