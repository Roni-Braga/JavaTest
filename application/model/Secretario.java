package model;

import java.time.LocalDate;

public class Secretario extends Funcionario {

    public Secretario(String nome, LocalDate dataContratacao) {
        super(nome, "Secretário", 7000, dataContratacao);
    }

    public double calculoSalarioBeneficios() {
        // Contabilizando quanto tempo de serviço do funcionatio tem na empresa
        LocalDate dataAtual = LocalDate.now();
        int tempoServico = dataAtual.getYear() - dataContratacao.getYear();

        // total do salario mais os beneficios
        double beneficio = 1000 * tempoServico + (0.20 * salarioBase);
        double beneficioMaisSalario = salarioBase + beneficio;
        return beneficioMaisSalario;

    }

}
