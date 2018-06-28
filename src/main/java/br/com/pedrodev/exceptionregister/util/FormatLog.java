package br.com.pedrodev.exceptionregister.util;

public enum FormatLog {

	CERQUILHA("#####################################");

	private String valor;

	FormatLog(String format) {
		this.valor = format;
	}

	public String getValor() {
		return valor;
	}

}
