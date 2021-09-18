package qts.locadora.util;

import java.util.Calendar;
import java.util.Date;

public class DataUtil {

	public Date addDias(Date date, int quantidade_dias) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, quantidade_dias);
		return calendar.getTime();
	}
	
	public Date obterData(int dia, int mes, int ano) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, dia);
		calendar.set(Calendar.MONTH, mes -1);
		calendar.set(Calendar.YEAR, ano);
		return calendar.getTime();
	}
	
	public boolean verificarDatasIguais(Date data1, Date data2) {
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar .getInstance();
		
		calendar1.setTime(data1);
		calendar2.setTime(data2);
		
		return calendar1.YEAR == calendar2.YEAR
			&& calendar1.MONTH == calendar2.MONTH
			&& calendar1.DAY_OF_MONTH == calendar2.DAY_OF_MONTH; 
	}
	
}
