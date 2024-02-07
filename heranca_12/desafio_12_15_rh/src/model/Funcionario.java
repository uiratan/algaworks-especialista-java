package model;

import java.util.Objects;

public class Funcionario {
	private String nome;
	private double valorHora;

	public Funcionario(String nome, double valorHora) {
		this.nome = nome;
		this.valorHora = valorHora;
	}

	public String getNome() {
		Objects.requireNonNull(nome);
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		if (valorHora < 0) {
			throw new IllegalArgumentException("Valor da hora deve ser maior que 0");
		}

		this.valorHora = valorHora;
	}

	protected double calcularSalario(int horasTrabalhadas) {
		return horasTrabalhadas * getValorHora();
	}

	public Holerite gerarHolerite(int horasTrabalhadas, String mesAno) {
		double valorSalario = calcularSalario(horasTrabalhadas);
		return new Holerite(getNome(), mesAno, valorSalario);
	}

	@Override
	public String toString() {
		return "Funcionario{" +
				"nome='" + nome + '\'' +
				", valorHora=" + valorHora +
				'}';
	}
}
