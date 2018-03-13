package com.example.cjsrn.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class SightseeingActivity extends AppCompatActivity implements TextWatcher {
    ImageView icon1,icon2,icon3,icon4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sightseeing);

        final AutoCompleteTextView autoComplete;
        String item[] = { "돈암서원","죽림서원","KT&G 상상마당","관촉사" };
        ImageView btn;

        icon1 = (ImageView) findViewById(R.id.icon1);
        icon2 = (ImageView) findViewById(R.id.icon2);
        icon3 = (ImageView) findViewById(R.id.icon3);
        icon4 = (ImageView) findViewById(R.id.icon4);
        btn = (ImageView) findViewById(R.id.button);
        autoComplete = (AutoCompleteTextView) findViewById(R.id.myautocomplete);
        autoComplete.addTextChangedListener(this);
        autoComplete.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, item));

        autoComplete.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String a = autoComplete.getText().toString();

                if (a.equals("돈암서원")) {

                    Intent intent0 = new Intent(SightseeingActivity.this,
                            Sigh2Activity.class);

                    startActivity(intent0);

                } else if (a.equals("죽림서원")) {
                    Intent intent0 = new Intent(SightseeingActivity.this,
                            Sigh2Activity.class);

                    startActivity(intent0);

                }
                else if (a.equals("KT&G 상상마당")) {
                    Intent intent0 = new Intent(SightseeingActivity.this,
                            Sigh2Activity.class);

                    startActivity(intent0);

                }
                else if (a.equals("관촉사")) {
                    Intent intent0 = new Intent(SightseeingActivity.this,
                            Sigh3_1Activity.class);

                    startActivity(intent0);

                }
                else {
                    Intent intent0 = new Intent(SightseeingActivity.this, MainActivity.class);

                    startActivity(intent0);
                }
            }

        });

        icon1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), Sigh1Activity.class);
                startActivity(intent);
            }
        });

        icon2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), Sigh2Activity.class);
                startActivity(intent);
            }
        });

        icon3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), Sigh3Activity.class);
                startActivity(intent);
            }
        });

        icon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri
                        .parse(
                                "http://blog.naver.com/PostThumbnailList.nhn?blogId=nscity&from=postList&categoryNo=16");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);

                startActivity(intent);
            }
        });

    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
