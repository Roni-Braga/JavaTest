package model;

import java.time.LocalDate;

public class Vendedor extends Funcionario {
    private double valorVenda;

    public Vendedor(String nome, LocalDate dataContratacao, double valorVenda) {
        super(nome, "Vendedor", 12000, dataContratacao);
        this.valorVenda = valorVenda;

    }

    public double calculoSalarioBeneficios() {
        // Contabilizando quanto tempo de serviço o funcionatio tem na empresa
        LocalDate dataAtual = LocalDate.now();
        int tempoServico = dataAtual.getYear() - dataContratacao.getYear();

        // total do salario mais os beneficios
        double beneficio = 1800 * tempoServico + (0.30 * valorVenda);
        double totalBeneficioSalario = salarioBase + beneficio;
        return totalBeneficioSalario;

    }

    public double calcularSalario() {
        // Contabilizando quanto tempo de serviço do funcionatio tem na empresa
        LocalDate dataAtual = LocalDate.now();
        int tempoServico = dataAtual.getYear() - dataContratacao.getYear();

        // total do salario
        double AnoServico = 1800 * tempoServico;
        double TotalSalario = salarioBase + AnoServico;
        return TotalSalario;

    }

}
