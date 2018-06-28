package br.com.pedrodev.exceptionregister.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

import br.com.pedrodev.exceptionregister.util.FormatDate;
import br.com.pedrodev.exceptionregister.util.FormatLog;

public class ExceptionLogRegister {

	private ConfigLog config;

	public ExceptionLogRegister(ConfigLog configLog) {
		this.config = configLog;
	}

	/**
	 * Salva os dados da exceção no arquivo de LOG
	 * 
	 * @param exception
	 *            Exceção a ser salva no arquivo de LOG
	 */
	public void registerLog(Exception exception) {

		File caminho = new File(getConfig().getSrcLOG());
		BufferedWriter writer = null;
		
		try {
			
			writer = new BufferedWriter(new FileWriter(caminho,true));
			writer.write("\n\n");
			writer.write(FormatLog.CERQUILHA.getValor()+"\n");
			writer.write("Data : "+FormatDate.getDate(Calendar.getInstance())+"\n");
			writer.write("Tipo da Exceção : "+exception.getClass().getSimpleName()+"\n");
			writer.write("Mensagem da Exceção : "+exception.getMessage()+"\n");
			//writer.write("Mensagem da Exceção : "+exception.get+"\n");
			
		} catch (IOException erro) {

			System.out.println("Erro ao tentar abrir arquivo de LOG\n"
					+ erro.getMessage());
		}
	}

	public ConfigLog getConfig() {
		return config;
	}

}
