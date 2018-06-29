package br.com.pedrodev.exceptionregister.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatDate {

	public static String getDate(Calendar cal) {

		cal.add(Calendar.DATE, 0);
		Date date = cal.getTime();
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		String data = null;

		try {
			data = format1.format(date);
		} catch (Exception erro) {
			System.out.println("Erro ao converter data " + erro.getMessage());
		}

		return data;
	}

}
