import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import model.Financeiro;
import model.Funcionario;
import model.Gerente;
import model.Secretario;
import model.Vendedor;

public class Empresa {
    public static void main(String[] args) {
        Secretario secretario = new Secretario("Jorge Carvalho", LocalDate.of(2018, 01, 1));
        Secretario secretario1 = new Secretario("Maria Souza", LocalDate.of(2015, 12, 1));
        Vendedor vendedor = new Vendedor("Ana Silva", LocalDate.of(2021, 12, 1), 5200);
        Vendedor vendedor1 = new Vendedor("João Mendes", LocalDate.of(2021, 12, 1), 5200);
        Gerente gerente = new Gerente("Juliana Alves", LocalDate.of(2017, 07, 1));
        Gerente gerente1 = new Gerente("Bento Albino", LocalDate.of(2014, 03, 1));

        List<Funcionario> funcionarios = Arrays.asList(secretario, vendedor, gerente, secretario1, vendedor1, gerente1);
        System.out.println(funcionarios);
        Financeiro financeiro = new Financeiro();
        double totalPago = financeiro.calcularTotalSalarioBeneficio(funcionarios);
        System.out.println("Total pago " + totalPago);

        double totalPagoSalario = financeiro.calcularTotalSalarios(funcionarios);
        System.out.println("Total pago em salario a todos os funcionários: " + totalPagoSalario);

        double totalPagoBeneficios = financeiro.calcularTotalBeneficios(funcionarios);
        System.out.println("Total pago em beneficios aos funcionários " + totalPagoBeneficios);

        Funcionario maiorSalarioFuncionario = financeiro.funcionarioComMaiorSalario(funcionarios);
        System.out.println("Funcionário com maior salário: " + maiorSalarioFuncionario.getNome());

        Funcionario maiorBeneFuncionario = financeiro.funcionarioComMaiorBeneficio(funcionarios);
        System.out.println("Funcionario com mais beneficios " + maiorBeneFuncionario.getNome());

    }
}
