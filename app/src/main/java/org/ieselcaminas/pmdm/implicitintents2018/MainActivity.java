package org.ieselcaminas.pmdm.implicitintents2018;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonBrowser = findViewById(R.id.buttonBrowser);
        buttonBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.example.com"));
                startActivity(intent);
            }
        });

        Button buttonPhone = findViewById(R.id.buttonPhone);
        buttonPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:9510300000"));
                startActivity(intent);
            }
        });
    }
}
