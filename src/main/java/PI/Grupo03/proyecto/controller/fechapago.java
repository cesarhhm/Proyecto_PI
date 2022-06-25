package PI.Grupo03.proyecto.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class fechapago {


	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		List<Date> lstfecha = fechapago.listaFechaPago(2022);
		for (Date date : lstfecha) {
			System.out.println(sdf.format(date));
		}
		
		
	}
	public static List<Date> listaFechaPago(int anio){
		int[] ultimoDiasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		//En los a�os bisiestos el mes de febrero tiene 29 d�as
		if ((anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0)) {
			ultimoDiasMes[1] = 29;
		}

		ArrayList<Date> fechasPago = new ArrayList<Date>();
		
		Calendar objCalendar = Calendar.getInstance();
		for (int i = 0; i < ultimoDiasMes.length; i++) {
			objCalendar.set(Calendar.YEAR, anio);
			objCalendar.set(Calendar.MONTH, i);
			objCalendar.set(Calendar.DAY_OF_MONTH, ultimoDiasMes[i]);
			
			//Si es sabado o domingo pagar� el viernes se retrocede unos d�as
			if (objCalendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				objCalendar.set(Calendar.DAY_OF_MONTH, ultimoDiasMes[i]-1);
			}else if (objCalendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
				objCalendar.set(Calendar.DAY_OF_MONTH, ultimoDiasMes[i]-2);
			}
			
			Date fechaCambiada =  objCalendar.getTime();
			fechasPago.add(fechaCambiada);
		}

		return fechasPago;
	}

}

