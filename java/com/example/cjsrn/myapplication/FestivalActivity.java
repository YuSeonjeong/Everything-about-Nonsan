package com.example.cjsrn.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FestivalActivity extends AppCompatActivity {

    ImageView fe1,fe2,fe3,fe4,fe5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festival);


        fe1 = (ImageView) findViewById(R.id.fe1);
        fe2 = (ImageView) findViewById(R.id.fe2);
        fe3 = (ImageView) findViewById(R.id.fe3);
        fe4 = (ImageView) findViewById(R.id.fe4);
        fe5 = (ImageView) findViewById(R.id.fe5);

        fe1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), Festival1Activity.class);
                startActivity(intent);
            }
        });
    }
}
