package com.thongle.friedhotel.friedhotel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class ManHinhKapcsolat extends AppCompatActivity {
    Button vissza;
    WebView kapcsolat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_kapcsolat);
        vissza = (Button) findViewById(R.id.vissza);
        vissza.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent inmain = new Intent(ManHinhKapcsolat.this, MainActivity.class);
                startActivity(inmain);
            }
        });
        kapcsolat = (WebView)findViewById(R.id.kapcsolat);
        kapcsolat.setWebViewClient(new WebViewClient());
        kapcsolat.loadUrl("https://www.friedhotel.hu/kapcsolat.php");
    }
}
