package com.example.cjsrn.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Sigh3Activity extends AppCompatActivity {

    ImageView icon1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigh3);

        ImageView icon1 = (ImageView) findViewById(R.id.icon1);

        icon1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), Sigh3_1Activity.class);
                startActivity(intent);
            }
        });
    }
}
