package app.android.mmauri.laboratorio_06_fragments.Activities;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import app.android.mmauri.laboratorio_06_fragments.Fragments.DetailsFragment;
import app.android.mmauri.laboratorio_06_fragments.Fragments.ListFragment;
import app.android.mmauri.laboratorio_06_fragments.Models.Mail;
import app.android.mmauri.laboratorio_06_fragments.R;
import app.android.mmauri.laboratorio_06_fragments.Utils.Util;

public class MainActivity extends AppCompatActivity implements ListFragment.DataListener {

    private boolean isMultiPanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Util.showIconOnActionBar(getSupportActionBar(),R.mipmap.ic_myicon);

        setMultiPanel();
    }

    @Override
    public void sendMailDetails(Mail mail) {
        if (isMultiPanel) {
            DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
            detailsFragment.renderMail(mail);
        } else {
            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra("subject", mail.getSubject());
            intent.putExtra("sender", mail.getEmailAddress());
            intent.putExtra("message", mail.getMessage());
            startActivity(intent);
        }
    }

    private void setMultiPanel() {
        isMultiPanel = getSupportFragmentManager().findFragmentById(R.id.detailsFragment) != null;
    }
}
