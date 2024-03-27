package com.algaworks.c24classesAninhadas.classesLocais;

import java.math.BigDecimal;

public interface Transacao {

	BigDecimal getValorTotal();
	void reembolsar();

}