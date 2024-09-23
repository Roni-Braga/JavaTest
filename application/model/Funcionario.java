package model;

import java.time.LocalDate;

public abstract class Funcionario {
    protected String nome;
    protected String cargo;
    protected double salarioBase;
    protected LocalDate dataContratacao;

    public Funcionario(String nome, String cargo, double salarioBase, LocalDate dataContratacao) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.dataContratacao = dataContratacao;
    }

    abstract double calculoSalarioBeneficios();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

}
