package com.example.cjsrn.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ConfucianismActivity extends AppCompatActivity {

    ImageView c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confucianism);


        c1 = (ImageView) findViewById(R.id.c1);


        c1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), Conf1Activity.class);
                startActivity(intent);
            }
        });
    }
}
