package br.com.notificacao.maxwell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.onesignal.OneSignal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OneSignal.startInit(this).init();
    }
}
