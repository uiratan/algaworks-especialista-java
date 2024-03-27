package com.algaworks.c24classesAninhadas.classesAninhadasEstaticas.exemplo1;

public class ServicoEmail {

	@SuppressWarnings("unused")
	private String teste;
	
	public void enviar(Mensagem mensagem) {
		System.out.printf("Enviando de %s para %s: %s%n",
				mensagem.remetente, mensagem.getDestinatario(), mensagem.getTexto());
	}

	public static String gerarAssinatura() {
		return "\n--\nAlgaworks";
	}

	public static class Mensagem {

		private final String remetente;
		private final String destinatario;
		private final String texto;

		public Mensagem(String remetente, String destinatario, String texto) {
			this.remetente = remetente;
			this.destinatario = destinatario;
			this.texto = texto;
		}

		public String getRemetente() {
			return remetente;
		}

		public String getDestinatario() {
			return destinatario;
		}

		public String getTexto() {
			return texto + gerarAssinatura();
		}

	}

}