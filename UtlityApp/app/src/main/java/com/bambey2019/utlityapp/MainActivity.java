package com.bambey2019.utlityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boutonCall = (Button) findViewById(R.id.btnCall);
        boutonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:77774229619"));
                startActivity(intent);
            }
        });

        Button boutonSms= (Button) findViewById(R.id.btnSms);
        boutonSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intentSms = new Intent(Intent.ACTION_SENDTO);
                intentSms.setData(Uri.parse("smsto:" + Uri.encode("778060742")));
                intentSms.putExtra("sms_body", "slt Bambey");
                startActivity(intentSms);

            }
        });

        Button autreActivity = (Button) findViewById(R.id.button5);
        autreActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intentAutre = new Intent(getApplicationContext(), AutreActivity.class);
                startActivity(intentAutre);
                finish();
            }
        });
    }

}
