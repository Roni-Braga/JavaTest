package model;

import java.util.List;

public class Financeiro {
    public double calcularTotalSalarioBeneficio(List<Funcionario> funcionarios) {
        double total = 0;
        for (Funcionario func : funcionarios) {
            total += func.calculoSalarioBeneficios();
        }
        return total;
    }

    public double calcularTotalSalarios(List<Funcionario> funcionarios) {
        double total = 0;
        for (Funcionario func : funcionarios) {
            total += func.salarioBase; // Salário base sem benefícios
        }
        return total;
    }

    public double calcularTotalBeneficios(List<Funcionario> funcionarios) {
        double total = 0;
        for (Funcionario func : funcionarios) {
            if (!(func instanceof Gerente)) { // Gerentes não têm benefícios
                total += func.calculoSalarioBeneficios() - func.salarioBase;
            }
        }
        return total;
    }

    public Funcionario funcionarioComMaiorSalario(List<Funcionario> funcionarios) {
        Funcionario maiorSalarioFuncionario = null;
        double maiorSalario = 0;
        for (Funcionario func : funcionarios) {
            double salario = func.calculoSalarioBeneficios();
            if (salario > maiorSalario) {
                maiorSalario = salario;
                maiorSalarioFuncionario = func;
            }
        }
        return maiorSalarioFuncionario;
    }

    public Funcionario funcionarioComMaiorBeneficio(List<Funcionario> funcionarios) {
        Funcionario maiorBeneficioFuncionario = null;
        double maiorBeneficio = 0;
        for (Funcionario func : funcionarios) {
            if (!(func instanceof Gerente)) { // Gerentes não têm benefícios
                double beneficio = func.calculoSalarioBeneficios() - func.salarioBase;
                if (beneficio > maiorBeneficio) {
                    maiorBeneficio = beneficio;
                    maiorBeneficioFuncionario = func;
                }
            }
        }
        return maiorBeneficioFuncionario;
    }

}
