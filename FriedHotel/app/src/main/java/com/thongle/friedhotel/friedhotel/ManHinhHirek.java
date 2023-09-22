package com.thongle.friedhotel.friedhotel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ManHinhHirek extends AppCompatActivity {
    WebView hirek2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_hirek);
        hirek2 = (WebView)findViewById(R.id.hirek2);
        hirek2.setWebViewClient(new WebViewClient());
        hirek2.loadUrl("https://www.friedhotel.hu/hirek.php");
    }
}
