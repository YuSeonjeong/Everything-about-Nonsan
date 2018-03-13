package com.example.cjsrn.myapplication;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class Food2Activity extends AppCompatActivity {

    ImageView btn1,btn2,btn3,f1,f2,foo1,foo2,foo3,foo4;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food2);

        final Spinner spinner = (Spinner)findViewById(R.id.spinner1);

        btn1 = (ImageView) findViewById(R.id.btn1);
        btn3 = (ImageView) findViewById(R.id.btn3);
        btn = (Button) findViewById(R.id.btn);
        foo1 = (ImageView) findViewById(R.id.foo1);
        foo2 = (ImageView) findViewById(R.id.foo2);
        foo3 = (ImageView) findViewById(R.id.foo3);
        foo4 = (ImageView) findViewById(R.id.foo4);

        foo4.setVisibility(View.INVISIBLE); // 숨기기
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), FoodActivity.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), Food3Activity.class);
                startActivity(intent);
            }
        });

        ArrayAdapter adapter = ArrayAdapter.createFromResource
                (this, R.array.locate,
                        android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);



        btn.setOnClickListener(new View.OnClickListener() { // ImageButton을 Click시 AlertDialog가 생성되도록 아래과 같이 설계
            @Override
            public void onClick(View v) {

                String text = spinner.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(),"선택 지역 : "+text,Toast.LENGTH_SHORT).show();

                if (text.equals("논산 시내권")) {
                    foo4.setVisibility(View.VISIBLE);  // 보이기

                    foo1.setVisibility(View.INVISIBLE); // 숨기기
                    foo2.setVisibility(View.INVISIBLE); // 숨기기
                    foo3.setVisibility(View.INVISIBLE); // 숨기기
                }

                if (text.equals("건양대학교 주변")) {
                    foo1.setVisibility(View.VISIBLE);  // 보이기
                    foo2.setVisibility(View.VISIBLE); // 숨기기
                    foo3.setVisibility(View.VISIBLE); // 숨기기
                    foo4.setVisibility(View.INVISIBLE); // 숨기기
                }

            }});}}