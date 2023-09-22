package com.thongle.friedhotel.friedhotel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class ManHinhKastelyszallo extends AppCompatActivity {
    TextView vissza;
    WebView kastelyszallowebv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_kastelyszallo);
        vissza = (TextView) findViewById(R.id.vissza);
        vissza.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent inmain = new Intent(ManHinhKastelyszallo.this, MainActivity.class);
                startActivity(inmain);
            }
        });
        kastelyszallowebv = (WebView)findViewById(R.id.kastelyszallowebv);
        kastelyszallowebv.setWebViewClient(new WebViewClient());
        kastelyszallowebv.loadUrl("https://www.friedhotel.hu/kastelyszallo.php");


    }



}
