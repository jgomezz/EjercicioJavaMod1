package pe.edu.tecsup.lab03._10.util.ejervivios;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FechaUtil {

    final static String FORMAT_DATE = "dd/MM/YYYY";

    public static String obtenerFechaActual() {

        Calendar calendar = GregorianCalendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_DATE);

        return sdf.format(calendar.getTime());

    }
}
