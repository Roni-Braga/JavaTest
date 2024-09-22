package model;

public class Secretario extends Funcionario {

    public Secretario(String nome, String cargo, double salarioBase, String dataContratacao) {
        super(nome, "Secretário", 7000, dataContratacao);

    }

    public double calcularSalario(int mes, int ano) {
        return salarioBase + anoServico(0.2 * salarioBase);

    }

}
