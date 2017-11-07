package app.android.mmauri.laboratorio_06_fragments.Activities;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import app.android.mmauri.laboratorio_06_fragments.R;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MailListFragment mailListFragment = (MailListFragment) getSupportFragmentManager().findFragmentById(R.id.listFragment);
    }

}
