package Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rafael
 */
public class DataHoraUtil {

    public static Date stringToDate(String s) {
        final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = format.parse(s);
        } catch (ParseException ex) {
        }
        return date;
    }

    public static String dateToString(Date data) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        String s = convert(day) + "/" + convert(month) + "/" + convert(year);
        return s;
    }

    private static String convert(int i) {
        String toReturn = "";
        if (i < 10) {
            toReturn = "0";
        }
        toReturn += String.valueOf(i);

        return toReturn;
    }

    public static String meiaHoraAntes(String hora) {
        String[] splittedHour = hora.split(":");
        String newHour;
        if (splittedHour[1].equals("30")) {
            return splittedHour[0].concat(":00");
        }
        Integer aux = Integer.parseInt(splittedHour[0]) - 1;
        return aux.toString().concat(":30");

    }

    public static String meiaHoraDepois(String hora) {
        String[] splittedHour = hora.split(":");
        String newHour;
        if (splittedHour[1].equals("30")) {
            Integer aux = Integer.parseInt(splittedHour[0]) + 1;
            return aux.toString().concat(":00");
        }
        return splittedHour[0].concat(":30");
    }

    public static Date pegarDataProximoDia() {
        Date d = Date.from(Instant.now());
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.DAY_OF_YEAR, 1);
        return c.getTime();
    }

    public static Boolean validarHora(String hora) {
        return hora.matches("^\\d{2}\\:\\d{2}$");

    }

}
