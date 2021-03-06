package com.example.qrcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button generateQRbtn,scanQrbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        generateQRbtn=findViewById(R.id.idbtnGeneratorQR);
        scanQrbtn=findViewById(R.id.idbtnScannerrQR);

        generateQRbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeActivity.this,GenerateQrcodeAct.class);
                startActivity(i);


            }
        });

        scanQrbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeActivity.this,ScaneQrCodeAct.class);
                startActivity(i);

            }
        });

    }
}