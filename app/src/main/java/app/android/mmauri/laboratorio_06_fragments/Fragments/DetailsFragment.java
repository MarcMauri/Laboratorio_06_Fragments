package app.android.mmauri.laboratorio_06_fragments.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import app.android.mmauri.laboratorio_06_fragments.Models.Mail;
import app.android.mmauri.laboratorio_06_fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {

    private TextView subject;
    private TextView sender;
    private TextView message;
    private LinearLayout wrapper;

    public DetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        this.subject = (TextView) view.findViewById(R.id.textViewFragmentSubject);
        this.sender = (TextView) view.findViewById(R.id.textViewFragmentSenderName);
        this.message = (TextView) view.findViewById(R.id.textViewFragmentMessage);
        this.wrapper = (LinearLayout) view.findViewById(R.id.fragmentDetailsMailWrapper);

        return view;
    }

    public void renderMail(Mail mail) {
        this.wrapper.setVisibility(View.VISIBLE);
        this.subject.setText(mail.getSubject());
        this.sender.setText(mail.getEmailAddress());
        this.message.setText(mail.getMessage());
    }
}
