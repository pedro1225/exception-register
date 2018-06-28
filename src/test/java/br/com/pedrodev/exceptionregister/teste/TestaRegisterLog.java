package br.com.pedrodev.exceptionregister.teste;

import java.util.Calendar;

import br.com.pedrodev.exceptionregister.util.FormatDate;
import br.com.pedrodev.exceptionregister.util.FormatTime;

public class TestaRegisterLog {
	public static void main(String[] args) {
		
		Calendar a = Calendar.getInstance();
		System.out.println(FormatDate.getDate(a));
		System.out.println(FormatTime.getTime(a));
	}
}
