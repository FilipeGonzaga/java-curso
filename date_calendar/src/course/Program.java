package course;


import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance(); 
		cal.setTime(d);	
		//Adicionando horas ( Pode ser adicionado outros valores etc)
		/*cal.add(Calendar.HOUR_OF_DAY, 4); 
		d = cal.getTime(); */
		
		//Selecionar dados para exibição
		int minutes = cal.get(Calendar.MINUTE);
		
		//Selecionando mes
		int month = 1 + cal.get(Calendar.MONTH);

		System.out.println(sdf.format(d));
		System.out.println("MINUTES: " + minutes);
		System.out.println("MONTH: " + month);
	}

}
