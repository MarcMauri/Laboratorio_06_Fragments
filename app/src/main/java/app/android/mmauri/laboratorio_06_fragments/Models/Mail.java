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

    public Mail(String subject, String message, String emailAddress, int color) {
        this.subject = subject;
        this.message = message;
        this.emailAddress = emailAddress;
        this.color = color;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
