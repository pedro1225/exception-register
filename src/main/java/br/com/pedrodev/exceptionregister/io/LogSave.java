package br.com.pedrodev.exceptionregister.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Calendar;

import br.com.pedrodev.exceptionregister.util.FormatDate;
import br.com.pedrodev.exceptionregister.util.FormatLog;
import br.com.pedrodev.exceptionregister.util.FormatTime;

public class LogSave {

	private LogConfig config;

	public LogSave(LogConfig configLog) {
		this.config = configLog;
	}

	/**
	 * Salva os dados da exceção no arquivo de LOG
	 * 
	 * @param exception
	 *            Exceção a ser salva no arquivo de LOG
	 */
	public void save(Exception exception) {

		File caminho = new File(getConfig().getSrcLOG());
		StringBuilder builder = new StringBuilder();

		try (FileOutputStream writer = new FileOutputStream(caminho, true);
				FileWriter fw = new FileWriter(caminho, true)) {

			builder.append(FormatLog.CERQUILHA.getValor() + "\n");
			builder.append("Data : " + FormatDate.getDate(Calendar.getInstance()) + "\n");
			builder.append("Horario : " + FormatTime.getTime(Calendar.getInstance()) + "\n");
			builder.append("Tipo da Exceção : " + exception.getClass().getSimpleName() + "\n");
			builder.append("Mensagem da Exceção : " + exception.getMessage() + "\n");
			builder.append("Mensagem da Exceção Completa : ");
			fw.write(builder.toString());
			fw.flush();
			exception.printStackTrace(new PrintStream(writer, true));
			fw.write("\n");

			System.out.println("Exceção Registrada -> " + caminho);
		} catch (IOException erro) {
			System.out.println("Erro ao Tentar Registrar Exceção \n" + erro.getMessage());
		}
	}

	public LogConfig getConfig() {
		return config;
	}

}
