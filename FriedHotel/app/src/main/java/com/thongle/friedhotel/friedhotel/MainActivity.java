package com.thongle.friedhotel.friedhotel;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   ConstraintLayout manhinh;
    TextView kastelyszallorol;
    TextView ajanlat;
    TextView kapcsolat2;
    TextView hirek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manhinh = (ConstraintLayout) findViewById(R.id.manhinh);
        kastelyszallorol = (TextView) findViewById(R.id.kastelyszallorol);
        kastelyszallorol.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent inkastelyszallo = new Intent(MainActivity.this, ManHinhKastelyszallo.class);
                startActivity(inkastelyszallo);
            }
        });
        ajanlat = (TextView) findViewById(R.id.ajanlat);
        ajanlat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.friedhotel.hu/kastelyszalloda");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        kapcsolat2 = (TextView) findViewById(R.id.kapcsolat2);
        kapcsolat2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent inkapcsolat  = new Intent(MainActivity.this, ManHinhKapcsolat.class);
                startActivity(inkapcsolat);
            }
        });
        hirek = (TextView)findViewById(R.id.hirek);
        hirek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inhirek = new Intent(MainActivity.this, ManHinhHirek.class);
                startActivity(inhirek);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
