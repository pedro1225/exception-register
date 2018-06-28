package br.com.pedrodev.exceptionregister.io;

public final class ConfigLog {

	private String srcLOG;

	/**
	 * 
	 * @return Caminho absoluto de onde está sendo salvo o arquivo de LOG
	 */
	public String getSrcLOG() {
		return srcLOG;
	}

	/**
	 * 
	 * @param srcLOG
	 *            Caminho absoluto de onde será salvo o arquivo de LOG
	 */
	public void setSrcLOG(String srcLOG) {
		this.srcLOG = srcLOG;
	}

}
