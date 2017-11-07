package app.android.mmauri.laboratorio_06_fragments.Models;

import app.android.mmauri.laboratorio_06_fragments.Utils.Util;

/**
 * Created by marc on 11/6/17.
 */

public class Mail {

    private String subject;
    private String message;
    private String emailAddress;
    private int color;

    public Mail(String subject, String message, String emailAddress) {
        this.subject = subject;
        this.message = message;
        this.emailAddress = emailAddress;
        this.color = Util.getRandomColor();
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getColor() {
        return color;
    }

}
