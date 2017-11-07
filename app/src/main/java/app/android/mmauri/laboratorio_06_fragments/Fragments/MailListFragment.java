package app.android.mmauri.laboratorio_06_fragments.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import app.android.mmauri.laboratorio_06_fragments.Activities.MainActivity;
import app.android.mmauri.laboratorio_06_fragments.Adapters.MailListAdapter;
import app.android.mmauri.laboratorio_06_fragments.Models.Mail;
import app.android.mmauri.laboratorio_06_fragments.R;
import app.android.mmauri.laboratorio_06_fragments.Utils.Util;

/**
 * A simple {@link Fragment} subclass.
 */
public class MailListFragment extends Fragment {

    private ListView listView;
    private List<Mail> mails;
    private MailListAdapter mailListAdapter;

    public MailListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mail_list_fragment, container, false);

        this.listView = (ListView) view.findViewById(R.id.listViewMails);

        this.mails = Util.getDummyData();
        this.mailListAdapter = new MailListAdapter(getContext(), R.layout.mail_list_item, mails);

        this.listView.setAdapter(mailListAdapter);

        return view;
    }
}
