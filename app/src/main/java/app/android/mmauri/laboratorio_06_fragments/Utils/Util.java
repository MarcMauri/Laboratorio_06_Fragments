package app.android.mmauri.laboratorio_06_fragments.Utils;

import android.graphics.Color;
import android.support.v7.app.ActionBar;

import java.util.ArrayList;
import java.util.Random;

import app.android.mmauri.laboratorio_06_fragments.Models.Mail;

/**
 * Created by marc on 11/6/17.
 */

public class Util {

    private static ArrayList<String> subjects = new ArrayList<String>() {{
        add("Cambio de cita");
        add("Fiesta en casa de Carlos");
        add("Ojo con LaCaixa");
        add("Falta de asistencia");
        add("Paddington");
        add("Google Pixel 2 XL");
        add("Android Studio");
        add("Laboratorio 6 costoso");
        add("El senor de los membrillos");
        add("Emilio sin mas");
    }};

    private static ArrayList<String> messages = new ArrayList<String>() {{
        add("En vista de los acontecimientos, el dia de manana no sera posible realizar la entrevista para el puesto de trabajo. Le llamaremos tan pronto tengamos una sala para la proxima semana");
        add("Hola amigos,\nEl lunes de la semana que viene tenemos que prepararle a Carlos un fiestuki. Yo he pensado en ir a la bolera.\nSugerencias?");
        add("Ha habido un chivatazo recientemente. Se cuenta que CAIXABANK ha enviado papeletas sobre el referendum a sus clientes. Dejen de confiar en ellos.");
        add("Querido trabajador,\n\nLe escribimos para informarle que debe presentar los justificantes pertinentes acerca de sus repetidas faltas de asistencia.\n\nAtentamente,\nEnsolta2000 SLA");
        add("El escritor Michael Bond ha publicado el mini-libro PADDINGTONG para los mas peques. Pueden hacerse con una copia con un McMenu en el estado de Utah, Estados Unidos.");
        add("Estimado cliente,\n\nYa hemos procesado su peticion para resolver sus dudas acerca de los pagos. En las proximas horas nos pondremos en contacto con usted.\n\nAtentamente,\nSoporte Google Store");
        add("Existe una actualizacion para Linux de una de las dependencias de Android Studio 3.0. Acuerdese de iniciar el programa con derechos de administracion.");
        add("El laboratorio 6 referente a Fragments del curso de Android se ha resistido bastante a la hora de vincular la lista con el detalle.\nResulto ser que llamaba a onClickListener en lugar de onItemClickListener.\nMuy contentos de haberlo logrado con la ayuda de la sesion explicativa.");
        add("Toston de pelicula senores. Manana dia libre.");
        add("Un email mas para rellenar la lista de emails. Con esto termino la sesion de hoy.");
    }};

    private static ArrayList<String> senders = new ArrayList<String>() {{
        add("oscar@gmail.com");
        add("eusebio@gmail.com");
        add("karlos34@gmail.com");
        add("osvaldo@gmail.com");
        add("edgar.torres@gmail.com");
        add("tania.estrada@gmail.com");
        add("omniopoelso@gmail.com");
        add("marcus@gmail.com");
        add("criticas@carteleras.es");
        add("email@example.com");
    }};

    public static ArrayList<Mail> getDummyData() {
        return new ArrayList<Mail>() {{
            for (int i = 0; i < subjects.size() && i < messages.size() && i < senders.size(); ++i) {
                add (new Mail(subjects.get(i), messages.get(i), senders.get(i)));
            }
        }};
    }

    public static int getRandomColor() {
        Random rand = new Random();
        return Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
    }

    /* Extra por comidad y limpieza de codigo */
    public static void showIconOnActionBar(ActionBar actionBar, int iconResource) {
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(iconResource);
    }
}