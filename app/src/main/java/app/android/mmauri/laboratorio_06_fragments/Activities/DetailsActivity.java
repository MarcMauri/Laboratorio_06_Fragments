package app.android.mmauri.laboratorio_06_fragments.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.android.mmauri.laboratorio_06_fragments.Fragments.DetailsFragment;
import app.android.mmauri.laboratorio_06_fragments.Models.Mail;
import app.android.mmauri.laboratorio_06_fragments.R;
import app.android.mmauri.laboratorio_06_fragments.Utils.Util;

public class DetailsActivity extends AppCompatActivity {

    private String subject;
    private String sender;
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Util.showIconOnActionBar(getSupportActionBar(),R.mipmap.ic_myicon);

        if (getIntent().getExtras() != null) {
            subject = getIntent().getStringExtra("subject");
            sender = getIntent().getStringExtra("sender");
            message = getIntent().getStringExtra("message");
        }

        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
        detailsFragment.renderMail(new Mail(subject, message, sender));

    }
}
