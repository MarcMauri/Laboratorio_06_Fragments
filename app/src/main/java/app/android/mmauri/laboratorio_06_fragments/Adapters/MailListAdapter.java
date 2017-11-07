package app.android.mmauri.laboratorio_06_fragments.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import app.android.mmauri.laboratorio_06_fragments.Models.Mail;
import app.android.mmauri.laboratorio_06_fragments.R;

/**
 * Created by marc on 11/7/17.
 */

public class MailListAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Mail> mails;


    public MailListAdapter(Context context, int layout, List<Mail> mails) {
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
            holder.textViewSender = (TextView) convertView.findViewById(R.id.textViewSender);
            holder.textViewSubject = (TextView) convertView.findViewById(R.id.textViewSubject);
            holder.textViewMessage = (TextView) convertView.findViewById(R.id.textViewMessage);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        // Rellenamos los campos del layout con la info del mail actual
        Mail currentMail = this.mails.get(position);
        holder.textViewSender.setText(currentMail.getEmailAddress());
        holder.textViewSubject.setText(currentMail.getSubject());
        holder.textViewMessage.setText(currentMail.getMessage());
        holder.textViewSender.setBackgroundColor(currentMail.getColor());

        return convertView;
    }

    private class ViewHolder {
        private TextView textViewSender;
        private TextView textViewSubject;
        private TextView textViewMessage;
    }
}
