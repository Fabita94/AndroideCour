package com.bambey2019.threadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AsyncTaskImageDownloader imgDownload = new AsyncTaskImageDownloader(this);
        imgDownload.execute("https://image.freepik.com/vecteurs-libre/ensemble-fleurs-differentes_1308-28536.jpg");
    }
}
