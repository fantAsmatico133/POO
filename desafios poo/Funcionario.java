public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;
    public double aumento;

    public double salarioLiquido(){
        return salarioBruto -= imposto;
    }

    public double aumentoSalario(){
        return salarioBruto = salarioBruto + (salarioBruto * aumento/ 100);
    }
}
