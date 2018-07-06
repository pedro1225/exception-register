package br.com.pedrodev.exceptionregister.io;

public final class LogConfig {

	private String srcLOG;

	/**
	 * 
	 * @return Caminho absoluto de onde est� sendo salvo o arquivo de LOG
	 */
	public String getSrcLOG() {
		return srcLOG;
	}

	/**
	 * 
	 * @param srcLOG
	 *            Caminho absoluto de onde ser� salvo o arquivo de LOG
	 */
	public void setSrcLOG(String srcLOG) {
		this.srcLOG = srcLOG;
	}

	public LogConfig(String srcLOG) {
		setSrcLOG(srcLOG);
	}

	public LogConfig() {

	}

}
