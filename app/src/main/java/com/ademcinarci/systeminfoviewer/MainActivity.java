package com.ademcinarci.systeminfoviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button show;
    TextView systemText;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show = findViewById(R.id.showInfo);
        systemText = findViewById(R.id.systemText);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Serial = ("Serial :" + Build.SERIAL);
                String Model = ("Model :" + Build.MODEL);
                String ID = ("ID :" + Build.ID);
                String Manufacturer = ("Manufacturer :" + Build.MANUFACTURER);
                String Brand = ("Brand :" + Build.BRAND);
                String Type = ("Type :" + Build.TYPE);
                String User = ("User :" + Build.USER);
                String Base = ("Base :" + Build.VERSION_CODES.BASE);
                String INCREMENTAL = ("Incremental :" + Build.VERSION.INCREMENTAL);
                String SDK = ("SDK :" + Build.VERSION.SDK);
                String BOARD = ("Board :" + Build.BOARD);
                String HOST = ("Host :" + Build.HOST);
                String FINGERPRINT = ("Fingerprint :" + Build.FINGERPRINT);
                String versionCode = ("Version :" + Build.VERSION.RELEASE);

                systemText.setText(Serial+"\n"+ Model+"\n"+ ID+"\n"+ Manufacturer+"\n"+ Brand+"\n"+ Type+"\n"+ User+"\n"+ Base+"\n"+ INCREMENTAL+"\n"+SDK+"\n"+BOARD+"\n"+HOST+"\n"+FINGERPRINT+"\n"+versionCode
                );
            }
        });

    }
}