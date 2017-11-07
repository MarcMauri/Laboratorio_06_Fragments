package app.android.mmauri.laboratorio_06_fragments.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import app.android.mmauri.laboratorio_06_fragments.Adapters.MailAdapter;
import app.android.mmauri.laboratorio_06_fragments.Models.Mail;
import app.android.mmauri.laboratorio_06_fragments.R;
import app.android.mmauri.laboratorio_06_fragments.Utils.Util;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

    private ListView listView;
    private List<Mail> mails;
    private MailAdapter adapter;

    private DataListener callback;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            callback = (DataListener) context;
        } catch (Exception e) {
            throw new ClassCastException(context.toString() + " should implement DataListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        callback = null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        this.listView = (ListView) view.findViewById(R.id.listViewMails);
        this.mails = Util.getDummyData();
        this.adapter = new MailAdapter(getContext(), R.layout.mail_list_item, mails);

        this.listView.setAdapter(adapter);

        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                sendMailDetails(mails.get(position));
            }
        });

        return view;
    }

    private void sendMailDetails(Mail mail) {
        this.callback.sendMailDetails(mail);
    }

    public interface DataListener {
        void sendMailDetails(Mail mail);
    }
}
