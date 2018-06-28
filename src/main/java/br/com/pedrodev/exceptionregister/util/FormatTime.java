package br.com.pedrodev.exceptionregister.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatTime {

	public static String getTime(Calendar cal) {

		cal.add(Calendar.DATE, 1);
		Date date = cal.getTime();
		SimpleDateFormat format1 = new SimpleDateFormat("HH-mm-ss");
		String data = null;

		try {
			data = format1.format(date);
		} catch (Exception erro) {
			System.out.println("Erro ao converter hora " + erro.getMessage());
		}

		return data;
	}
}
