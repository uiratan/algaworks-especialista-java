package com.algaworks.c12heranca.desafio1215rh;

import com.algaworks.c12heranca.desafio1215rh.model.Funcionario;
import com.algaworks.c12heranca.desafio1215rh.model.Holerite;
import com.algaworks.c12heranca.desafio1215rh.model.Programador;

public class Principal {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("João", 40);
		System.out.println(funcionario1);
		Holerite holerite1 = funcionario1.gerarHolerite(180, "jul/2022");
		holerite1.imprimir();

		System.out.println();

		Programador programador1 = new Programador("Maria", 80);
		programador1.setValorBonus(1000);
		System.out.println(programador1);
		Holerite holerite2 = programador1.gerarHolerite(180, "jul/2022");
		holerite2.imprimir();
	}

//	public static void main(String[] args) {
//		Funcionario funcionario = new Funcionario("Uiratan Cavalcante", 150.0);
//		System.out.println(funcionario);
//
//		Holerite holeriteF = funcionario.gerarHolerite(10, "jan/2024");
//		System.out.println(holeriteF);
//		holeriteF.imprimir();
//
//		Programador programador = new Programador("Uiratan Dev", 200.0);
//		programador.setValorBonus(500);
//		System.out.println(programador);
//
//		Holerite holeriteProgramador = programador.gerarHolerite(100, "dez/2023");
//		System.out.println(holeriteProgramador);
//		holeriteProgramador.imprimir();
//
//	}

}
