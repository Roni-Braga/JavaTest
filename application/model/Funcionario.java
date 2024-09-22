package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public abstract class Funcionario {
    protected String nome;
    protected String cargo;
    protected double salarioBase;
    protected String dataContratacao;

    public Funcionario(String nome, String cargo, double salarioBase, String dataContratacao) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.dataContratacao = dataContratacao;
    }

}
