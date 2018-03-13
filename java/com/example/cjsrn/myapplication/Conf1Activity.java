package com.example.cjsrn.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ViewFlipper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import com.example.cjsrn.myapplication.R;

public class Conf1Activity extends AppCompatActivity implements OnClickListener {
    /** Called when the activity is first created. */
    FloatingActionButton call;
    ImageView cc1, cc2;

    Button left, right;
    ViewFlipper view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conf1);

        FloatingActionButton call = (FloatingActionButton) findViewById(R.id.call);
        cc1 = (ImageView) findViewById(R.id.cc1);
        cc2 = (ImageView) findViewById(R.id.cc2);

        left = (Button) findViewById(R.id.button1);
        right = (Button) findViewById(R.id.button2);
        view = (ViewFlipper) findViewById(R.id.viewFlipper1);

        left.setOnClickListener(this);
        right.setOnClickListener(this);

        // 특정 먼저 실행할 부분 설정 플리퍼에 설정한페이지는 처음부터 0으로 시작
        // view.setDisplayedChild(2);

        call.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:041-735-1215"));
                startActivity(intent);
            }
        });

        cc2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), Conf1_1Activity.class);
                startActivity(intent);
            }
        });


        cc1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), Conf1_2Activity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

        if (v == right) {

            view.showNext();

        } else if (v == left) {

            view.showPrevious();
        }

    }
}