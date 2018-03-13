package com.example.cjsrn.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;


public class Festival1Activity extends AppCompatActivity {
    FloatingActionButton flm, flh, flc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festival1);

        FloatingActionButton flm = (FloatingActionButton) findViewById(R.id.fl_m);
        FloatingActionButton flc = (FloatingActionButton) findViewById(R.id.fl_c);
        FloatingActionButton flh = (FloatingActionButton) findViewById(R.id.fl_h);


        flc.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:041-746-8795"));
                startActivity(intent);
            }
        });

        flh.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri
                        .parse(
                                "http://gotgam.nonsan.go.kr/index.php");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);

                startActivity(intent);
            }
        });

        flm.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri
                        .parse(
                                "http://map.naver.com/?query=%EC%B6%A9%EC%B2%AD%EB%82%A8%EB%8F%84+%EB%85%BC%EC%82%B0%EC%8B%9C+%EC%96%91%EC%B4%8C%EB%A9%B4+%EC%96%91%EC%B4%8C%EB%A6%AC+454%EB%B2%88%EC%A7%80+%EC%B2%B4%EC%9C%A1%EA%B3%B5%EC%9B%90");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);

                startActivity(intent);
            }
        });

    }
}
