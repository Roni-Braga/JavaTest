package model;

import java.time.LocalDate;

public class Gerente extends Funcionario {

    public Gerente(String nome, LocalDate dataContratacao) {
        super(nome, "Gerente", 20000, dataContratacao);

    }

    @Override
    public double calculoSalarioBeneficios() {
        // Contabilizando quanto tempo de serviço o funcionatio tem na empresa
        LocalDate dataAtual = LocalDate.now();
        int tempoServico = dataAtual.getYear() - dataContratacao.getYear();

        // total do salario mais os beneficios
        double beneficio = 3000 * tempoServico;
        double beneficioMaisSalario = salarioBase + beneficio;
        return beneficioMaisSalario;

    }

}
