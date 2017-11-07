package app.android.mmauri.laboratorio_06_fragments.Adapters;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import app.android.mmauri.laboratorio_06_fragments.Models.Mail;
import app.android.mmauri.laboratorio_06_fragments.R;

/**
 * Created by marc on 11/7/17.
 */

public class MailAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Mail> mails;

    private final int SUBJECT_MAX_LENGHT = 40;
    private final int MESSAGE_MAX_LENGHT = 80;


    public MailAdapter(Context context, int layout, List<Mail> mails) {
        this.context = context;
        this.layout = layout;
        this.mails = mails;
    }

    @Override
    public int getCount() {
        return this.mails.size();
    }

    @Override
    public Object getItem(int position) {
        return this.mails.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        // Si es la primera vez
        if (convertView == null) {
            convertView = LayoutInflater.from(this.context).inflate(this.layout,null);
            holder = new ViewHolder();
            holder.textViewSender = (TextView) convertView.findViewById(R.id.textViewListSenderName);
            holder.textViewSubject = (TextView) convertView.findViewById(R.id.textViewListSubject);
            holder.textViewMessage = (TextView) convertView.findViewById(R.id.textViewListMessage);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        // Rellenamos los campos del layout con la info del mail actual
        Mail currentMail = this.mails.get(position);

        // Seleccionamos la primera letra del Sender
        holder.textViewSender.setText(currentMail.getEmailAddress().substring(0, 1));

        // Acortamos el Subject si es necesario
        String shortSubject = currentMail.getSubject();
        if (shortSubject.length() > SUBJECT_MAX_LENGHT)
            shortSubject = shortSubject.substring(0, SUBJECT_MAX_LENGHT) + "...";
        holder.textViewSubject.setText(shortSubject);

        // Acortamos el Message si es necesario
        String shortMessage = currentMail.getMessage().replace("\n"," ");
        if (shortMessage.length() > MESSAGE_MAX_LENGHT)
            shortMessage = shortMessage.substring(0, MESSAGE_MAX_LENGHT) + "...";
        holder.textViewMessage.setText(shortMessage);

        holder.textViewSender.getBackground().setColorFilter(currentMail.getColor(), PorterDuff.Mode.SRC);

        return convertView;
    }

    private class ViewHolder {
        private TextView textViewSender;
        private TextView textViewSubject;
        private TextView textViewMessage;
    }
}
